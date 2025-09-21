public class MainPerpustakaan {
    public static void main(String[] args) {
        AnggotaPerpus a1 = new AnggotaPerpus("A01", "Spongebob");
        AnggotaPerpus a2 = new AnggotaPerpus("A02", "Patrick");

        Buku b1 = new Buku("B001", "Java OOP");
        Buku b2 = new Buku("B002", "Struktur Data");

        Perpustakaan perpus = new Perpustakaan("Perpus Polinema", 5);

        Peminjaman p1 = new Peminjaman(b2, a1, 7);
        Peminjaman p2 = new Peminjaman(b2, a2, 3);
        perpus.tambahPeminjaman(p1, 0);
        perpus.tambahPeminjaman(p2, 1);

        System.out.println(perpus.info());
    }
}
