package JumpSearch;

import java.util.Scanner;
import java.util.Arrays;

/**
 * JumpDataInteractive.java
 *
 * Kelas ini menangani input data dari pengguna.
 * Pengguna akan diminta untuk memasukkan jumlah elemen dan nilai-nilai array
 * (harus terurut).
 */
public class JumpSearchData {
    public static int[] getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array (harus terurut): ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Masukkan elemen array yang sudah terurut:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array yang dimasukkan: " + Arrays.toString(arr));
        System.out.println();

        return arr;
    }
}
