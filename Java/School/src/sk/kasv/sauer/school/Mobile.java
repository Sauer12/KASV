package sk.kasv.sauer.school;

public class Mobile {
    private String brand;
    private String number;
    private int memory;

    public Mobile(String brand, String number, int memory) {
        this.brand = brand;
        this.number = number;
        this.memory = memory;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getBrand(){
        return brand;
    }

    public String getNumber(){
        return number;
    }

    public int getMemory(){
        return memory;
    }

    public void info(){
        System.out.println("Mobil: " + brand + ", \nPhone number: " + number + ", \nMemory: " + memory);
    }

    public String toString(){
        return "brand: " + brand + ", number: " + number;
    }
}
