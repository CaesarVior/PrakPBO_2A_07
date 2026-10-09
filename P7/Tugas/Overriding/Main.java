package Tugas.Overriding;

public class Main {
    public static void main(String[] args) {
        Manusia manusia;
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();

        manusia = dosen;
        manusia.makan();  
        manusia.bernafas();
        dosen.lembur();

        System.out.println("-------------------");

        manusia = mahasiswa;
        manusia.makan();    
        manusia.bernafas();
        mahasiswa.tidur();
    }
}