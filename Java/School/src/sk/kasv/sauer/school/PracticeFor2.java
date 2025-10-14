package sk.kasv.sauer.school;

import java.util.Random;
import java.util.Scanner;

public class PracticeFor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PracticeFor2 obj = new PracticeFor2();
//        obj.printChar(scanner);
//        System.out.println();
//        obj.print32to127(scanner);
        obj.dividers(180);
        System.out.println(obj.counterDividers(180));

        scanner.close();
    }

    public void printChar(Scanner scanner){
        System.out.print("Zadaj znak, ktorý chceš zadať: ");
        char character = scanner.next(".").charAt(0);
        System.out.print("Zadaj číslo reprezentujúce počet znakov: ");
        int value = scanner.nextInt();
        if (value < 0){
            value = Math.abs(value);
        }

        for(int i = 0; i < value; i++){
            if (i % 5 == 0 && i != 0){
                System.out.println();
            }
            System.out.print(character);
        }
    }

    public void print32to127(Scanner scanner){
        for(int i = 32; i <= 127; i++) {
            if (i < 100)
                System.out.print(" ");
            System.out.println(i +" - " + (char)i);

        }
    }

    public String randomChessPosition(){
        Random random = new Random();
        String position = "";
        String positionsLetters = "ABCDEFGH";
        position += positionsLetters.charAt(random.nextInt(8));
        position += random.nextInt(1,9);
        return position;
    }

    // Zobere číslo a vypíše jeho delitele
    public void dividers(int number){
        String divisors = "";
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                divisors += String.valueOf(i) + " "; // alebo sout a vypísať
            }
        }
        System.out.println("Delitele čísla " + number + " sú: " + divisors);
    }

    // Zobere číslo a vráti počet jeho deliteľov
    public int counterDividers(int number){
        int counter = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0) {
                counter++;
            }
        }
        return counter;
    }
}
