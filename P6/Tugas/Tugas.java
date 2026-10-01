package Tugas;

public class Tugas {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("123", "Budi", "Jakarta");
        dosen1.setSKS(500000);
        dosen1.jumlahSKS = 12;

        Dosen dosen2 = new Dosen("456", "Siti", "Bandung");
        dosen2.setSKS(600000);
        dosen2.jumlahSKS = 10;

        DaftarPegawai daftarPegawai = new DaftarPegawai();
        daftarPegawai.addPegawai(dosen1);
        daftarPegawai.addPegawai(dosen2);

        daftarPegawai.printSemuaGaji();
    }
}
