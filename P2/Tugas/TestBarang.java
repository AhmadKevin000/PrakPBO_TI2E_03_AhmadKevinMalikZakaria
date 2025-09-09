package Tugas;

public class TestBarang {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.kode = "BR001";
        b1.namaBarang = "Laptop";
        b1.hargaDasar = 10000000;
        b1.diskon = 10;

        b1.tampilData();
    }
}
