package Soal;

class Manusia {
    public void bernafas() {
        System.out.println("Manusia bernafas menggunakan paru-paru.");
    }

    public void makan() {
        System.out.println("Manusia makan untuk bertahan hidup.");
    }
}

class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen makan sambil memeriksa tugas mahasiswa.");
    }

    public void lembur() {
        System.out.println("Dosen lembur menyiapkan materi kuliah.");
    }
}

class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan di kantin kampus.");
    }

    public void tidur() {
        System.out.println("Mahasiswa tidur setelah belajar larut malam.");
    }
}

public class TesOverriding {
    public static void main(String[] args) {
        Manusia m1 = new Manusia();
        Manusia m2 = new Dosen();
        Manusia m3 = new Mahasiswa();

        m1.makan();
        m2.makan();
        m3.makan();

        ((Dosen) m2).lembur();
        ((Mahasiswa) m3).tidur();
    }
}