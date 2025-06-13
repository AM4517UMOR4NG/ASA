package GdanB;

import java.util.List;

public class Siswa {
    private final String nama;
    private final List<MataPelajaran> daftarMapel;
    private final int batasJamMingguan;

    public Siswa(String nama, List<MataPelajaran> daftarMapel, int batasJamMingguan) {
        this.nama               = nama;
        this.daftarMapel        = daftarMapel;
        this.batasJamMingguan   = batasJamMingguan;
    }

    public String getNama() {
        return nama;
    }

    public List<MataPelajaran> getDaftarMapel() {
        return daftarMapel;
    }

    public int getBatasJamMingguan() {
        return batasJamMingguan;
    }
}

