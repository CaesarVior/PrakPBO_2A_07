public class PerpustakaanMain {
    public static void main(String[] args) {
        Perpustakaan transaksi1 = new Perpustakaan();
        Perpustakaan transaksi2 = new Perpustakaan();
        Perpustakaan transaksi3 = new Perpustakaan();

        int denda = 0;



        transaksi1.idTransaksi = 7;
        transaksi1.namaPeminjam = "Bagus Saputra";
        transaksi1.judul = "Pemrograman Java";
        transaksi1.jumlahHari = 7;
        transaksi1.storeData();
        transaksi1.displayTransaction();
        transaksi1.displayLateCharge();

        System.out.println();

        transaksi2.idTransaksi = 2;
        transaksi2.namaPeminjam = "Putri Ayu";
        transaksi2.judul = "Struktur Data";
        transaksi2.jumlahHari = 10;
        transaksi2.storeData();
        transaksi2.displayTransaction();
        transaksi2.displayLateCharge();

        System.out.println();

        transaksi3.idTransaksi = 3;
        transaksi3.namaPeminjam = "Ahmad Ali";
        transaksi3.judul = "Algoritma";
        transaksi3.jumlahHari = 17;
        transaksi3.storeData();
        transaksi3.displayTransaction();
        transaksi3.displayLateCharge();
    }
}
