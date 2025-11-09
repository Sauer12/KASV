package sk.kasv.sauer.school;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;

public class PracticeWhile {

    public static void main(String[] args) {
        PracticeWhile pw = new PracticeWhile();
        Scanner sc = new Scanner(System.in);
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
//        System.out.println(pw.numericalSum(52513));

//        Mesiac a deň
//        System.out.print("Enter a day(1 - 31): ");
//        int day = sc.nextInt();
//        System.out.print("Enter a month(1 - 12): ");
//        int month = sc.nextInt();
//        pw.enterDay(day, month);


          System.out.print("How much money do you want to save?: ");
          int amount = sc.nextInt();
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

    // Vrati ciselny sucet, bere vstup number(int)
    public int numericalSum(int number){
        int sum = 0;
        while(number != 0){
            sum += number % 10;
            number = number / 10;
        }

        return number;
    }

    // Zadaj den od 1 do 31, zadaj mesiac od 1 do 12, zadaj datum, vypise mesiac retazec
    public void enterDay(int day, int month) {
        Scanner scanner = new Scanner(System.in);

        while (day < 1 || day > 31) {
            System.out.print("Please enter a valid day(1 - 31): ");
            day = scanner.nextInt();
        }
        while (month < 1 || month > 12) {
            System.out.println("Please enter a valid month(1 - 12): ");
            month = scanner.nextInt();
        }

        String textFormatMonth = numberMonthConvertToStringMonth(month);
        System.out.println("Today date: " + day + ". " + textFormatMonth);
    }

    public String numberMonthConvertToStringMonth(int month){
        String textFormatMonth = "";
        switch (month){
            case 1:
                textFormatMonth = "January";
                break;
            case 2:
                textFormatMonth = "February";
                break;
            case 3:
                textFormatMonth = "March";
                break;
            case 4:
                textFormatMonth = "April";
                break;
            case 5:
                textFormatMonth = "May";
                break;
            case 6:
                textFormatMonth = "June";
                break;
            case 7:
                textFormatMonth = "July";
                break;
            case 8:
                textFormatMonth = "August";
                break;
            case 9:
                textFormatMonth = "September";
                break;
            case 10:
                textFormatMonth = "October";
                break;
            case 11:
                textFormatMonth = "November";
                break;
            case 12:
                textFormatMonth = "December";
                break;
        }

        return textFormatMonth;
    }
}

