public class Buku {
    private String kode;
    private String judul;

    public Buku(String kode, String judul) {
        this.kode = kode;
        this.judul = judul;
    }

    public String info() {
        return "Kode: " + kode + ", Judul: " + judul;
    }
}
