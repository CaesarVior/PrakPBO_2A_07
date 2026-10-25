package Jobsheet09.Tugas;

public class Gorilla extends Binatang implements IKarnivora, IHerbivora {
    private String suara;
    private String warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
        this.jmlKaki = jmlKaki;
    }

    @Override 
    public void displayMakan() {
        System.out.println("Gorilla memakan daging dan tumbuhan");
    }

    @Override 
    public void displayBinatang() {
        super.displayBinatang();
    }

    public void displayData() {
        this.displayBinatang();
        this.displayMakan();
        System.out.println("Suara: " + suara);
        System.out.println("Warna Bulu: " + warnaBulu);
    }
}
