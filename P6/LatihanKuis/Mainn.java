package LatihanKuis;

public class Mainn {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("19850101", "Dr.Indra", 12);
        MataKuliah mk = new MataKuliah("PBO01", "Pemrograman Berbasis Objek", dosen1);

        mk.tampilInfoMataKuliah();
    }
}
