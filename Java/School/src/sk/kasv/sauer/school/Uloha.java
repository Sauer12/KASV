package sk.kasv.sauer.school;

import java.util.Scanner;

public class Uloha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. 
        System.out.print("Enter a number: ");
        whileNotZero(scanner);
        System.out.println("You entered a number zero, the program ended!");

        //2.
        System.out.println(reverse(105));
    }

    // 1. Uzivatel zadava v cykle cisla dokym nezada cislo 0, potom sa funkcia skonci a vypise sa sucet vsetkych zadanych cisel
    // - taktiez funkcia vypocita priemer cisel a taktiez najde najvacsie cislo
    public static void whileNotZero(Scanner scanner){
        int number, sum = 0, count = 0, max = 0;
        while((number = scanner.nextInt()) != 0) {
            System.out.println("You entered a number: " + number);
            sum += number;
            System.out.print("Enter a number: ");
            count++;
            if(max < number)
                max = number;
        }

        double average = 0;
        if(count > 0){
            average = (double) sum / count;
        }

        System.out.println("\nSummary of all numbers is " + sum);
        System.out.println("Average of all numbers is " + average);
        System.out.println("Max number is " + max);
    }

    // 2. Prevrati cislo na opacne cislo (napr. 105 -> 501)
    public static int reverse(int number){
        String reversedNumber = "";
        while(number != 0){
            reversedNumber += String.valueOf(number % 10);
            number = number / 10;
        }

        return Integer.parseInt(reversedNumber);
    }
}

// name: ACER E705511C
// password: 57446391