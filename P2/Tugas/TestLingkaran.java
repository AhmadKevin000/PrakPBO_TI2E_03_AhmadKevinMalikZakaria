package Tugas;

import java.util.Scanner;

public class TestLingkaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan rumus phi yang ingin dimasukkan: ");
        double phi = sc.nextDouble();
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = sc.nextDouble();
        Lingkaran lngkrn1 = new Lingkaran(phi, r);

        System.out.println("Luas lingkara: " + lngkrn1.hitungLuas(phi, r));
        System.out.println("Keliling lingkaran: " + lngkrn1.hitungKeliling(phi, r));
    }
}
