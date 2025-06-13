package GdanB;

import java.util.*;

/**
 * Dua metode penjadwalan:
 * 1. jadwalGreedy   – memilih mapel dengan nilai prioritas terendah (1 paling utama) secara urut.
 * 2. jadwalOptimal  – backtracking (bitmask) untuk skor maksimal, makin kecil prioritas → makin tinggi nilai.
 */
public class Penjadwalan {

    /**
     * Greedy: urutkan ascending berdasarkan prioritas (1 → 2 → 3…), lalu ambil selama durasi muat.
     * Skor dihitung dengan pembalikan: skor = 10 - prioritas.
     */
    public static Map<String, Object> jadwalGreedy(List<MataPelajaran> daftar, int batasJam) {
        List<MataPelajaran> sorted = new ArrayList<>(daftar);
        // Urutkan dari prioritas terkecil ke terbesar
        sorted.sort(Comparator.comparingInt(MataPelajaran::getPrioritas));

        List<MataPelajaran> terpilih = new ArrayList<>();
        int sisaJam = batasJam;
        int skor = 0;

        for (MataPelajaran mp : sorted) {
            if (mp.getDurasi() <= sisaJam) {
                terpilih.add(mp);
                sisaJam -= mp.getDurasi();
                // Skor: semakin kecil prioritas, makin besar skor
                skor += (10 - mp.getPrioritas());
            }
        }

        Map<String, Object> hasil = new HashMap<>();
        hasil.put("terpilih", terpilih);
        hasil.put("skor", skor);
        return hasil;
    }

    /**
     * Optimal: eksplorasi semua subset (bitmask),
     * cari kombinasi dengan total skor terbaik (skor = 10 - prioritas) dan total jam <= batas.
     */
    public static Map<String, Object> jadwalOptimal(List<MataPelajaran> daftar, int batasJam) {
        int n = daftar.size();
        int bestSkor = 0;
        List<MataPelajaran> bestList = new ArrayList<>();

        for (int mask = 0; mask < (1 << n); mask++) {
            int totalJam = 0;
            int totalSkor = 0;
            List<MataPelajaran> current = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    MataPelajaran mp = daftar.get(i);
                    totalJam += mp.getDurasi();
                    totalSkor += (10 - mp.getPrioritas()); // skor terbalik
                    current.add(mp);
                }
            }

            if (totalJam <= batasJam && totalSkor > bestSkor) {
                bestSkor = totalSkor;
                bestList = current;
            }
        }

        Map<String, Object> hasil = new HashMap<>();
        hasil.put("terpilih", bestList);
        hasil.put("skor", bestSkor);
        return hasil;
    }
}
