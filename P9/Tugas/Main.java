package Jobsheet09.Tugas;

public class Main {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Keledai", 4, "hehehe", "Coklat");
        Singa singa = new Singa("Simba", 4, "Meroam", "Coklat Muda");
        Gorilla gorilla = new Gorilla("Ucup", 2,"ngekngok" , "Hitam Abu");

        System.out.println("Data Hewan");
        System.out.println("Keledai");
        keledai.displayData();
        System.out.println();

        System.out.println("Singa");
        singa.displayData();
        System.out.println();
        
        System.out.println("Gorilla");
        gorilla.displayData();
        }
    }
