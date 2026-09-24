public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    private int tmp;

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        //Sebelum
        // this.arrayKursi[nomor - 1].setPenumpang(penumpang);

        // Sesudah
        if (tmp != nomor) {
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
            tmp = nomor;
        } else {
            System.out.println("Terjadi Kesalahan!");
            System.err.println("Kursi Nomor " + (nomor) + " Sudah diisi");
            System.out.println();
        }
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}