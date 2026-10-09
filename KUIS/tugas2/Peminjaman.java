/**
 * TUGAS 2 - Relasi antar class.
 * Satu objek Peminjaman mencatat SATU mahasiswa yang meminjam SATU laptop.
 * Lengkapi setiap bagian bertanda TODO.
 */
public class Peminjaman {

    // TODO: deklarasikan atribut private (mahasiswa, laptop, aktif)
    private Mahasiswa mahasiswa;
    private Laptop laptop;
    private boolean aktif;

    public Peminjaman(Mahasiswa mahasiswa, Laptop laptop) {
        // TODO: simpan mahasiswa dan laptop. Peminjaman baru selalu aktif.
        this.mahasiswa = mahasiswa;
        this.laptop = laptop;
        this.aktif = true;
    }

    public Mahasiswa getMahasiswa() {
        // TODO
        return mahasiswa;
    }

    public Laptop getLaptop(Laptop laptop) {
        // TODO
        if (aktif == true) {
            return laptop;
        } else {
            return null;
        }
    }

    public boolean isAktif() {
        // TODO
        return aktif;
    }

    public void selesai() {
        // TODO: tandai peminjaman sudah tidak aktif
        aktif = false;
    }
}
