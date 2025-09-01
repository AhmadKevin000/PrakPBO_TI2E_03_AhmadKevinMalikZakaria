package Tugas;

public class detergen {
    private String merk, aroma, jenis;
    private double isi, harga;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setIsi(double isi) {
        this.isi = isi;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void bersihkanPakaian() {
        System.out.println("Detergen digunakan untuk membersihkan pakaian.");
    }

    public void hilangkanNoda() {
        System.out.println("Detergen membantu menghilangkan noda pada pakaian.");
    }

    public void cetakStatus() {
        System.out.println("Merk: " + merk);
        System.out.println("Jenis: " + jenis);
        System.out.println("Isi: " + isi);
        System.out.println("Aroma: " + aroma);
        System.out.println("Harga: Rp " + harga);
    }
}
