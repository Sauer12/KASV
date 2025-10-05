package sk.kasv.sauer.school;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Precvicovanie {
    public static void main(String[] args) {
        Precvicovanie p = new Precvicovanie();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number and I will tell you if it is divisible by 5: ");
        p.divisibleBy5(scanner.nextInt());

        System.out.print("\nEnter a year and I will tell you if it is a leap year: ");
        p.isLapYear(scanner.nextInt());
    }


    public void divisibleBy5(int number){
        if (number % 5 == 0){
            System.out.println("Divisible by 5");
        }else{
            System.out.println("Not divisible by 5");
        }
    }

    public void isLapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("It is a leap year");
        }else{
            System.out.println("It is not a leap year");
        }
    }
}
