package Tugas;

public class Pembayaran {
    private String metode;

    public Pembayaran(String metode) {
        this.metode = metode;
    }

    public void bayar(String jumlah) {
        System.out.println("Total biaya Rp " + jumlah + 
        " dengan pembayaran via " + metode + " telah Sukses!");
    }
}