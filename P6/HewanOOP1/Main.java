package HewanOOP1;
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo");
        System.out.println("Nama hewan: " + kucing.getName());
        kucing.bersuara();
        kucing.mengeong();

        Anjing anjing = new Anjing("Rico");
        System.out.println("\nNama hewan: " + anjing.getName());
        anjing.bersuara();
        anjing.menggonggong();
    }
}