public class BagiKelompok {
    // public static void main(String[] args) {
    //     System.out.println("Awal program");

    //     int jumlahMahasiswa = 32;
    //     int jumlahKelompok = 0;
    //     int anggotaPerKelompok = jumlahMahasiswa/jumlahKelompok;

    //     System.out.println(anggotaPerKelompok);
    //     System.out.println("akhir program");

    // }

    public static void main(String[] args) {
        System.out.println("Awal program");

        int jumlahMahasiswa = 32;
        int jumlahKelompok = 4;
        int anggotaPerKelompok = 0;

        try {
            anggotaPerKelompok = jumlahMahasiswa/jumlahKelompok;
        } catch (ArithmeticException e) {
            System.out.println("Jumlah kelompok tidak boleh nol");
        }

        System.out.println(anggotaPerKelompok);
        System.out.println("akhir program");
    }
}
