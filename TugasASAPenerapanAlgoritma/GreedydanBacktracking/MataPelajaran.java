package GreedydanBacktracking;

public class MataPelajaran implements Comparable<MataPelajaran> {
    private String nama;
    private int prioritas;
    private int durasi;

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

    @Override
    public int compareTo(MataPelajaran other) {
        return Integer.compare(other.prioritas, this.prioritas); // Urutan menurun berdasarkan prioritas
    }
}