package Tugas_Praktikum;
public class Pencil {
    private String brand, color, type, weight;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void displayInfo() {
        System.out.println("================================ Pencil Information ================================");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
    }
}
