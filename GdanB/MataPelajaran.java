// MataPelajaran.java
package GdanB;

public class MataPelajaran {
    private final String nama;
    private final int prioritas;
    private final int durasi;  // jam per minggu

    public MataPelajaran(String nama, int prioritas, int durasi) {
        if (prioritas < 1 || prioritas > 9) {
            throw new IllegalArgumentException("Prioritas harus di antara 1–9");
        }
        if (durasi <= 0) {
            throw new IllegalArgumentException("Durasi harus lebih dari 0");
        }
        this.nama = nama;
        this.prioritas = prioritas;
        this.durasi = durasi;
    }

    public String getNama() { return nama; }
    public int getPrioritas() { return prioritas; }
    public int getDurasi() { return durasi; }
}
