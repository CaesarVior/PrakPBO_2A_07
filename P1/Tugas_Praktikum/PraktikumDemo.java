package Tugas_Praktikum;

public class PraktikumDemo {
    public static void main(String[] args) {
        Pencil pencil = new Pencil();
        Book book = new Book();
        ElectronicLaptop laptop = new ElectronicLaptop();
        ElectronicHp handphone = new ElectronicHp();

        pencil.setBrand("Faber Castell");
        pencil.setColor("Black");
        pencil.setType("HB");
        pencil.setWeight("10g");
        pencil.displayInfo();

        book.setTitle("The Art Of Manipulation");
        book.setAuthor("Robert Covert");
        book.setGenre("Self Improvement");
        book.setPublisher("Amazon KDP");
        book.displayInfo();

        laptop.setBrand("Lenovo LOQ");
        laptop.setColor("Gray");
        laptop.setBatteryCapacity("5000mAh");
        laptop.setProcessor("Intel Core I5");
        laptop.setRam("12GB");
        laptop.setStorage("512GB SSD");
        laptop.displayInfo();

        handphone.setBrand("Infinix Note 30");
        handphone.setColor("Gray");
        handphone.setBatteryCapacity("2000mAh");
        handphone.setNumberOfCameras("3");
        handphone.displayInfo();
    }
}
