package HewanOOP3;

public class Paus extends Mamalia{
    public Paus (String nama, int umur){
        super(nama, umur);
    }

    @Override
    void berjalan(){
        System.out.println("Paus berrenang menggunakan sirip dan ekor");
    }

    @Override
    void bersuara(){
        System.out.println("Wiuuuu!");
    }

    String getName(){
        return nama;
    }

    int getUmur(){
        return umur;
    }
}
