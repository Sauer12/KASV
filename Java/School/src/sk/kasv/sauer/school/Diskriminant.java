package sk.kasv.sauer.school;

public class Diskriminant {
    public static void main(String[] args) {
        Diskriminant obj = new Diskriminant();
        obj.quadraticFormula(0, -7, -30);
        obj.quadraticFormula(1, 2, 7);
        obj.quadraticFormula(2, 20, 50);
        obj.quadraticFormula(1, 3, -10);
    }

    public void quadraticFormula(double a, double b, double c) {
        System.out.println("\na = " + a + ", b = " + b + ", c = " + c);
        double discriminant = (b * b) - (4 * a * c);
        if(a == 0){
            System.out.println("Toto nie je kvadratická rovnica!");
            return;
        }

        if (discriminant < 0)
            System.out.println("Kvadratická rovnica nemá riešenie!");
        else if (discriminant == 0)
            System.out.println("Koreň: " + -b / (2 * a));
        else {
            System.out.println("Koreň 1: " + ((-b + Math.sqrt(discriminant))) / (2 * a));
            System.out.println("Koreň 2: " + ((-b - Math.sqrt(discriminant))) / (2 * a));
        }
    }
}
