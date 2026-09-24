package Tugas;

public class MainTokoOnline {
    public static void main(String[] args) {
        Pelanggan p1 = new Pelanggan("Budi");
        Pesanan pesanan1 = new Pesanan(p1, "Laptop Gaming", "1500000");
        Pembayaran bayarQRIS = new Pembayaran("QRIS");
        pesanan1.prosesBayar(bayarQRIS);
    }
}
