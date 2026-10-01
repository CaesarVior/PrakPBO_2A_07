package Tugas;

public class Dosen extends Pegawai {
    int jumlahSKS, tarifSKS;

    public Dosen(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setSKS(int tarifSks){
        this.tarifSKS = tarifSks;
    }

    public int getGaji(){
        return jumlahSKS * tarifSKS;
    }

    public int getJumlahSKS(){
        return jumlahSKS;
    }
}
