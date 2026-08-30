package Tugas_Praktikum;
public class ElectronicHp extends Electronic {
    private String numberOfCameras;

    public void setNumberOfCameras(String numberOfCameras) {
        this.numberOfCameras = numberOfCameras;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Cameras: " + numberOfCameras);
    }
}
