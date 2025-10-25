package Soal;

public class Segitiga {
    int sudut;

    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        double sisiC = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return sisiA + sisiB + sisiC;
    }

    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println("Total Sudut 1: " + s.totalSudut(60));
        System.out.println("Total Sudut 2: " + s.totalSudut(45, 60));
        System.out.println("Keliling (3 sisi): " + s.keliling(3, 4, 5));
        System.out.println("Keliling (2 sisi): " + s.keliling(3, 4));
    }
}