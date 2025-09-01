package Tugas;

public class parfum {
    private String merk, aroma;
    private int volume, harga;

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void setAroma(String aroma){
        this.aroma = aroma;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public void memberiKesan(){
        System.out.println("Parfum ini digunakan untuk memberi kesan wangi");
    }

    public void menambahPD(){
        System.out.println("Parfum juga dapat meningkatkakn rasa percaya diri");
    }

    public void cetakStatus(){
        System.out.println("Merk: " + merk);
        System.out.println("Aroma: " + aroma);
        System.out.println("Volume: " + volume + " ml");
        System.out.println("Harga: Rp." + harga);
    }
}
