package sk.kasv.sauer.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("School app started.");
        pozdrav();
        Student ziak1 = new Student();
        ziak1.setAge(24);
        ziak1.setFirstName("Patrik");
        ziak1.setLastName("Tomeček");
        ziak1.setWeight(80);
        ziak1.setHeight(1.80);
        ziak1.info();
        double bmi = ziak1.calcBMI();
        System.out.println(ziak1.getFirstName() + " your BMI is " + bmi + "\n");

        Mobile mobile = new Mobile("Nokia 3310", "0917 863 823", 100);
        mobile.info();

        Student ziak2 = new Student("Ivana", "Hudakova", 1.64, 68);
        ziak2.setPhone(mobile);
        ziak2.setAge(32);
        ziak2.info();

        Bicycle bicycle = new Bicycle("Merida", 550, 8);
        ziak2.setBicycle(bicycle);
        ziak2.bicycleInfo();

        System.out.println("School app finished.");
    }

    public static void pozdrav(){
        System.out.println("Hello, how are you?");
    }
}