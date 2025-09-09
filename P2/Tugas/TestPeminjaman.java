package Tugas;

import java.util.Scanner;

public class TestPeminjaman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan id peminjam: ");
        String idPeminjam = sc.nextLine();
        System.out.print("Masukkan nama peminjam: ");
        String namaPeminjam = sc.nextLine();
        Peminjam pmnjm1 = new Peminjam(idPeminjam, namaPeminjam);
        
        System.out.print("Masukkan nama game: ");
        String namaGame = sc.nextLine();
        System.out.print("Masukkan harga sewa /jam: ");
        int harga = sc.nextInt();
        Game game1 = new Game(namaGame, harga);

        System.out.print("Masukkan lama waktu pinjam: ");
        int lamaWaktu = sc.nextInt();
        Peminjaman pmnjmn1 = new Peminjaman(game1, pmnjm1, lamaWaktu);

        pmnjmn1.tampilkanData();
    }
}
