package sk.kasv.sauer.school;

public class Example {

    private String name;

    private double value;

    private static int count;

    private static final double PI = 3.1415927;

    public Example(double value) {
        this.value = value;
    }

    public int m1(double value){
        name = "Fero";
        this.value = value;
        return 42;
    }

    public static int m2(){
        count=12;
        return 24;
    }

    public static void sayHello(){
        System.out.println("Hello world!");
    }

    public static void sayHallo(){
        System.out.println("Hallo from Example class! My value is " + count);
    }
}
