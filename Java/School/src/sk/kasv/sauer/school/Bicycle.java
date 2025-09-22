package sk.kasv.sauer.school;

public class Bicycle {
    private String brand;
    private float price;
    private int gearNumber;

    public Bicycle(String brand, float price, int gearNumber) {
        this.brand = brand;
        this.price = price;
        this.gearNumber = gearNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getGearNumber() {
        return gearNumber;
    }

    public void setGearNumber(int gearNumber) {
        this.gearNumber = gearNumber;
    }

    @Override
    public String toString() {
        return brand + " " + price + ", " + gearNumber;
    }
}
