public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krabs");
        Gerbong gerbong = new Gerbong("A",10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());

        Penumpang p1 = new Penumpang("23456", "Budi");
        gerbong.setPenumpang(p1, 1);
    }
}
