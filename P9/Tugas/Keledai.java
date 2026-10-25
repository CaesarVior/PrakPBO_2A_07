package Jobsheet09.Tugas;

public class Keledai extends Binatang implements IHerbivora{
    private String suara;
    private String warnaBulu;

    public Keledai(String nama,int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan(){
        System.out.println("Keledai Pemakan Tumbuhan");
    }

    @Override 
    public void displayBinatang(){
        super.displayBinatang();
    }

    public void displayData(){
        this.displayBinatang();
        this.displayMakan();
        System.out.println("Suara: "+suara);
        System.out.println("Warna Bulu: "+warnaBulu);
    }
}
