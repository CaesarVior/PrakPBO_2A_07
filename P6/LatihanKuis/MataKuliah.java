package LatihanKuis;

public class MataKuliah {   
    String kodeMk;
    String namaMk;
    Dosen DosenPengampu; // Aggeragation atau Use A

    public MataKuliah(String kodeMk, String namaMk, Dosen DosenPengampu){
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.DosenPengampu = DosenPengampu;
    }

    public void tampilInfoMataKuliah(){
        System.out.println("Kode MK: " + kodeMk + " Nama MK: " + namaMk);
        DosenPengampu.tampilInfoDosen();
    }
}
