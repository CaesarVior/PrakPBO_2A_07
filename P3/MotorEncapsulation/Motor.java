package MotorEncapsulation;

public class Motor{
    private int kecepatan = 0;
    private int tambahKecepatan = 90;
    private boolean kontakOn = false;

    public void nyalakanMesin(){
        kontakOn = true;
    }

    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan(){
        int temp = kecepatan + tambahKecepatan;
        if (kontakOn == true) {
            if (kecepatan > 100 ) {
                return;
            } else if (temp > 100) {
                System.out.println("Mohon Maaf. Kecepatan Maksimal adalah 100");
            } else {
                kecepatan += tambahKecepatan;
            }
        } else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

    public void kurangiKecepatan(){
        if (kontakOn == true) {
            kecepatan -= 5;
            printStatus();
        } else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

    public void printStatus(){
        System.out.println();
        if (kontakOn == true) {
            System.out.println("Kontak On");
            if (kecepatan >= 100) {
                System.out.println("Kecepatan Maksimal adalah 100");
                return;
            } else{
                System.out.println("Kecepatan " + kecepatan + "\n");
            }
        } else {
            System.out.println("Kontak Off");
        }
    }
}