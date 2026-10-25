package Percobaan2;

public class Mahasiswa {
    protected String nama;

    public Mahasiswa(String nama){
        this.nama = nama;
    }

    public void kuliahDikampus(String kampus){
        System.out.println("Aku mahasiswa, namaku " + nama);
        System.out.println("Aku berkuliah di kampus.");
    }
}
