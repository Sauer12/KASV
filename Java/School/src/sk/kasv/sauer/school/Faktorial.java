package sk.kasv.sauer.school;

public class Faktorial {
    public static void main(String[] args) {
        int test = factorial(32);
        System.out.println(test);
    }

    public static int factorial(int number){
        int fact = 1;

        for(int i = 1; i <= number; i++){
            fact = fact * i;
        }

        return fact;
    }
}
