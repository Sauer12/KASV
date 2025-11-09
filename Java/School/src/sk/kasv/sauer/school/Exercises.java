package sk.kasv.sauer.school;

import java.util.Random;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercises obj = new Exercises();
        obj.guessNumber(7, scanner);
    }

    public void guessNumber(int repeats, Scanner scanner){
        int guessedNumber = new Random().nextInt(1, 101);
        int number = 0;

        for(int i = 0; i < repeats; i++){
            System.out.println("This is your (" + (i + 1) + " / " + repeats + ") attempt");
            System.out.print("Guess number: ");
            number = scanner.nextInt();
            if(number > guessedNumber){
                System.out.println(number + " is > as guessed number");
            } else if (number < guessedNumber) {
                System.out.println(number + " is < as guessed number");
            } else{
                System.out.println("Correct, you win, it is " + guessedNumber + "!");
                return;
            }
        }
        System.out.println("You lost!");
    }
}
