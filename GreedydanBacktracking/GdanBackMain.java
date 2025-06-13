package GreedydanBacktracking;
import java.util.ArrayList;
import java.util.List;

public class GdanBackMain {

    public static void main(String[] args) {
        // Daftar 10 mata pelajaran
        List<MataPelajaran> daftarMataPelajaran = new ArrayList<>();
        daftarMataPelajaran.add(new MataPelajaran("Matematika", 5, 4));
        daftarMataPelajaran.add(new MataPelajaran("Fisika", 4, 3));
        daftarMataPelajaran.add(new MataPelajaran("Kimia", 3, 3));
        daftarMataPelajaran.add(new MataPelajaran("Biologi", 2, 2));
        daftarMataPelajaran.add(new MataPelajaran("Sejarah", 1, 2));
        daftarMataPelajaran.add(new MataPelajaran("Geografi", 5, 3));
        daftarMataPelajaran.add(new MataPelajaran("Ekonomi", 4, 2));
        daftarMataPelajaran.add(new MataPelajaran("Sosiologi", 3, 2));
        daftarMataPelajaran.add(new MataPelajaran("Bahasa Inggris", 2, 3));
        daftarMataPelajaran.add(new MataPelajaran("Kewarganegaraan", 1, 2));

        int jamMaksimal = 20;

        Penjadwal penjadwal = new Penjadwal(daftarMataPelajaran, jamMaksimal);

        // Jadwal Greedy
        Jadwal jadwalGreedy = penjadwal.jadwalkanGreedy();
        System.out.println("Jadwal Greedy:");
        for (MataPelajaran mp : jadwalGreedy.getMataPelajaran()) {
            System.out.println(mp.getNama() + " - Prioritas: " + mp.getPrioritas() + ", Durasi: " + mp.getDurasi());
        }
        System.out.println("Total Prioritas: " + jadwalGreedy.getTotalPrioritas());
        System.out.println("Total Durasi: " + jadwalGreedy.getTotalDurasi());

        // Jadwal Backtracking
        Jadwal jadwalBacktracking = penjadwal.jadwalkanBacktracking();
        System.out.println("\nJadwal Backtracking:");
        for (MataPelajaran mp : jadwalBacktracking.getMataPelajaran()) {
            System.out.println(mp.getNama() + " - Prioritas: " + mp.getPrioritas() + ", Durasi: " + mp.getDurasi());
        }
        System.out.println("Total Prioritas: " + jadwalBacktracking.getTotalPrioritas());
        System.out.println("Total Durasi: " + jadwalBacktracking.getTotalDurasi());

        // Perbandingan
        System.out.println("\nPerbandingan:");
        if (jadwalGreedy.getTotalPrioritas() > jadwalBacktracking.getTotalPrioritas()) {
            System.out.println("Greedy memiliki total prioritas lebih tinggi.");
        } else if (jadwalGreedy.getTotalPrioritas() < jadwalBacktracking.getTotalPrioritas()) {
            System.out.println("Backtracking memiliki total prioritas lebih tinggi.");
        } else {
            System.out.println("Kedua metode memiliki total prioritas yang sama.");
        }

        if (jadwalGreedy.getTotalDurasi() < jadwalBacktracking.getTotalDurasi()) {
            System.out.println("Greedy menggunakan waktu lebih sedikit.");
        } else if (jadwalGreedy.getTotalDurasi() > jadwalBacktracking.getTotalDurasi()) {
            System.out.println("Backtracking menggunakan waktu lebih sedikit.");
        } else {
            System.out.println("Kedua metode menggunakan waktu yang sama.");
        }
    }
}