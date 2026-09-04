public class TestLaptop {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();

        laptop1.kodeInventaris = "LAB-JTI-017";
        laptop1.merk = "Lenovo Thinkpad E14";
        laptop1.ramGB = 8;
        laptop1.hari = 3;
        laptop1.tampilSpesifikasi();
        System.out.println("RAM Setelah Upgrade : " + 
            laptop1.upgradeRam(8) + " GB");
        System.out.println("Harga Sewa          : Rp. " +
             laptop1.hitungHargaSewa(laptop1.hari));

    }
}
