package sk.kasv.sauer.school;

import java.util.Random;
import java.util.Scanner;

public class WhileCycles {
    public static void main(String[] args) {
        WhileCycles wc = new WhileCycles();
        Scanner sc = new Scanner(System.in);

        // 1.Cisla od 0 do 50 okrem delitelnych 7
        wc.notSeven();
        System.out.println();

        // 2. Sum of interval
        wc.sumOfInterval(2, 8);
        System.out.println();

        // 3. Hadaj cislo
//        wc.guessNumber(sc);
//        System.out.println();

        // 4. Factorial
        System.out.println("Factorial: " + factorial(5));
        System.out.println();

        // 5. Obratene cislo
        int number = 156;
        System.out.println("Reversed number of " + number + " is " + wc.reverseNumber(number));
        System.out.println();

        // 6. Vyplneny stvorec
        wc.rectangle(4, 10, '#');
        System.out.println();

        // 7. Prazdny stvorec
        wc.emptyRectangle(4, 10, '*');
        System.out.println();

        // 8. Trojuholnik  (od zaciatku riadku)
        wc.triangle(5, '#');
        System.out.println();

        // 9. Obrateny trojuholnik (od zaciatk riadku, ale opacne ako uloha 8.)
        wc.triangle2(5, '#');
        System.out.println();

        // 10. Triangle - pyramida
        wc.triangle3(5, '*');
        System.out.println();

        // 11. Triangle pyramida - obrateny
        System.out.println();
        wc.triangle4(5, '*');
        System.out.println();

        // 12. Triangle pyramida - spojeny/obojstranny
        wc.connectedTriangle(11, '*');
        System.out.println();

        // 13. Triangle pyramida spojeny/obojstranny - druhy sposob
        wc.connectedTriangle2(11, '@');
    }



    // 1. Vypise cisla od 0 do 50, okrem tych, ktore su delitelne sedmickou
    public void notSeven(){
        for(int i = 0; i <= 50; i++){
            if(i % 7 != 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // 2. Sucet cisel od A po B (ak je A > B, tak sa A prehodi z B)
    public void sumOfInterval(int a, int b){
        if (a > b){
            int c = b;
            b = a;
            a = c;
        }

        int sum = 0;
        for(int i = a; i <= b; i++){
            sum += i;
        }

        System.out.println("Sum of numbers[" + a + " - " + b + "] is: " + sum);
    }

    // 3. Hadaj cislo
    public void guessNumber(Scanner sc){
        int generatedNumber = new Random().nextInt(1,101);
        int guessNumber = 0;
        System.out.print("Guess number: ");
        while((guessNumber = sc.nextInt()) != generatedNumber){
            if(generatedNumber > guessNumber){
                System.out.println("Guess greater number!");
            }else{
                System.out.println("Guess lower number!");
            }
        }
        System.out.println("Exactly, it is number: " + generatedNumber + "!");
    }

    // 4. Factorial
    public static int factorial(int number){
        int fact = 1;

        for(int i = 1; i <= number; i++){
            fact = fact * i;
        }

        return fact;
    }

    // 5. obrati cislo napr. 156 -> 651
    public int reverseNumber(int number){
        String reversedNumber = "";
        while(number != 0){
            reversedNumber += String.valueOf(number % 10);
            number = number / 10;
        }

        return Integer.parseInt(reversedNumber);
    }

    // 6. Vypise vyplneny stvorec
    public void rectangle(int rows, int cols, char symbol){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    // 7. Vypise prazdny stvorec
    public void emptyRectangle(int rows, int cols, char symbol){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if (i == 1 || i == rows){
                    System.out.print("*");
                }else if(j == 1 || j == cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 8. Vypise trojuholnik
    public void triangle(int rows, char symbol){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

//     9. Vypise obrateny trojuholnik
    public void triangle2(int rows, char symbol){
        for(int i = rows; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    // 10. Zobere pocet riadkov, znak symbolu a vypise pyramidu zo symbolov na tolko riadkov, kolko mu zadame vo vstupe
//    public void triangle3(int rows, char symbol){
//        for(int i  = rows, j = 1, l = 1; i >= 1; i--, j++, l+=2){ //i = pocet riadkov
//            for(int k = rows - j; k >= 1; k--){ // Vypise konkretny pocet medzier pred symbolom
//                System.out.print(" ");
//            }
//
//            for(int index = 1; index <= l; index++){ // Vypise konkretny pocet symbolov medzi symbolmi
//                System.out.print(symbol);
//            }
//
//            for(int k = rows - j; k >= 1; k--){ // Vypise konkretny pocet medzier za symbolom, nemusi tu byt
//                System.out.print(" ");
//            }
//
//            System.out.println();
//        }
//    }

    // 10. Optimalnejsie riesenie
    public void triangle3(int rows, char symbol){
        for(int i = 1; i <= rows; i++){
            for(int j = i; j < rows; j++){
                System.out.print(" ");
            }
            for(int j = 1; j < i * 2; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    // 11. Obrateny trojuholnik
    public void triangle4(int rows, char symbol){
        for(int i = rows; i >= 1; i--){
            for(int k = rows - i; k >= 1; k--){
                System.out.print(" ");
            }

            for(int k = 2 * i - 1; k >= 1; k--){
                System.out.print(symbol);
            }

            System.out.println();
        }
    }

    // 12. Spojeny trojuholnik
    public void connectedTriangle(int rows, char symbol){
        triangle3(rows / 2, symbol);
        triangle4(rows / 2, symbol);
    }

    // 13. Spojeny trojuholnik upgrade
    public void connectedTriangle2(int rows, char symbol){
        int row = 5;
        System.out.println(row);
    }
}
