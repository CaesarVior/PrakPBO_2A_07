package LatihanKuis;

public class Dosen {
    private String nip;
    private String namaMk;
    private int jumlahSks;

    public Dosen(String nip, String namaMk, int jumlahSks){
        this.nip = nip;
        this.namaMk = namaMk;
        setJumlahSks(jumlahSks);
    }

    public void setJumlahSks(int sks) {
        if (sks < 0) {
            System.out.println("Nilai sks tidak boleh kurang dari 0");
            this.jumlahSks = 0;
        } else {
            this.jumlahSks += sks;
        }
    }

    public void tampilInfoDosen(){
        System.out.println("Nip: " + nip + " Nama: " + namaMk + " Jumlah SKS: " + jumlahSks);
    }
}
