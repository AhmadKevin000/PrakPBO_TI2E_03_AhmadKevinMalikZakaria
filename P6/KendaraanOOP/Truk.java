package KendaraanOOP;

class Truk extends Kendaraan{
    int muatan;

    public Truk(String merk, int tahunProduksi, int muatan){
        super(merk, tahunProduksi);
        this.muatan = muatan;
    }

    @Override
    void jalankan(){
        System.out.println("Truk " + merk + " berjalan...");
    }

    void info(){
        super.info();
        System.out.println("Muatan " + muatan + "Kg");
    }
}
