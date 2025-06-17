// Penjadwalan.java
package GdanB;

import java.util.*;

public class Penjadwalan {

    public static Map<String, Object> jadwalGreedy(
            List<MataPelajaran> daftar, int batasJam) {
        List<MataPelajaran> sorted = new ArrayList<>(daftar);
        sorted.sort(Comparator.comparingInt(MataPelajaran::getPrioritas));

        List<MataPelajaran> terpilih = new ArrayList<>();
        int sisaJam = batasJam, skor = 0;
        for (MataPelajaran mp : sorted) {
            if (mp.getDurasi() <= sisaJam) {
                terpilih.add(mp);
                sisaJam -= mp.getDurasi();
                skor += (10 - mp.getPrioritas());
            }
        }
        Map<String,Object> res = new HashMap<>();
        res.put("terpilih", terpilih);
        res.put("skor", skor);
        return res;
    }

    public static Map<String, Object> jadwalBacktracking(
            List<MataPelajaran> daftar, int batasJam) {
        int n = daftar.size(), bestSkor = 0;
        List<MataPelajaran> bestSet = new ArrayList<>();
        for (int mask = 0; mask < (1 << n); mask++) {
            int totalJam = 0, totalSkor = 0;
            List<MataPelajaran> current = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    MataPelajaran m = daftar.get(i);
                    totalJam += m.getDurasi();
                    totalSkor += (10 - m.getPrioritas());
                    current.add(m);
                }
            }
            if (totalJam <= batasJam && totalSkor > bestSkor) {
                bestSkor = totalSkor;
                bestSet = new ArrayList<>(current);
            }
        }
        Map<String,Object> res = new HashMap<>();
        res.put("terpilih", bestSet);
        res.put("skor", bestSkor);
        return res;
    }
}
