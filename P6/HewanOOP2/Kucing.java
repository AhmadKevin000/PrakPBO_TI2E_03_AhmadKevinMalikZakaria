package HewanOOP2;

public class Kucing extends Hewan{
    public Kucing(String nama, int umur, String ras){
        super(nama, umur, ras);
        System.out.println("Konstruktor Kucing dipanggil");
    }

    String getName(){
        return nama;
    }

    int getUmur(){
        return umur;
    }

    String getRas(){
        return ras;
    }
}
