package Jobsheet09.Tugas;

public class Singa extends Binatang implements IKarnivora{
    private String suara;
    private String warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override 
    public void displayMakan() {
        System.out.println("Memakan Daging");
    }

    @Override 
    public void displayBinatang() {
        System.out.println("Nama : " + nama);
        System.out.println("Jumlah Kaki : " + jmlKaki);
    }

    public void displayData() {
        this.displayBinatang();
        this.displayMakan();
        System.out.println("Suara :" + suara);
        System.out.println("Warna Bulu :" + warnaBulu);
    }
}
