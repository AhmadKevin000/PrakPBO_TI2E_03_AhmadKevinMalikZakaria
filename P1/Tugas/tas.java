package Tugas;

public class tas {
    private String merk, bahan;
    private int volume, harga;

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void setBahan(String bahan){
        this.bahan = bahan;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public void dignakanUntukMembawa(){
        System.out.println("Tas ini digunakan untuk membawa barang dengan lebih mudah");
    }

    public void organisirBarang(){
        System.out.println("Tas dapat memudahkan pengguna untuk mengorganisir barang bawaan");
    }

    public void cetakStatus(){
        System.out.println("Merk: " + merk);
        System.out.println("Bahan: " + bahan);
        System.out.println("Volume: " + volume + " l");
        System.out.println("Harga: Rp." + harga);
    }
}
