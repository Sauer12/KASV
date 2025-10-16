package sk.kasv.sauer.school;

import java.util.Random;
import java.util.Scanner;

public class PracticeWhile {

    public static void main(String[] args) {
        PracticeWhile pw = new PracticeWhile();

//        pw.print1to20();
//        pw.enterAndPrintEvenNumber();
//        pw.money();

//        int a = 0, b = 0, c = 0, d = 0;
//        do{
//            Random rd = new Random();
//            a = rd.nextInt(1,11);
//            b = rd.nextInt(1,11);
//            c = rd.nextInt(1,11);
//            d = rd.nextInt(1, 11);
//        }while(a == b || b == c || a == c || a == d || b == d || c == d);
//
//        System.out.println(a + " " + b + " " + c + " " + d);

//        pw.generateNNumbers(20);
//        pw.generateThreeRandomNumbers();
        pw.numericalSum(52513);
    }

    public void print1to20(){
        int i = 1;
        while(i <= 20){
            System.out.println(i);
            i++;
        }
    }

    public void enterAndPrintEvenNumber() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num % 2 != 0){
            System.out.println("Please enter an even number:");
            num = sc.nextInt();
        }
        System.out.println("Thank you! You entered: " + num);
    }

    public double money(){
        int day = 1;
        double savings = 0;
        double actual = 0.01;
        while(day <= 30){
            savings += actual;
            actual *= actual;
            day++;
        }

        return savings;
    }

    public void generateThreeRandomNumbers(){
        Random rd = new Random();
        int a = rd.nextInt(1, 11), b = rd.nextInt(1, 11), c = rd.nextInt(1, 11);

        while(a == b || b == c || a == c){
            if(a == b)
                a = rd.nextInt(1,11);
            if(b == c)
                b = rd.nextInt(1,11);
            if(a == c)
                c = rd.nextInt(1,11);
        }

        System.out.println(a + " " + b + " " + c);
    }

//    public void generateNNumbers(int n){
//        int[] nums = new int[n];
//        Random rd = new Random();
//    }

    // Vypise ciselny sucet, bere vstup number a ten vypise
    public void numericalSum(int number){
        int sum = 0;
        while(number != 0){
            sum += number % 10;
            number = number / 10;
        }

        System.out.println(sum);
    }
}
