package sk.kasv.sauer.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("School app started.");
        pozdrav();
        Student ziak1 =  new Student();
        ziak1.age = 24;
        ziak1.firstName = "Peter";
        ziak1.lastName = "Tomeček";
        ziak1.info();
        System.out.println("School app finished.");
    }

    public static void pozdrav(){
        System.out.println("Hello, how are you?");
    }
}