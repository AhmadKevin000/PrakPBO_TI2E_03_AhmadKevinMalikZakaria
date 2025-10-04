package HewanOOP2;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2, "Munchkin");
        System.out.println("Nama Hewan: " + kucing.getName());
        System.out.println("Umur Hewan: " + kucing.getUmur());
        System.out.println("Ras Hewan: " + kucing.getRas());
    }
}
