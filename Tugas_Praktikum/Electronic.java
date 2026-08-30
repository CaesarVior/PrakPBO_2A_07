package Tugas_Praktikum;
public class Electronic {
    private String brand, color, batteryCapacity;

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void setBatteryCapacity (String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void displayInfo() {
        System.out.println("================================ Electronic Device Information ================================");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Battery Capacity: " + batteryCapacity);
    }
}
