public class Perpustakaan{
    public int idTransaksi, jumlahHari, jumlahHariTerlambat, denda;
    public String namaPeminjam, judul;

    public void displayTransaction(){
        System.out.println("ID Transaksi        : " + idTransaksi);
        System.out.println("Nama Peminjam       : " + namaPeminjam);
        System.out.println("Judul Buku          : " + judul);
        System.out.println("Jumlah Hari         : " + jumlahHari + " hari");    
    }
    
    public void storeData(){
        this.idTransaksi = idTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.judul = judul;
        this.jumlahHari = jumlahHari;
    }

    public void displayLateCharge(){
        calculalteLateCharge(jumlahHari);
        if (jumlahHariTerlambat == 0 && denda == 0) {
            System.out.println("Tidak ada denda yang harus dibayarkan.");
        } else {
            System.out.println("Jumlah Keterlambatan: " + (jumlahHari - 7) + " hari");
            System.out.println("Denda               : Rp. " + denda);
        }
    }

    public int calculalteLateCharge (int jumlahHariTerlambat){
        jumlahHariTerlambat = jumlahHari - 7;

        if (jumlahHariTerlambat < 0) {
            jumlahHariTerlambat = 0;
        } 

        denda = 1000 * jumlahHariTerlambat;
        return denda;
    }
}