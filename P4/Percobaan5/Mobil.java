package Percobaan5;

public class Mobil {
    private String merek;
    private Mesin mesin;

    // Tambahan ketika Mobil dihilangkan Mesin tidak ikut hilang
    public Mobil(String merk, Mesin mesin){
        this.merek = merk;
        this.mesin = mesin;
    }

    public Mobil(String merek) {
        this.merek = merek;
        this.mesin = new Mesin();
    }

    public void tampilkanInfo() {
        System.out.println("Mobil: " + merek);
        System.out.println("Mesin: " + mesin.getTipe());
    }
}