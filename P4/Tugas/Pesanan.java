package Tugas;

public class Pesanan {
    private Pelanggan pelanggan; 
    private ItemPesanan item; 

    public Pesanan(Pelanggan pelanggan, String namaProduk, String harga) {
        // AGGREGATION: Menerima objek Pelanggan dari luar
        this.pelanggan = pelanggan; 

        // COMPOSITION: Membuat sendiri objek ItemPesanan dengan ditandai ada New
        this.item = new ItemPesanan(namaProduk, harga); 
    }

    // DEPENDENCY: Pembayaran hanya dipinjam dan ditandai dengan diletakkan di sebuah parameter
    public void prosesBayar(Pembayaran pembayaran) {
        System.out.println("Pesanan " + item.getNamaProduk() + " atas nama " + pelanggan.getNama());
        pembayaran.bayar(item.getHarga());
    }
}
