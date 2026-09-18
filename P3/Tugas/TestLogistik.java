import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kontainer kontainerAlfa =
             new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.print("\nMasukkan berat muatan yang akan ditambah (kg): ");
        double muatanTambah = scanner.nextDouble();
        kontainerAlfa.tambahMuatan(muatanTambah);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang akan diturunkan (kg): ");
        double muatanTurun = scanner.nextDouble();
        kontainerAlfa.turunkanMuatan(muatanTurun);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        scanner.close();
    }
}