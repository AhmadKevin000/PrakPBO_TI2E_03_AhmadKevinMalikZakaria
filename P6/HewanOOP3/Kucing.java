package HewanOOP3;

public class Kucing extends Mamalia{
    public Kucing(String nama, int umur){
        super(nama, umur);
    }

    @Override
    void berjalan(){
        System.out.println("Kucing berjalan menggunakan 4 kaki");
    }

    @Override
    void bersuara(){
        System.out.println("Meong!");
    }

    String getName(){
        return nama;
    }

    int getUmur(){
        return umur;
    }
}
