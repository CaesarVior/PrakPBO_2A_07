public class RuangKelasMain {
    public static void main(String[] args) {
        RuangKelas ruang1 = new RuangKelas();
        RuangKelas ruang2 = new RuangKelas();
        RuangKelas ruang3 = new RuangKelas();

        ruang1.namaGedung = "Gedung A";
        ruang1.kodeRuang = "A101";
        ruang1.kapasitas = 50;
        ruang1.jumlahMahasiswa = 45;
        ruang1.tampilData();

        System.out.println("================================");

        ruang2.namaGedung = "Gedung B";
        ruang2.kodeRuang = "B202";
        ruang2.kapasitas = 50;
        ruang2.jumlahMahasiswa = 50;
        ruang2.tampilData();

        System.out.println("==============================");

        ruang3.namaGedung = "Gedung C";
        ruang3.kodeRuang = "C303";
        ruang3.kapasitas = 40;
        ruang3.jumlahMahasiswa = 45;
        ruang3.tampilData();
    }
}
