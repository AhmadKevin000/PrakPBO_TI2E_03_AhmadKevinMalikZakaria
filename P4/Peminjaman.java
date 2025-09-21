public class Peminjaman {
    private Buku buku;
    private AnggotaPerpus anggota;
    private int lama;

    public Peminjaman(Buku buku, AnggotaPerpus anggota, int lama) {
        this.buku = buku;
        this.anggota = anggota;
        this.lama = lama;
    }

    public String info() {
        return "Peminjaman -> " + anggota.info() + 
               " | " + buku.info() + 
               " | Lama: " + lama + " hari";
    }
}
