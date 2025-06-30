package GreedydanBacktracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Penjadwal {
    private List<MataPelajaran> daftarMataPelajaran;
    private int jamMaksimal;
    private Jadwal jadwalTerbaik;

    public Penjadwal(List<MataPelajaran> daftarMataPelajaran, int jamMaksimal) {
        this.daftarMataPelajaran = daftarMataPelajaran;
        this.jamMaksimal = jamMaksimal;
        this.jadwalTerbaik = new Jadwal();
    }

    // Metode Greedy
    public Jadwal jadwalkanGreedy() {
        Jadwal jadwal = new Jadwal();
        List<MataPelajaran> sortedMataPelajaran = new ArrayList<>(daftarMataPelajaran);
        Collections.sort(sortedMataPelajaran); // Urutkan berdasarkan prioritas

        for (MataPelajaran mp : sortedMataPelajaran) {
            if (jadwal.getTotalDurasi() + mp.getDurasi() <= jamMaksimal) {
                jadwal.tambahMataPelajaran(mp);
            }
        }
        return jadwal;
    }

    // Metode Backtracking
    public Jadwal jadwalkanBacktracking() {
        rekursiBalik(new Jadwal(), 0);
        return jadwalTerbaik;
    }

    private void rekursiBalik(Jadwal saatIni, int indeks) {
        if (indeks == daftarMataPelajaran.size()) {
            if (saatIni.getTotalPrioritas() > jadwalTerbaik.getTotalPrioritas() && saatIni.apakahValid(jamMaksimal)) {
                jadwalTerbaik = new Jadwal();
                for (MataPelajaran mp : saatIni.getMataPelajaran()) {
                    jadwalTerbaik.tambahMataPelajaran(mp);
                }
            }
            return;
        }

        // Tidak memasukkan mata pelajaran saat ini
        rekursiBalik(saatIni, indeks + 1);

        // Memasukkan mata pelajaran saat ini
        MataPelajaran mp = daftarMataPelajaran.get(indeks);
        if (saatIni.getTotalDurasi() + mp.getDurasi() <= jamMaksimal) {
            saatIni.tambahMataPelajaran(mp);
            rekursiBalik(saatIni, indeks + 1);
            saatIni.getMataPelajaran().remove(saatIni.getMataPelajaran().size() - 1);
            saatIni = new Jadwal();
            for (MataPelajaran s : saatIni.getMataPelajaran()) {
                saatIni.tambahMataPelajaran(s);
            }
        }
    }
}