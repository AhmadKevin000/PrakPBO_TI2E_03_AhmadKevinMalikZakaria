package Tugas;

public class sepatuGunung extends sepatu{
    private String tipeSol;
    private boolean tahanAir;
    private double berat;

    public void setTipeSol(String tipeSol) {
        this.tipeSol = tipeSol;
    }

    public void setTahanAir(boolean tahanAir) {
        this.tahanAir = tahanAir;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public void digunakanUntukMendaki() {
        System.out.println("Sepatu ini digunakan untuk mendaki gunung.");
    }

    public void cekKetahananAir() {
        if (tahanAir) {
            System.out.println("Sepatu tahan air.");
        } else {
            System.out.println("Sepatu tidak tahan air.");
        }
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tipe Sol: " + tipeSol);
        System.out.println("Tahan Air: " + tahanAir);
        System.out.println("Berat: " + berat + " kg");
    }
}
