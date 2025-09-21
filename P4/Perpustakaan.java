public class Perpustakaan {
    private String nama;
    private Peminjaman[] daftarPeminjaman;

    public Perpustakaan(String nama, int jumlah) {
        this.nama = nama;
        this.daftarPeminjaman = new Peminjaman[jumlah];
    }

    public void tambahPeminjaman(Peminjaman p, int index) {
        if (daftarPeminjaman[index] == null) {
            daftarPeminjaman[index] = p;
        } else {
            System.out.println("Slot peminjaman " + index + " sudah terisi!");
        }
    }

    public String info() {
        String info = "Perpustakaan: " + nama + "\n";
        for (Peminjaman p : daftarPeminjaman) {
            if (p != null) {
                info += p.info() + "\n";
            }
        }
        return info;
    }
}
