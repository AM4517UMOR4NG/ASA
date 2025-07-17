package GreedydanBacktracking;
import java.util.ArrayList;
import java.util.List;

public class Jadwal {
    private List<MataPelajaran> mataPelajaran;
    private int totalDurasi;
    private int totalPrioritas;

    public Jadwal() {
        mataPelajaran = new ArrayList<>();
        totalDurasi = 0;
        totalPrioritas = 0;
    }

    public void tambahMataPelajaran(MataPelajaran mp) {
        mataPelajaran.add(mp);
        totalDurasi += mp.getDurasi();
        totalPrioritas += mp.getPrioritas();
    }

    public List<MataPelajaran> getMataPelajaran() {
        return mataPelajaran;
    }

    public int getTotalDurasi() {
        return totalDurasi;
    }

    public int getTotalPrioritas() {
        return totalPrioritas;
    }

    public boolean apakahValid(int jamMaksimal) {
        return totalDurasi <= jamMaksimal;
    }
}