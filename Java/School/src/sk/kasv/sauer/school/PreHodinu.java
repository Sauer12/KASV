package sk.kasv.sauer.school;

public class PreHodinu {
    public static void main(String[] args) {
        PreHodinu obj = new PreHodinu();
        // 1. trojuholnik
        System.out.println("Is triangle rectangular: " + obj.triangle(3, 4, 5));
        System.out.println("Is triangle rectangular: " + obj.triangle(5, 12, 13));
        System.out.println("Is triangle rectangular: " + obj.triangle(8, 15, 17));
        System.out.println("Is triangle rectangular: " + obj.triangle(2, 3, 4));

        // 2. calculate BMI
        double weight = 80;
        double height = 1.83;
        obj.calcBMI(weight, height);
    }

    // 1. trojuholnik
    public boolean triangle(double a, double b, double c){
        if (a > b && a > c)
            return Math.pow(c, 2.0) + Math.pow(b, 2.0) == Math.pow(a, 2.0);
        else if (b > a && b > c)
            return Math.pow(c, 2.0) + Math.pow(a, 2.0) == Math.pow(b, 2.0);
        else{
            return Math.pow(a, 2.0) + Math.pow(b, 2.0) == Math.pow(c, 2.0);
        }
    }

    // 2. calculate BMI
    public void calcBMI(double weight, double height){
        double bmi = weight / (height * height);
        if(bmi < 20)
            System.out.println("BMI: " + bmi + ": podváha");
        else if(bmi >= 20 && bmi <= 25)
            System.out.println("BMI: " + bmi + ": normálna");
        else if(bmi > 25 && bmi <= 30)
            System.out.println("BMI: " + bmi + ": nadváha");
        else
            System.out.println("BMI: " + bmi + ": obezita");
    }
}
