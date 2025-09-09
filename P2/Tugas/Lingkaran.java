package Tugas;

public class Lingkaran {
    private double phi,r;

    public Lingkaran(double phi, double r){
        this.phi = phi;
        this.r = r;
    }

    public double hitungLuas(double phi, double r){
        double hasil = (phi * r)/2;
        return hasil;
    }

    public double hitungKeliling(double phi, double r){
        double hasil = 2* phi * r;
        return hasil;
    }
}
