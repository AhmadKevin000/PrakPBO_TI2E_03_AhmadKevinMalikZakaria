package HewanOOP3;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2);
        kucing.menyusui();
        System.out.println("Nama Hewan: " + kucing.getName());
        System.out.println("Umur Hewan: " + kucing.getUmur());
        kucing.berjalan();
        kucing.bersuara();

        System.out.println();
        Paus paus = new Paus("David", 4);
        paus.menyusui();
        System.out.println("Nama Hewan: " + paus.getName());
        System.out.println("Umur Hewan: " + paus.getUmur());
        paus.berjalan();
        paus.bersuara();
    }
}
