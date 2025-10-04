package HewanOOP4;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2, "Oranye");
        kucing.info();
        kucing.berjalan();

        Anjing anjing = new Anjing("Moci", 1, "Halus");
        anjing.info();
        System.out.println("Jenis bulu: " + anjing.getJenisBulu());
        anjing.berjalan();
    }
}
