import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TUGAS 2 - Relasi antar class.
 * Laboratorium menampung banyak Laptop dan mencatat semua Peminjaman.
 * Lengkapi setiap bagian bertanda TODO sesuai spesifikasi di lembar soal.
 */
public class Laboratorium {
    public static final int MAKS_PINJAM = 2;   // batas pinjaman aktif per mahasiswa

    private final String nama;
    private final List<Laptop> daftarLaptop = new ArrayList<>();
    private final List<Peminjaman> riwayat = new ArrayList<>();

    public Laboratorium(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public boolean tambahLaptop(Laptop lp) {
        // TODO
        if(lp == null || cariLaptop(lp.getKodeAset()) != null) {
            return lp == null ? false : false;
        } else {
            daftarLaptop.add(lp);
            return true;
        }
    }

    public Laptop cariLaptop(String kodeAset) {
        // TODO
        if (daftarLaptop.isEmpty()) {
            return null;
        } else {
            for (Laptop lp : daftarLaptop) {
                if (lp.getKodeAset().equals(kodeAset)) {
                    return lp;
                }
            }
            return null;
            
        }
    }

    public int jumlahPinjamanAktif(Mahasiswa m) {
        // TODO
        int count = 0;
        for (Peminjaman p : riwayat) {
            if (p.getMahasiswa() == m && p.isAktif()) {
                count++;  
            }
        }
        return count;
    }

    public Peminjaman pinjamkan(Mahasiswa m, String kodeAset) {
        // TODO
        Laptop lp = cariLaptop(kodeAset);
        if (lp == null || !lp.isTersedia() || jumlahPinjamanAktif(m) >= MAKS_PINJAM) {
            return null;
        } else {
            Peminjaman p = new Peminjaman(m, lp);
            riwayat.add(p);
            lp.pinjam();
            return p; 
        }
    }

    public boolean kembalikan(String kodeAset) {
        // TODO
        for (Peminjaman p : riwayat) {
            if (p.getLaptop(p.getLaptop(null)).getKodeAset().equals(kodeAset) && p.isAktif()) {
                p.selesai();
                p.getLaptop(p.getLaptop(null)).kembalikan();
                p.isAktif();
                return true;
            }
        }
        return false;
    }

    public List<Laptop> getDaftarLaptop() {
        return Collections.unmodifiableList(daftarLaptop);
    }
}
