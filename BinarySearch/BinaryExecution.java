package BinarySearch;

import java.util.Scanner;
import java.util.Arrays;

public class BinaryExecution {
    public static void main(String[] args) {
        Scanner binaryScanner = new Scanner(System.in);

        //Input jumlah elemen array (pastikan sudah terurut)
        System.out.print("Masukkan jumlah elemen array (harus terurut): ");
        int n = binaryScanner.nextInt();
        int[] arr = new int[n];

        //Input elemen-elemen array
        System.out.println("Masukkan elemen array yang sudah terurut:");
        for (int i = 0; i < n; i++) {
            arr[i] = binaryScanner.nextInt();
        }

        //Input nilai target yang akan dicari
        System.out.print("Masukkan nilai target yang dicari: ");
        int x = binaryScanner.nextInt();

        //Menampilkan array yang sudah diinput
        System.out.println("Array yang dimasukkan: " + Arrays.toString(arr));
        System.out.println();

        //Initialize variabel untuk Binary Search
        int left = 0, right = arr.length - 1;
        int iteration = 1;
        int result = -1;

        //Proses Binary Search dengan penjelasan langkah per langkah
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("Iterasi " + iteration + ":");
            System.out.println("  left = " + left + ", right = " + right + ", mid = " + mid);
            System.out.println("  Memeriksa elemen arr[mid] = " + arr[mid]);

            if (arr[mid] == x) {
                result = mid;
                System.out.println("  Nilai " + x + " ditemukan pada indeks " + mid);
                break;
            } else if (arr[mid] < x) {
                System.out.println("  Nilai " + x + " lebih besar dari " + arr[mid] + ", mencari di bagian kanan.");
                left = mid + 1;
            } else {
                System.out.println("  Nilai " + x + " lebih kecil dari " + arr[mid] + ", mencari di bagian kiri.");
                right = mid - 1;
            }
            iteration++;
            System.out.println();  //Baris kosong untuk memisahkan iterasi
        }

        //Jika target tidak ditemukan
        if (result == -1) {
            System.out.println("Nilai " + x + " tidak ditemukan dalam array.");
            binaryScanner.close();
        }
    }
}
