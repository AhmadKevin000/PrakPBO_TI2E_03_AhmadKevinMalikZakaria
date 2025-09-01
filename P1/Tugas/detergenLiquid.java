package Tugas;

public class detergenLiquid extends detergen{
    private String tingkatKekentalan, kemasan;
    private boolean busaRendah;

    public void setTingkatKekentalan(String tingkatKekentalan) {
        this.tingkatKekentalan = tingkatKekentalan;
    }

    public void setBusaRendah(boolean busaRendah) {
        this.busaRendah = busaRendah;
    }

    public void setKemasan(String kemasan) {
        this.kemasan = kemasan;
    }

    public void tuangCairan(double ml) {
        System.out.println("Menuangkan detergen cair sebanyak " + ml + " ml.");
    }

    public void campurDenganAir() {
        System.out.println("Detergen cair dicampur dengan air agar lebih efektif.");
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tingkat Kekentalan: " + tingkatKekentalan);
        System.out.println("Busa Rendah: " + busaRendah);
        System.out.println("Kemasan: " + kemasan);
    }
}
