public class Laptop {
    public String kodeInventaris, merk;
    public int ramGB, harga, hari;

    public void tampilSpesifikasi(){
        System.out.println("Kode Inventaris     : " + kodeInventaris);
        System.out.println("Merk                : " + merk);
        System.out.println("RAM (GB)            : " + ramGB);
        System.out.println("Sewa                : " + hari + " hari");
    }   

    public int upgradeRam(int tambahanRam){
        int ramBaru = ramGB + tambahanRam;
        ramGB = ramBaru;
        return ramBaru;
    }

    public int hitungHargaSewa(int hari){
        harga = 25000 * hari;
        return harga;
    }
}
