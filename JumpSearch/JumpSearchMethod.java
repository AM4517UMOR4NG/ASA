package JumpSearch;

/**
 * JumpMethodInteractive.java
 *
 * Kelas ini menyediakan implementasi metode Jump Search secara interaktif.
 * Metode ini menampilkan langkah-langkah pencarian, mulai dari "melompat"
 * blok-blok
 * hingga pencarian linier dalam blok yang berpotensi mengandung target.
 *
 * Langkah-langkah:
 * 1. Tentukan ukuran blok: step = (int) Math.sqrt(n)
 * 2. Lakukan lompatan blok demi blok:
 * - Periksa elemen di akhir blok (arr[Math.min(step, n) - 1]).
 * - Jika elemen tersebut masih lebih kecil dari target, lompat ke blok
 * selanjutnya.
 * 3. Setelah menemukan blok yang potensial, lakukan pencarian linier di dalam
 * blok tersebut.
 * 4. Kembalikan indeks target jika ditemukan, atau -1 jika tidak ada.
 */
public class JumpSearchMethod {
    public static int jumpSearch(int[] arr, int x) {
        int n = arr.length;
        // Jika array kosong, langsung return -1
        if (n == 0) {
            return -1;
        }

        int step = (int) Math.sqrt(n); // ukuran blok awal
        int prev = 0;
        int iteration = 1;

        // Melompat blok demi blok untuk menemukan blok yang berpotensi mengandung
        // target
        while (prev < n && arr[Math.min(step, n) - 1] < x) {
            System.out.println("Iterasi " + iteration + ":");
            int indexToCheck = Math.min(step, n) - 1;
            System.out.println("  Memeriksa elemen di indeks " + indexToCheck
                    + " = " + arr[indexToCheck]);
            System.out.println("  Karena " + arr[indexToCheck] + " < " + x
                    + ", target belum di blok ini.");

            prev = step;
            step += (int) Math.sqrt(n);
            iteration++;

            if (prev >= n) {
                System.out.println("Sudah mencapai akhir array. Target tidak ditemukan.");
                return -1;
            }
            System.out.println();
        }

        System.out.println("\nTarget mungkin ada di blok dari indeks " + prev
                + " sampai " + (Math.min(step, n) - 1));
        System.out.println("Melakukan pencarian linier di dalam blok tersebut:");
        System.out.println();

        // Pencarian linier di dalam blok yang ditemukan
        for (int i = prev; i < Math.min(step, n); i++) {
            System.out.println("  Memeriksa indeks " + i + ": " + arr[i]);
            if (arr[i] == x) {
                System.out.println("  Target " + x + " ditemukan pada indeks " + i);
                return i;
            }
        }

        System.out.println("Target " + x + " tidak ditemukan dalam array.");
        return -1;
    }
}
