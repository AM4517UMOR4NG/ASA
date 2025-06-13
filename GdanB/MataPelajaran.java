package GdanB;

public class MataPelajaran {
    private final String nama;
    private final int prioritas;
    private final int durasi;  // jam per minggu

    public MataPelajaran(String nama, int prioritas, int durasi) {
        this.nama = nama;
        this.prioritas = prioritas;
        this.durasi = durasi;
    }

    public String getNama() {
        return nama;
    }

    public int getPrioritas() {
        return prioritas;
    }

    public int getDurasi() {
        return durasi;
    }
}
