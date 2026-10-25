package Percobaan2;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswaCumlaude) {
        System.out.println("Saya REKTOR, memberikan sertifikat Cumlaude.");
        System.out.println("Selamat! Silakan perkenalkan diri Anda..");

        mahasiswaCumlaude.lulus();
        mahasiswaCumlaude.meraihIpkTinggi();
        System.out.println("--------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswaBerprestasi) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

        mahasiswaBerprestasi.menjuaraiKompetisiNasional();
        mahasiswaBerprestasi.membuatPublikasiIlmiahNasional();
        System.out.println("--------------------------------------------");

        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

        mahasiswaBerprestasi.menjuaraiKompetisiInternasional();
        mahasiswaBerprestasi.membuatPublikasiIlmiahInternasional();
        System.out.println("--------------------------------------------");
    }
}