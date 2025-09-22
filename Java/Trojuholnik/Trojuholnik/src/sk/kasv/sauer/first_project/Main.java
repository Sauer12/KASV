package sk.kasv.sauer.first_project;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 7;

        int obvod = a + b + c;
        int s = obvod / 2;

        double obsah = Math.sqrt(s*(s - a) * (s - b) * (s - c));
        System.out.println("Obvod trojuholníka je: " + obvod);
        System.out.println("Obsah trojuholníka je: " + obsah);
    }
}
