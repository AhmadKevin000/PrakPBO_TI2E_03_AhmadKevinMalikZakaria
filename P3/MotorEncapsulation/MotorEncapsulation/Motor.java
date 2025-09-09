package MotorEncapsulation;

public class Motor {
    private int kecepatan = 0, kecepatanMax = 100;
    private boolean kontakOn = false;

    public void nyalakanMesin(){
        kontakOn = true;
    }

    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan(){
        if (kontakOn == true && kecepatan <= kecepatanMax) {
            kecepatan += 5;
        } else if (kecepatan > kecepatanMax) {
            System.out.println("Kecepatan tidak bisa bertambah karena telah mencapai maksimum");
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off!\n");
        }
    }

    public void kurangiKecepatan(){
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off!\n");
        }
    }

    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kontak on");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
