package Tugas;

import java.util.ArrayList;

public class DaftarPegawai {
    int gaji;
    ArrayList<Pegawai> daftarPegawai = new ArrayList<>();

    public int daftarGaji(){
        return gaji;
    }

    public void addPegawai(Pegawai pegawai){
        daftarPegawai.add(pegawai);
    }

    public void printSemuaGaji(){
        for(Pegawai p : daftarPegawai){
            System.out.println("Nama: " + p.getNama() + ", Gaji: " + p.getGaji() + " Alamat: " + p.getAlamat() + " Jumlah SKS: " + ((Dosen) p).getJumlahSKS()); 
            // Karena function getJumlahSKS() hanya ada di class Dosen, maka kita harus dipanggil dulu Dosen dan diletakkan di p.
        }
    }
}
