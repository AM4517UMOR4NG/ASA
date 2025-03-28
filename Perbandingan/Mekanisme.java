package Perbandingan;

/**
 * Kelas Mekanisme digunakan untuk mengukur kinerja algoritma pencarian
 */
public class Mekanisme {
    /**
     * Fungsi untuk membandingkan waktu eksekusi Binary Search dan Jump Search
     * 
     * @param n ukuran array dan nilai yang dicari
     */
    public static void compareSearches(int n) {
        int nilai = n;
        int[] arr = new int[n];

        // Membuat array terurut dari 1 hingga n
        for (int i = 0; i < n; i++) arr[i] = i + 1;

        double totalBinaryTime = 0, totalJumpTime = 0;

        // Jalankan 5 kali untuk mendapatkan rata-rata performa
        for (int i = 0; i < 5; i++) {
            long startBinary = System.nanoTime();
            Penyatuan.binarySearch(arr, nilai);
            long endBinary = System.nanoTime();
            totalBinaryTime += (endBinary - startBinary) / 1e6;

            long startJump = System.nanoTime();
            Penyatuan.jumpSearch(arr, nilai);
            long endJump = System.nanoTime();
            totalJumpTime += (endJump - startJump) / 1e6;
        }

        // Menghitung rata-rata waktu eksekusi
        double avgBinaryTime = totalBinaryTime / 5;
        double avgJumpTime = totalJumpTime / 5;

        // Menampilkan hasil dalam format tabel
        System.out.printf("| %-12d | %-12d | %-15.6f | %-15.6f |\n", n, nilai, avgBinaryTime, avgJumpTime);
    }
}
