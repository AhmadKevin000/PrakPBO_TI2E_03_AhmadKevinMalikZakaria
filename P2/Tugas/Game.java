package Tugas;

public class Game {
    private String nama;
    private int harga;

    public Game(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
}
