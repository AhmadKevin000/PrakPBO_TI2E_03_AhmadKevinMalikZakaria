public class AnggotaPerpus {
    private String id;
    private String nama;

    public AnggotaPerpus(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String info() {
        return "ID: " + id + ", Nama: " + nama;
    }
}
