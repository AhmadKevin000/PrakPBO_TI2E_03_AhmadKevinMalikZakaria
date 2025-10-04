package HewanOOP2;

public class Hewan {
    String nama, ras;
    int umur;

    public Hewan(String nama, int umur, String ras){
        this.nama = nama;
        this.umur = umur;
        this.ras = ras;
        System.out.println("Konstruktor Hewan dipanggil");
    }
}
