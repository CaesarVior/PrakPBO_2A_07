public class RuangKelas {
    public String namaGedung, kodeRuang;
    public int kapasitas, jumlahMahasiswa;

    public int hitungSisaKursi() {
        int sisaKursi = kapasitas - jumlahMahasiswa;
        return sisaKursi;
    }

    public void tampilData() {
        System.out.println("Nama Gedung         : " + namaGedung);
        System.out.println("Kode Ruang          : " + kodeRuang);
        System.out.println("Kapasitas           : " + kapasitas + " orang");
        System.out.println("Jumlah Mahasiswa    : " + jumlahMahasiswa + " orang");
        System.out.println();
        System.out.println("Sisa Kursi          : " + (hitungSisaKursi()) + " orang");
    }
}
