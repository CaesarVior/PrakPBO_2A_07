public class MataKuliahMain {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "IF101";
        mk1.namaMK = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.nilaiAngka = 3.75;

        MataKuliah mk2 = new MataKuliah();
        mk2.kodeMK = "IF102";
        mk2.namaMK = "Pemrograman Berbasis Objek";
        mk2.sks = 4;
        mk2.nilaiAngka = 3.5;

        mk1.tampilData();
        mk2.tampilData();
    }
}
