package Percobaan2;

public class PascaSarjana extends Mahasiswa implements ICumlaude, IBerprestasi {

    public PascaSarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIpkTinggi() {
        System.out.println("IPK-ku lebih dari 3,71");
    }

    @Override
    public void menjuaraiKompetisiInternasional() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiahInternasional() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }

    @Override
    public void menjuaraiKompetisiNasional() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiahNasional() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }
}