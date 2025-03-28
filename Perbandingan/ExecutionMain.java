package Perbandingan;

/**
 * Kelas Execution berisi metode main untuk menjalankan program
 */
public class ExecutionMain {
    public static void main(String[] args) {
        // Header tabel
        System.out.println("=================================================================================");
        System.out.println("| Ukuran Data  | Target      |Binary Search (ms)|Jump Search (ms)|");
        System.out.println("=================================================================================");

        // Uji perbandingan pada berbagai ukuran data
        Mekanisme.compareSearches(10);
        Mekanisme.compareSearches(120);
        Mekanisme.compareSearches(1000);
        Mekanisme.compareSearches(10000);
        Mekanisme.compareSearches(100000);
        Mekanisme.compareSearches(1000000);

        // Footer tabel
        System.out.println("=================================================================================");
    }
}
