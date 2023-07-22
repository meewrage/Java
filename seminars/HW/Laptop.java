package seminars.HW;

public class Laptop {
    private String brand;
    private String model;
    private int ram;
    private int storage;
    private String os;
    private String color;

    // Constructor
    public Laptop(String brand, String model, int ram, int storage, String os, String color) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    // Override toString() to display laptop information
    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", RAM: " + ram + "GB, Storage: " + storage + "GB, OS: " + os + ", Color: " + color;
    }
}

