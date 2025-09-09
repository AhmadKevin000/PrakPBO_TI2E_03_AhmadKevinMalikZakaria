import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama anggota   : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan no KTP         : ");
        String noKTP = sc.nextLine();
        System.out.print("Masukkan limit pinjaman : ");
        float limit = sc.nextFloat();

        Anggota anggota1 = new Anggota(noKTP, nama, limit);

        int pilihan;
        do {
            System.out.println("\n===== MENU KOPERASI =====");
            System.out.println("1. Tampilkan Data Anggota");
            System.out.println("2. Pinjam Uang");
            System.out.println("3. Bayar Angsuran");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- DATA ANGGOTA ---");
                    System.out.println("Nama              : " + anggota1.getNama());
                    System.out.println("No KTP            : " + anggota1.getNoKTP());
                    System.out.println("Limit Peminjaman  : " + anggota1.getLimitPeminjaman());
                    System.out.println("Jumlah Pinjaman   : " + anggota1.getJumlahPeminjaman());
                    break;

                case 2:
                    System.out.print("\nMasukkan jumlah pinjaman: ");
                    float pinjam = sc.nextFloat();
                    anggota1.pinjam(pinjam);
                    System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPeminjaman());
                    break;

                case 3:
                    System.out.print("\nMasukkan jumlah angsuran: ");
                    float angsur = sc.nextFloat();
                    anggota1.angsur(angsur);
                    System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPeminjaman());
                    break;

                case 4:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia, coba lagi.");
            }
        } while (pilihan != 4);
    }
}