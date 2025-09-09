public class Anggota {
    private String noKTP, nama;
    private float limitPeminjaman, jumlahPeminjaman;

    public Anggota(String noKTP, String nama, float limitPeminjaman){
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
    }

    public String getNoKTP(){
        return noKTP;
    }

    public String getNama(){
        return nama;
    }

    public float getJumlahPeminjaman(){
        return jumlahPeminjaman;
    }

    public float getLimitPeminjaman(){
        return limitPeminjaman;
    }

    public void pinjam(float pinjam){
        if (pinjam > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            jumlahPeminjaman += pinjam;
        }
    }

    public void angsur(float angsur){
        if (angsur < jumlahPeminjaman * 0.1) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            jumlahPeminjaman -= angsur;
        }
    }
}
