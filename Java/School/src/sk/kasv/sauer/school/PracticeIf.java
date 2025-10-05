package sk.kasv.sauer.school;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class PracticeIf {
    public static void main(String[] args) {
//        // 1. Uloha - dospely, nedospely
//        System.out.print("Enter your year of birth: ");
//        calculateAge(new Scanner(System.in).nextInt());
//
//        // 2. Uloha - positive or negative
//        System.out.print("\nEnter a number: ");
//        isPositiveOrNegative(new Scanner(System.in).nextInt());
//
//        // 3. Uloha - even or odd
//        System.out.print("\nEnter a number(even/odd): ");
//        isEvenOrOdd(new Scanner(System.in).nextInt());
//
//        // 4. Uloha - delenie dvoch cisel
//        System.out.println("\nEnter two numbers: ");
//        divide(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt());
//
//        // 5. Uloha - matematika
//        testMath();
//
//        //6. Uloha - delenie dvojkou ci trojkou
//        System.out.print("Enter a number: ");
//        int number = new Scanner(System.in).nextInt();
//        twoThree(number);

        // 7.
//        calculateLoan(1000, 10000, 12);

        // 8. Znamka if
//        System.out.println("Zadaj známku: ");
//        int mark = new Scanner(System.in).nextInt();
//        writeMarkIf(mark);

        // 9. Znamka switch
        // writeMark(5);

        // uloha 9
//        Scanner sc = new Scanner(System.in);
////
////        System.out.print("Enter a day [1-7]: ");
////        int day = sc.nextInt();
////        workDayOrWeekend(day);
////
////        // uloha 13
////        System.out.print("Enter a temperature: ");
////        double temperature = sc.nextDouble();
////        isFreeze(temperature);
////
////        // uloha 18
////        System.out.print("Enter a number a: ");
////        int a = sc.nextInt();
////        System.out.print("Enter a number b: ");
////        int b = sc.nextInt();
////        System.out.print("Enter a number c: ");
////        int c = sc.nextInt();
////        maxNumber(a, b, c);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a: ");
        int a = sc.nextInt();
        System.out.print("Enter a number b: ");
        int b = sc.nextInt();
        System.out.print("Enter a number c: ");
        int c = sc.nextInt();
        System.out.print("Enter a number d: ");
        int d = sc.nextInt();
        minNumber(a, b, c, d);
    }

    // 1. Uloha - dospely, nedospely
    public static void calculateAge(int yearOfBirth) {
        int age = LocalDate.now().getYear() - yearOfBirth;
        if (age >= 18) {
            System.out.println("You are adult and you has " + age + " years");
        } else {
            System.out.println("You are not adult and you has " + age + " years");
        }
    }

    // 2. positive or negative
    public static void isPositiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is negative");
        }
    }

    // 3. even alebo odd
    public static void isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.printf("Number %d is even", number);
        } else {
            System.out.printf("Number %d is odd", number);
        }
    }

    // 4. division of two numbers
    public static void divide(int a, int b) {
        if (b != 0) {
            System.out.println((double) a / b);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    // 5. Vynasobi 2 cisla a necha uzivatela zadat vysledok, podla toho napise, ci je dobra alebo zla odpoved
    public static void testMath() {
        Random random = new Random();
        int countRight = 0;

        for (int i = 0; i < 3; i++) {
            int x = random.nextInt(1, 21);
            int y = random.nextInt(1, 21);
            System.out.print(x + " * " + y + " = ");
            int result = new Scanner(System.in).nextInt();
            if (result == x * y) {
                System.out.println("Correct answer");
                countRight++;
            } else {
                System.out.println("Wrong answer");
            }
        }
        System.out.println("You have " + countRight + " right answers");
    }

    // 6. zobere cislo a vrati vypis toho, ci je alebo nie je delitelne dvojkou ci trojkou
    public static void twoThree(int a) {
        if (a % 2 == 0) {
            if (a % 3 == 0) {
                System.out.println("A is possible to divide by two and three");
            } else {
                System.out.println("A is possible to divide by two");
            }
        } else {
            if (a % 3 == 0) {
                System.out.println("A is possible to divide by three");
            } else {
                System.out.println("A is not possible to divide by two and three");
            }
        }
    }

    // 7. Vypocet pozicky
 /*   public static void calculateLoan(int salary, int loan, int percentage) {
        double totalSum = loan * (1 + (percentage / 100.0));
        double monthlyPayment = totalSum / 12.0;
    } */

    // 8. Znamka Switch
    public static void writeMark(int mark) {
        switch (mark) {
            case 1:
                System.out.println("Výborný");
                break;
            case 2:
                System.out.println("Chválitebný");
                break;
            case 3:
                System.out.println("Dobrý");
                break;
            case 4:
                System.out.println("Dostatočný");
                break;
            case 5:
                System.out.println("Nedostatočný");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }

    // 9. Znamka if
    public static void writeMarkIf(int mark) {
        if (mark == 1) {
            System.out.println("Výborný");
        } else if (mark == 2) {
            System.out.println("Chválitebný");
        } else if (mark == 3) {
            System.out.println("Dobrý");
        } else if (mark == 4) {
            System.out.println("Dostatočný");
        } else if (mark == 5) {
            System.out.println("Nedostatočný");
        } else {
            System.out.println("Invalid input!");
        }
    }

    //uloha 9. pracovny ci vikendovy den
    public static void workDayOrWeekend(int day) {
        if (day >= 1 && day <= 5) {
            System.out.println("Workday");
        } else if (day == 6 || day == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid input!");
        }
    }

    //uloha 13. mrzne/nemrzne
    public static void isFreeze(double temperature) {
        if (temperature < 0) {
            System.out.println("It is freezing");
        } else {
            System.out.println("It is not freezing");
        }
    }


    //uloha 18. max number z troch cisel
    public static void maxNumber(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Max number is " + a);
        } else if (b > c && b > a) {
            System.out.println("Max number is " + b);
        } else {
            System.out.println("Max number is " + c);
        }
    }

    //uloha 18. max number z troch cisel - druhy sposob
    public static void maxNumber2(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("Max number is " + a);
            } else {
                System.out.println("Max number is " + c);
            }
        }
        else{
            if (b > c){
                System.out.println("Max number is " + b);
            }else{
                System.out.println("Max number is " + c);
            }
        }
    }

    //Minimum zo 4 cisel
    public static void minNumber(int a, int b, int c, int d){
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        if (d < min)
            min = d;
        System.out.println("Min number is " + min);
    }

    //Minimum zo 4 cisel - zly sposob
//    public static void minNumber2(int a, int b, int c, int d){
//        if(a < b){
//            if(a < c){
//                if(a < d){
//                    System.out.println("Min number is " + a);
//                }
//                else{
//                    System.out.println("Min number is " + d);
//                }
//            }
//            else if(c < d){
//                System.out.println("Min number is " + c);
//            }else{
//                System.out.println("Min number is " + d);
//            }
//        } else {
//            if(b < c){
//                if (b < d){
//                    System.out.println("Min number is " + b);
//                }else{
//                    System.out.println("Min number is " + d);
//                }
//            }else if (c < d){
//                System.out.println("Min number is " + c);
//            }else{
//                System.out.println("Min number is " + d);
//            }
//        }
//    }
}