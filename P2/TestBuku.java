public class TestBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        Buku buku3 = new Buku();

        buku1.isbn = "978-979-29-6104-2";
        buku1.judul = "Dasar Pemrograman Berbasis Objek";
        buku1.penulis = "Abdul Kadir";
        buku1.tahunTebrit = 2021;

        buku2.isbn = "978-979-29-6104-3";
        buku2.judul = "Dasar Website Berbasis Framework";
        buku2.penulis = "Abdul Kadir";
        buku2.penerbit = "Andi Offset";
        buku2.tahunTebrit = 2024;

        buku3.isbn = "978-979-29-6104-1";
        buku3.judul = "Dasar Sistem Operasi";
        buku3.penulis = "Abdul Kadir";
        buku3.penerbit = "Andi Offset";
        buku3.tahunTebrit = 2025;

        try {
            buku1.tampilInfoBuku();
            System.out.println("==============================");
            buku2.tampilInfoBuku();
            System.out.println("==============================");
            buku3.tampilInfoBuku();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
