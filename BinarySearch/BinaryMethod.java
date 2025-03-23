package BinarySearch;

/**
 * BinaryMethod.java
 * 
 * Kelas ini menyediakan implementasi metode Binary Search.
 * Binary Search adalah algoritma pencarian yang bekerja pada array yang sudah terurut.
 * Algoritma ini membagi ruang pencarian secara berulang untuk menemukan target.
 *
 * Prinsip Kerja:
 * 1. Inisialisasi dua indeks: left (awal) dan right (akhir).
 * 2. Hitung indeks tengah: mid = left + (right - left) / 2.
 * 3. Bandingkan elemen di indeks mid dengan target:
 *    - Jika sama, kembalikan indeks mid.
 *    - Jika target lebih kecil, cari di bagian kiri (set right = mid - 1).
 *    - Jika target lebih besar, cari di bagian kanan (set left = mid + 1).
 * 4. Ulangi langkah 2-3 hingga target ditemukan atau interval pencarian habis.
 *
 * Kompleksitas Waktu: O(log n)
 */
public class BinaryMethod {
    public static int binarySearch(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            //Jika elemen di mid adalah target, kembalikan indeksnya
            if (arr[mid] == x)
                return mid;
            //Jika target lebih besar, abaikan bagian kiri
            else if (arr[mid] < x)
                left = mid + 1;
            //Jika target lebih kecil, abaikan bagian kanan
            else
                right = mid - 1;
        }
        //Target tidak ditemukan
        return -1;
    }
}
