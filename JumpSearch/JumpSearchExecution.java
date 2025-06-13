package JumpSearch;  // Mendefinisikan package tempat class ini berada

import java.util.Scanner;  // Mengimpor class Scanner untuk menerima input dari pengguna

/**
 * Class JumpSearchExecution yang berfungsi sebagai main class untuk menjalankan
 * algoritma Jump Search dan mengukur waktu eksekusinya
 */
public class JumpSearchExecution {
    /**
     * Metode main yang akan dijalankan saat program dieksekusi
     * 
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Menampilkan pilihan ukuran array kepada pengguna
        System.out.println("Pilih ukuran array:");
        System.out.println("1) 1.000  2) 100.000  3) 1.000.000  4) 10.000.000");
        
        // Membaca pilihan pengguna
        int choice = scanner.nextInt();
        
        // Mendeklarasikan variabel untuk menyimpan ukuran array
        int size;
        
        // Menentukan ukuran array berdasarkan pilihan pengguna
        switch (choice) {
            case 1:
                size = 1000;
                break;
            case 2:
                size = 100000;
                break;
            case 3:
                size = 1000000;
                break;
            case 4:
                size = 10000000;
                break;
            default:
                // Jika pilihan tidak valid, menggunakan ukuran default 1000
                System.out.println("Pilihan tidak valid, menggunakan 1000 elemen.");
                size = 1000;
        }
        
        // Membuat array data dengan ukuran yang telah ditentukan menggunakan metode getData dari class JumpSearchData
        int[] data = JumpSearchData.getData(size);
        
        // Meminta pengguna memasukkan nilai target yang akan dicari
        System.out.print("Masukkan nilai target yang dicari: ");
        int x = scanner.nextInt();
        
        // Mencatat waktu mulai pencarian
        long startTime = System.nanoTime();
        
        // Memanggil metode jumpSearch dari class JumpSearchMethod untuk mencari target dalam array
        int result = JumpSearchMethod.jumpSearch(data, x);
        
        // Mencatat waktu selesai pencarian
        long endTime = System.nanoTime();
        
        // Menampilkan hasil pencarian kepada pengguna
        if (result != -1) {
            // Jika target ditemukan, menampilkan indeks posisi target
            System.out.println("Target " + x + " ditemukan pada indeks " + result);
        } else {
            // Jika target tidak ditemukan, menampilkan pesan bahwa target tidak ada dalam array
            System.out.println("Target " + x + " tidak ditemukan dalam array.");
        }
        
        // Menghitung dan menampilkan waktu eksekusi dalam milidetik
        System.out.println("Waktu eksekusi: " + (endTime - startTime) / 1_000_000.0 + " ms");
        
       
    }
}