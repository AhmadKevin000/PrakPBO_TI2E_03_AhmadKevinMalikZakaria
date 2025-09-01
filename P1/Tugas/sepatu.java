package Tugas;

public class sepatu {
    private String merk, warna, bahan;
    private int ukuran;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public void digunakanUntukMelindungi() {
        System.out.println("Sepatu ini digunakan untuk melindungi kaki.");
    }

    public void tidakTerpeleset(){
        System.out.println("Sepatu membuat penggunanya tidak mudah terpeleset");
    }

    public void cetakStatus() {
        System.out.println("Merk: " + merk);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Warna: " + warna);
        System.out.println("Bahan: " + bahan);
    }
}

