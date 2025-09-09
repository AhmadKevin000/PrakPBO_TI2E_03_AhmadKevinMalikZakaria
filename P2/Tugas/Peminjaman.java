package Tugas;

public class Peminjaman {
    private Game game;
    private Peminjam peminjam;
    private int lamaWaktu;

    public Peminjaman(Game game, Peminjam peminjam, int lamaWaktu){
        this.game = game;
        this.peminjam = peminjam;
        this.lamaWaktu = lamaWaktu;
    }

    public int hitungTotal() {
        return game.getHarga() * lamaWaktu;
    }

    public void tampilkanData() {
        System.out.println("===== Data Peminjaman =====");
        System.out.println("ID Peminjam   : " + peminjam.getId());
        System.out.println("Nama Peminjam : " + peminjam.getNama());
        System.out.println("Game          : " + game.getNama());
        System.out.println("Harga / jam   : " + game.getHarga());
        System.out.println("Lama Sewa     : " + lamaWaktu + " jam");
        System.out.println("Total Bayar   : " + hitungTotal());
    }
}
