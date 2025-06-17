package GdanB;

import java.util.*;

public class GdanBMain {
    public static void main(String[] args) {
        final int BATAS_JAM = 20;
        String garis = "+--------------------------------------+-----------+--------+";
        String fmtH = "| %-36s | %9s | %6s |%n";
        String fmtB = "| %-36s | %9d | %6d |%n";

        List<Siswa> siswaList = Arrays.asList(

                new Siswa("Aek Mohop Alogo Situmorang", Arrays.asList(
                        new MataPelajaran("Analisis Strategi dan Algoritma", 1, 3),
                        new MataPelajaran("Pembelajaran Mesin", 4, 3),
                        new MataPelajaran("Healing Earth", 8, 2),
                        new MataPelajaran("Pembelajaran Berbasis Platform", 6, 3),
                        new MataPelajaran("Teknik Kendali", 9, 2),
                        new MataPelajaran("Manajemen Informasi", 7, 2),
                        new MataPelajaran("Komputer Paralel dan Terdistribusi", 3, 2),
                        new MataPelajaran("Interaksi Manusia dan Komputer", 2, 2),
                        new MataPelajaran("Rekayasa Perangkat Lunak", 5, 3)), BATAS_JAM),

                new Siswa("Aldo Sepvenco", Arrays.asList(
                        new MataPelajaran("Analisis Strategi dan Algoritma", 5, 3),
                        new MataPelajaran("Pembelajaran Mesin", 3, 3),
                        new MataPelajaran("Healing Earth", 9, 2),
                        new MataPelajaran("Pembelajaran Berbasis Platform", 1, 3),
                        new MataPelajaran("Manajemen Informasi", 8, 2),
                        new MataPelajaran("Komputer Paralel dan Terdistribusi", 7, 2),
                        new MataPelajaran("Interaksi Manusia dan Komputer", 4, 2),
                        new MataPelajaran("Etika Profesi", 6, 2),
                        new MataPelajaran("Rekayasa Perangkat Lunak", 2, 3)), BATAS_JAM),

                new Siswa("Herman Watimena", Arrays.asList(
                        new MataPelajaran("Analisis Strategi dan Algoritma", 3, 3),
                        new MataPelajaran("Pembelajaran Mesin", 1, 3),
                        new MataPelajaran("Pembelajaran Berbasis Platform", 2, 3),
                        new MataPelajaran("Manajemen Informasi", 6, 2),
                        new MataPelajaran("Komputer Paralel dan Terdistribusi", 7, 2),
                        new MataPelajaran("Interaksi Manusia dan Komputer", 5, 2),
                        new MataPelajaran("Kewarganegaraan", 8, 2),
                        new MataPelajaran("Rekayasa Perangkat Lunak", 4, 3)), BATAS_JAM),

                new Siswa("Janetzi Lahade", Arrays.asList(
                        new MataPelajaran("Analisis Strategi dan Algoritma", 2, 3),
                        new MataPelajaran("Pembelajaran Mesin", 3, 3),
                        new MataPelajaran("Healing Earth", 8, 2),
                        new MataPelajaran("Pembelajaran Berbasis Platform", 4, 3),
                        new MataPelajaran("Manajemen Informasi", 7, 2),
                        new MataPelajaran("Komputer Paralel dan Terdistribusi", 5, 2),
                        new MataPelajaran("Interaksi Manusia dan Komputer", 6, 2),
                        new MataPelajaran("Rekayasa Perangkat Lunak", 1, 3)), BATAS_JAM),

                new Siswa("Tamu Rambu Tupa Dua", Arrays.asList(
                        new MataPelajaran("Analisis Strategi dan Algoritma", 2, 3),
                        new MataPelajaran("Pembelajaran Mesin", 1, 3),
                        new MataPelajaran("Intermediate Grammar in Use", 8, 2),
                        new MataPelajaran("Pembelajaran Berbasis Platform", 4, 3),
                        new MataPelajaran("Manajemen Informasi", 6, 2),
                        new MataPelajaran("Komputer Paralel dan Terdistribusi", 7, 2),
                        new MataPelajaran("Interaksi Manusia dan Komputer", 5, 2),
                        new MataPelajaran("Rekayasa Perangkat Lunak", 3, 3)), BATAS_JAM),

                new Siswa("Tesa Royman", Arrays.asList(
                        new MataPelajaran("Analisis Strategi dan Algoritma", 2, 3),
                        new MataPelajaran("Pembelajaran Mesin", 3, 3),
                        new MataPelajaran("Pembelajaran Berbasis Platform", 1, 3),
                        new MataPelajaran("Manajemen Informasi", 7, 2),
                        new MataPelajaran("Komputer Paralel dan Terdistribusi", 6, 2),
                        new MataPelajaran("Interaksi Manusia dan Komputer", 5, 2),
                        new MataPelajaran("Kewarganegaraan", 8, 2),
                        new MataPelajaran("Rekayasa Perangkat Lunak", 4, 3)), BATAS_JAM),

                new Siswa("Caroline Ayu Anastasya", Arrays.asList(
                        new MataPelajaran("Analisis Strategi dan Algoritma", 6, 3),
                        new MataPelajaran("Pembelajaran Mesin", 7, 3),
                        new MataPelajaran("Healing Earth", 1, 2),
                        new MataPelajaran("Pembelajaran Berbasis Platform", 8, 3),
                        new MataPelajaran("Manajemen Informasi", 5, 2),
                        new MataPelajaran("Komputer Paralel dan Terdistribusi", 3, 2),
                        new MataPelajaran("Interaksi Manusia dan Komputer", 4, 2),
                        new MataPelajaran("Rekayasa Perangkat Lunak", 2, 3)), BATAS_JAM),

                new Siswa("Kaiza", Arrays.asList(
                        new MataPelajaran("Analisis Strategi dan Algoritma", 5, 3),
                        new MataPelajaran("Pembelajaran Mesin", 2, 3),
                        new MataPelajaran("Etika Profesi", 8, 2),
                        new MataPelajaran("Pembelajaran Berbasis Platform", 1, 3),
                        new MataPelajaran("Manajemen Informasi", 7, 2),
                        new MataPelajaran("Komputer Paralel dan Terdistribusi", 4, 2),
                        new MataPelajaran("Interaksi Manusia dan Komputer", 6, 2),
                        new MataPelajaran("Kewarganegaraan", 9, 2),
                        new MataPelajaran("Rekayasa Perangkat Lunak", 3, 3)), BATAS_JAM),

                new Siswa("Maria Anastasya", Arrays.asList(
                        new MataPelajaran("Analisis Strategi dan Algoritma", 1, 3),
                        new MataPelajaran("Pembelajaran Mesin", 3, 3),
                        new MataPelajaran("Healing Earth", 9, 2),
                        new MataPelajaran("Pembelajaran Berbasis Platform", 4, 3),
                        new MataPelajaran("Manajemen Informasi", 7, 2),
                        new MataPelajaran("Komputer Paralel dan Terdistribusi", 6, 2),
                        new MataPelajaran("Interaksi Manusia dan Komputer", 5, 2),
                        new MataPelajaran("Psikologi Kepemimpinan", 8, 2),
                        new MataPelajaran("Rekayasa Perangkat Lunak", 2, 3)), BATAS_JAM),

                new Siswa("Cristiano Kevin Pratama", Arrays.asList(
                        new MataPelajaran("Analisis Strategi dan Algoritma", 5, 3),
                        new MataPelajaran("Pembelajaran Mesin", 1, 3),
                        new MataPelajaran("Pembelajaran Berbasis Platform", 2, 3),
                        new MataPelajaran("Manajemen Informasi", 3, 2),
                        new MataPelajaran("Komputer Paralel dan Terdistribusi", 6, 2),
                        new MataPelajaran("Interaksi Manusia dan Komputer", 4, 2),
                        new MataPelajaran("Kewarganegaraan", 8, 2),
                        new MataPelajaran("Rekayasa Perangkat Lunak", 7, 3)), BATAS_JAM)
        );

        for (Siswa s : siswaList) {
            // Cetak Data Input
            System.out.println("\nData Input: " + s.getNama());
            System.out.println(garis);
            System.out.printf(fmtH, "Mata Pelajaran", "Prioritas", "Durasi");
            System.out.println(garis);
            for (MataPelajaran mp : s.getDaftarMapel()) {
                System.out.printf(fmtB, mp.getNama(), mp.getPrioritas(), mp.getDurasi());
            }
            System.out.println(garis);

            // Greedy
            System.out.println("Greedy:");
            long startG = System.nanoTime();
            Map<String, Object> g = Penjadwalan.jadwalGreedy(s.getDaftarMapel(), BATAS_JAM);
            long endG = System.nanoTime();
            double timeG = (endG - startG) / 1_000_000.0;

            @SuppressWarnings("unchecked")
            List<MataPelajaran> greedyList = (List<MataPelajaran>) g.get("terpilih");
            int skorG = (int) g.get("skor");
            System.out.println(garis);
            System.out.printf(fmtH, "Mapel Terpilih", "Prioritas", "Durasi");
            System.out.println(garis);
            for (MataPelajaran mp : greedyList) {
                System.out.printf(fmtB, mp.getNama(), mp.getPrioritas(), mp.getDurasi());
            }
            System.out.println(garis);
            System.out.println("Skor Total Greedy: " + skorG);
            System.out.printf("Waktu Eksekusi Greedy: %.3f ms%n", timeG);

            // Backtracking
            System.out.println("Backtracking:");
            long startB = System.nanoTime();
            Map<String, Object> b = Penjadwalan.jadwalBacktracking(s.getDaftarMapel(), BATAS_JAM);
            long endB = System.nanoTime();
            double timeB = (endB - startB) / 1_000_000.0;

            @SuppressWarnings("unchecked")
            List<MataPelajaran> backtrackList = (List<MataPelajaran>) b.get("terpilih");
            int skorB = (int) b.get("skor");
            System.out.println(garis);
            System.out.printf(fmtH, "Mapel Terpilih", "Prioritas", "Durasi");
            System.out.println(garis);
            for (MataPelajaran mp : backtrackList) {
                System.out.printf(fmtB, mp.getNama(), mp.getPrioritas(), mp.getDurasi());
            }
            System.out.println(garis);
            System.out.println("Skor Total Backtracking: " + skorB);
            System.out.printf("Waktu Eksekusi Backtracking: %.3f ms%n", timeB);

            // Kesimpulan per-siswa
            if (skorG == skorB) {
                System.out.println("Kesimpulan: Greedy sudah optimal (skor = " + skorG + ")");
            } else {
                System.out.println("Kesimpulan: Backtracking lebih optimal (" + skorB + " > " + skorG + ")");
            }
        }

        // Ringkasan Global
        System.out.println("\n=== Ringkasan Perbandingan Skor & Waktu Eksekusi ===");
        System.out.printf("| %-30s | %6s | %11s | %9s | %12s |%n",
                          "Nama Siswa", "SkorG", "SkorB", "ΔSkor", "T_Greedy(ms)", "T_Backtrack(ms)");
        System.out.println("+--------------------------------+--------+-------------+----------+--------------+");
        for (Siswa s : siswaList) {
            long t0 = System.nanoTime();
            int gScore = (int) Penjadwalan.jadwalGreedy(s.getDaftarMapel(), BATAS_JAM).get("skor");
            long t1 = System.nanoTime();
            long t2 = System.nanoTime();
            int bScore = (int) Penjadwalan.jadwalBacktracking(s.getDaftarMapel(), BATAS_JAM).get("skor");
            long t3 = System.nanoTime();
            double tg = (t1 - t0) / 1_000_000.0;
            double tb = (t3 - t2) / 1_000_000.0;
            int delta = bScore - gScore;
            System.out.printf("| %-30s | %6d | %11d | %9d | %12.3f | %n",
                              s.getNama(), gScore, bScore, delta, tg, tb);
        }
        System.out.println("+--------------------------------------------------------------------------+");
    }
}
