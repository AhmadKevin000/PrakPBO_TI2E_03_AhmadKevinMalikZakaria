package Tugas;

public class demo {
    public static void main(String[] args) {

        sepatu spt1 = new sepatu();
        spt1.setBahan("Mesh");
        spt1.setMerk("New Balance");
        spt1.setUkuran(33);
        spt1.setWarna("Abu-abu");
        spt1.cetakStatus();
        spt1.digunakanUntukMelindungi();
        spt1.tidakTerpeleset();
        System.out.println();

        sepatuGunung spt2 = new sepatuGunung();
        spt2.setBahan("Gore-Tex");
        spt2.setMerk("Outdoor Pro");
        spt2.setUkuran(32);
        spt2.setWarna("Cokelat");
        spt2.setTahanAir(true);
        spt2.setBerat(1);
        spt2.setTipeSol("Vibram");
        spt2.cetakStatus();
        spt2.digunakanUntukMendaki();
        spt2.cekKetahananAir();
        System.out.println();

        detergen dtgn1 = new detergen();
        dtgn1.setMerk("Daia");
        dtgn1.setJenis("Bubuk");
        dtgn1.setIsi(100);
        dtgn1.setAroma("Lavender");
        dtgn1.setHarga(5000);
        dtgn1.cetakStatus();
        dtgn1.bersihkanPakaian();
        dtgn1.hilangkanNoda();
        System.out.println();

        detergenLiquid dtgn2 = new detergenLiquid();
        dtgn2.setMerk("Molto");
        dtgn2.setJenis("Liquid");
        dtgn2.setIsi(500);
        dtgn2.setAroma("Mawar");
        dtgn2.setKemasan("Pouch");
        dtgn2.setBusaRendah(false);
        dtgn2.setTingkatKekentalan("Tinggi");
        dtgn2.cetakStatus();
        dtgn2.setHarga(32000);
        dtgn2.tuangCairan(20);
        dtgn2.campurDenganAir();
        System.out.println();

        parfum prfm1 = new parfum();
        prfm1.setMerk("Forsol");
        prfm1.setAroma("Fruity Metal");
        prfm1.setVolume(50);
        prfm1.setHarga(230000);
        prfm1.cetakStatus();
        prfm1.memberiKesan();
        prfm1.menambahPD();
        System.out.println();

        tas tas1 = new tas();
        tas1.setMerk("Evernext");
        tas1.setBahan("Leather");
        tas1.setVolume(35);
        tas1.setHarga(200000);
        tas1.cetakStatus();
        tas1.dignakanUntukMembawa();
        tas1.organisirBarang();
    }
}
