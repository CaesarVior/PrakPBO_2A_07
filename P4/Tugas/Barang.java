package Tugas;

public class Barang {
    private String namaProduk;
    private String harga;

    public Barang(String namaProduk, String harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public String getHarga() {
        return harga;
    }
}