// Siswa.java
package GdanB;

import java.util.List;

public class Siswa {
    private final String nama;
    private final List<MataPelajaran> daftarMapel;
    private final int batasJamMingguan;

    public Siswa(String nama, List<MataPelajaran> daftarMapel, int batasJamMingguan) {
        this.nama = nama;
        if (batasJamMingguan <= 0) {
            throw new IllegalArgumentException("Batas jam mingguan harus > 0");
        }
        int totalDurasi = daftarMapel.stream()
            .mapToInt(MataPelajaran::getDurasi)
            .sum();
        if (totalDurasi > 40) {
            throw new IllegalArgumentException(
              "Total durasi semua mata pelajaran (" + totalDurasi + 
              " jam) melebihi 40 jam per minggu"
            );
        }
        this.daftarMapel = daftarMapel;
        this.batasJamMingguan = batasJamMingguan;
    }

    public String getNama() { return nama; }
    public List<MataPelajaran> getDaftarMapel() { return daftarMapel; }
    public int getBatasJamMingguan() { return batasJamMingguan; }
}
