package sk.kasv.sauer.school;

import java.util.Random;
import java.util.Scanner;

public class WhileStredne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WhileStredne ws = new WhileStredne();
        // 11.
//        ws.whenIsNotZero(sc);
        // 12.
//        ws.enterANumbersWhileSumIsNot100(sc);
        // 13.
//        ws.counterOfPositiveNumbers(sc);
        // 14.
//        ws.positiveNumbers(sc);
        // 15.
//        ws.maxInputNumber(sc);
        // 16.
//        ws.secretPassword(sc);
        // 17.
//        ws.guessNumber(sc);
        // 18.
//        ws.marks(sc);
        // 19.
//        ws.powLoader(sc);
        // 20.
        ws.numberTenCounter(sc);
    }

    // 11. Načítať čísla zo vstupu, kým používateľ nezadá nulu.
    public void whenIsNotZero(Scanner scanner){
        do{
            System.out.print("Enter a zero if you want to finish: ");
        }while(0 != scanner.nextInt());

        System.out.println("It is 0 -> program ended");
    }

    //12. Načítať čísla, kým ich súčet nepresiahne 100
    public void enterANumbersWhileSumIsNot100(Scanner scanner){
        int sum = 0;
        do{
            sum += scanner.nextInt();
        }while(sum < 100);
        System.out.println("Your sum is: 100!");
    }

    //13. Načítať celé čísla a zistiť, koľko bolo záporných.
    public void counterOfPositiveNumbers(Scanner scanner){
        int i = 0;
        int counter = 0;
        while((i = scanner.nextInt()) != 0){
            if(i < 0){
                counter++;
            }
        }

        System.out.println(counter);
        System.out.println();
    }

    //14. Načítať čísla, kým nezadáš záporné. Potom vypíš ich súčet.
    public void positiveNumbers(Scanner scanner){
        int sum = 0;
        int i;
        while((i = scanner.nextInt()) >= 0){
            sum += i;
        }
        System.out.println(sum);
    }

    //15. Zisti najväčšie číslo zo všetkých, ktoré používateľ zadal (koniec vstupu = 0)
    public void maxInputNumber(Scanner scanner){
        int max = 0, i = 0;
        while((i = scanner.nextInt()) != 0){
            if(max < i){
                max = i;
            }
        }

        System.out.println(max);
    }

    //16. Načítať heslo – opakuj, kým nezadá „tajneheslo“.
    public void secretPassword(Scanner sc){
        String password = "tajneheslo";
        String guessedPassword = "";
        while(!(guessedPassword = sc.nextLine()).equals(password)){
            System.out.println("Wrong password!");
        }
        System.out.println("Right password!");
    }

    //17. Opakuj hádanie čísla, kým používateľ neuhádne vygenerované číslo (1–100).
    public void guessNumber(Scanner sc){
        int number = new Random().nextInt(1, 101);
        int guessedNumber = 0;
        while((guessedNumber = sc.nextInt()) != number){
            System.out.println("Guess number (1 - 101): ");
        }
        System.out.println("You won!");
    }

    //18. Načítať počet bodov a vypisovať známky, kým nezadáš „koniec
    public void marks(Scanner sc){
        String points = "0";
        System.out.print("Zadaj počet bodov: ");
        while(!(points = sc.nextLine()).equals("koniec")){
            marksConvertor(points);
            System.out.print("Zadaj počet bodov: ");
        }
        System.out.println("Program ended");
    }

    private void marksConvertor(String points){
        int p = Integer.parseInt(points);
        if(p > 80){
            System.out.println("1");
        }else if(p > 60){
            System.out.println("2");
        }else if(p > 40){
            System.out.println("3");
        }else if(p > 20){
            System.out.println("4");
        }else{
            System.out.println("5");
        }
    }

    //19. Načítať čísla, kým ich súčin neprekročí 1000.
    public void powLoader(Scanner sc){
        int sum = 1;
        while(sum <= 1000){
            System.out.print("Enter a number: ");
            sum = sum * sc.nextInt();
        }
        System.out.println("Sum is bigger than 1000!");
    }

    //20. Počítaj, koľkokrát používateľ zadal číslo väčšie ako 10 (koniec = 0).
    public void numberTenCounter(Scanner sc){
        int counter = 0, num = 0;
        while((num = sc.nextInt()) != 0){
            if(num > 10){
                counter++;
            }
            System.out.print("Enter a number: ");
        }
        System.out.println("Počet čísel väčších ako 10: " + counter);
    }
}