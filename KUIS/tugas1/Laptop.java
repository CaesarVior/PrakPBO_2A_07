/**
 * TUGAS 1 - Enkapsulasi.
 * Lengkapi setiap bagian bertanda TODO sesuai spesifikasi di lembar soal.
 * Jangan mengubah nama class, nama method, maupun tipe parameternya.
 */
public class Laptop {
    private String kodeAset;
    private String merk;
    private int ramGB;
    private boolean isTersedia;
    private int ramBaru; 

    public Laptop(String kodeAset, String merk, int ramGB) {
        getRamGB(ramGB);
        getMerk(merk);
        getKodeAset(kodeAset);
    }

    public String getKodeAset(String kodeAset) {
        // TODO
        kodeAset = kodeAset.trim(); 
        if (kodeAset == null || kodeAset.equalsIgnoreCase("LP-")) {
            throw new IllegalArgumentException("Kode aset tidak boleh kosong");
        } else {
            return kodeAset;
            
        }
    }

    public String getMerk(String merk) {
        // TODO
        if (merk != null && !merk.trim().isEmpty()) {
            return merk;
        } else {
            throw new IllegalArgumentException("Merk tidak boleh kosong");
            
        }
    }

    public int getRamGB(int ramGB) {
        // TODO
        if (ramGB == 4 || ramGB == 8 || ramGB == 16 || ramGB == 32) {
            return ramGB;
        } else {
            throw new IllegalArgumentException("RAM harus 4, 8, atau 16 GB");
        }
    }

    public boolean isTersedia() {
        // TODO
        return isTersedia;
    }

    public void upgradeRam(int ramBaru) {
        // TODO
        if (ramBaru == 4 || ramBaru == 8 || ramBaru == 16 || ramBaru == 32) {
            this.ramBaru = ramBaru;
            this.ramGB += ramBaru;
        } else {
            throw new IllegalArgumentException("RAM harus 4, 8, atau 16 GB");
        }
    }

    public boolean pinjam() {
        // TODO
        if (isTersedia == true) {
            isTersedia = false;
            return true;
        } else {
            return false;
        }
    }

    public void kembalikan() {
        // TODO
        if (isTersedia) {
            throw new IllegalStateException("Laptop sudah dikembalikan");
        } else {
            isTersedia = true;
        }
    }

    public String info() {
        // TODO
        String tmp = kodeAset + merk + ramGB + isTersedia + ramBaru;
        return tmp;
    }
}
