package JumpSearch;

import java.util.Scanner;

/**
 * JumpExecutionInteractive.java
 *
 * Kelas ini menggabungkan input data dan metode Jump Search secara interaktif.
 * Program ini meminta pengguna memasukkan array terurut dan nilai target,
 * kemudian menjalankan Jump Search dengan menampilkan setiap langkah pencarian.
 */
public class JumpSearchExecution {
    public static void main(String[] args) {
        // Mengambil data array dari pengguna
        int[] data = JumpSearchData.getData();

        // Input target yang akan dicari
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai target yang dicari: ");
        int x = scanner.nextInt();
        System.out.println();

        // Menjalankan Jump Search secara interaktif
        int result = JumpSearchMethod.jumpSearch(data, x);

        if (result != -1) {
            System.out.println("\nJump Search: Target " + x + " ditemukan pada indeks " + result);
        } else {
            System.out.println("\nJump Search: Target " + x + " tidak ditemukan dalam array.");
        }

    }
}
