public class MataKuliah {
    public String kodeMK, namaMK;
    public int sks;
    public double nilaiAngka;

    public void tampilData() {
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + namaMK);
        System.out.println("SKS              : " + sks);
        System.out.println("Nilai Angka      : " + nilaiAngka);
        System.out.println("Bobot Nilai      : " + hitungBobotNilai());
        System.out.println("------------------------------");
    }

    public double hitungBobotNilai() {
        double bobotNilai = sks * nilaiAngka;
        return bobotNilai;
    }
}
