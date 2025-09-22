package sk.kasv.sauer.school;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private int weight;
    private Mobile phone;
    private Bicycle bicycle;

    // konstruktor
    public Student(){ // bezparametricky konstruktor
        System.out.println("New object of class Student has been created.");
    }

    public Student(String firstName, String lastName, double height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
    }

    // setters - metoda, ktora nastavi nejaku premennu
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPhone(Mobile phone) {
        this.phone = phone;
    }

    public void setBicycle(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    // getters - metoda, ktora vracia hodnotu premennej
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public double getHeight(){
        return height;
    }

    public double getWeight(){
        return weight;
    }

    public Bicycle getBicycle() {
        return bicycle;
    }

    // methods
    public double calcBMI(){
        double bmi = weight / (height * height);
        return bmi;
    }

    public void info() {
        System.out.println("I am student." + " My name is " + firstName + " " + lastName + ", I am " + age + " years old.");
    }

    public void mobileInfo() {
        System.out.println("My mobile is: " + phone);
    }

    public void bicycleInfo() {
        System.out.println("My bicycle is: " + bicycle);
    }
}
