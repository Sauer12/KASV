package sk.kasv.sauer.school.fifty.fiftyTasks;

import java.util.Random;
import java.util.Scanner;

public class WhileCreativeTasks {

    public static final String RED_BOLD = "\033[1;31m";
    public static final String GREEN_BOLD = "\033[1;32m";
    public static final String RESET = "\033[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WhileCreativeTasks wct = new WhileCreativeTasks();
        //41. Hádaj číslo – program generuje náhodné číslo 1–50, používateľ háda, dostáva hlášky „viac“ / „menej“.
//        wct.guessNumber(scanner);

        //42. Simuluj bankomat: zadáš PIN, potom opakuješ výber, kým nezadáš „koniec“.
//        wct.bankomat(scanner);

        //43. Načítať teploty dní v týždni – vypočítať priemer.
//        System.out.printf("Average temperature is: %.2f", wct.averageTemperature(scanner));

        //44. Simuluj login – používateľ má tri pokusy zadať správne meno a heslo
//        wct.simulateLogin(scanner, "Luxy", "heslo123");

        //45. Simuluj jednoduchú kalkulačku (operácie +, -, *, /, koniec = „exit“).
//        wct.calculator(scanner);

        //46. Hviezdicky while
//        wct.stars(scanner);

        //47. Ciselny trojuholnik
//        wct.triangleOfNumbers(12);

        //48. Number 77
//        wct.generateRandomNum77();

        //49. Simuluj zber bodov – používateľ zadáva body, kým nedosiahne cieľ 100.
//        wct.catchPoints(scanner);

        //50. Program počíta, koľko hodov mincou trvá, kým padne 5× po sebe „hlava
        wct.head5times();
    }

    // 41.	Hádaj číslo – program generuje náhodné číslo 1–50, používateľ háda, dostáva hlášky „viac“ / „menej“.
    public void guessNumber(Scanner sc){
        Random random = new Random();
        int guessedNumber = random.nextInt(1, 50);
        int number = 0;
        do{
            System.out.print("\nGuess number: ");
            number = sc.nextInt();
            if (number < guessedNumber) {
                System.out.println("Your number is < X");
            } else if (number > guessedNumber) {
                System.out.println("Your number is > X");
            }else{
                System.out.println("You won, it is number: " + guessedNumber);
            }
        }while (number != guessedNumber);
    }

    // 42. Simuluj bankomat: zadáš PIN, potom opakuješ výber, kým nezadáš „koniec“.
    public void bankomat(Scanner sc){
        int yourPin = 1234;
        System.out.print("Enter a pin: ");
        int pin = Integer.parseInt(sc.nextLine());
        int attempts = 2;
        while((pin != yourPin) && (attempts > 0)) {
            System.out.println("Wrong pin! Try again. You have " + attempts + " more attempts!" );
            System.out.print("Enter a pin: ");
            pin = Integer.parseInt(sc.nextLine());
            attempts--;
        }
        if(pin == yourPin){
            System.out.println("You can continue!");
        }else{
            System.out.println("Your card has been blocked!");
        }
    }

    // 43. Načítať teploty dní v týždni – vypočítať priemer.
    public double averageTemperature(Scanner scanner){
        String[] temperatures;
        System.out.print("Zadaj teploty v týždni v tvare[10 12 14 15... n]: ");
        temperatures = scanner.nextLine().split(" ");
        double averageTemperature = 0;
        int sum = 0;
        for(int i = 0; i < temperatures.length; i++){
            sum += Integer.parseInt(temperatures[i]);
        }

        averageTemperature = (double) sum / temperatures.length;
        return averageTemperature;
    }

    //44. Simuluj login – používateľ má tri pokusy zadať správne meno a heslo
    public void simulateLogin(Scanner sc, String name, String password){
        String enteredName = "", enteredPassword = "";
        int attempts = 0;
        while((!(enteredPassword.equals(password)) || !(enteredName.equals(name))) && (attempts < 3)){
            System.out.print("Zadaj prihlasovacie meno: ");
            enteredName = sc.nextLine();
            System.out.print("Zadaj heslo: ");
            enteredPassword = sc.nextLine();
            if(!(enteredPassword.equals(password))){
                System.out.println("Zadal si zlé heslo!");
            }
            if (!(enteredName.equals(name))) {
                System.out.println("Zadal si zlé prihlasovacie meno!");
            }

            attempts++;

            if(attempts <= 2 ) {
                System.out.println("Máš ešte " + (3 - attempts) + " pokusy!");
            }

        }

        if(attempts >= 3){
            System.out.println(RED_BOLD + "\nNepodarilo sa prihlásiť, tvoj účet bol zablokovaný!" + RESET);
        }else{
            System.out.println(GREEN_BOLD + "\nÚspešne si sa prihlásil!" + RESET);
        }
    }

    //45. Simuluj jednoduchú kalkulačku (operácie +, -, *, /, koniec = „exit“).
    public void calculator(Scanner scanner){
        String choice = "";
        while(!(choice.equals("exit"))){
            System.out.print(GREEN_BOLD + "\nCalculator v0.1\n" + RESET);
            System.out.println("1: +");
            System.out.println("2: -");
            System.out.println("3: *");
            System.out.println("4: /");
            System.out.println("Exit/exit: koniec programu");
            System.out.print("Zadaj možnosť: ");
            choice = scanner.nextLine().toLowerCase();

            float num1 = 0, num2 = 0;

            if(choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")) {
                System.out.print("Zadaj prvé číslo: ");
                num1 = Float.parseFloat(scanner.nextLine());
                System.out.print("Zadaj druhé číslo: ");
                num2 = Float.parseFloat(scanner.nextLine());
                System.out.println();
            }

            if(choice.equals("1")){
                System.out.println("Result of + is: " + (num1 + num2));
            }else if(choice.equals("2")){
                System.out.println("Result of + is: " + (num1 - num2));
            }else if(choice.equals("3")){
                System.out.println("Result of + is: " + (num1 * num2));
            }else if(choice.equals("4")){
                if(num2 != 0){
                    System.out.println("Result of + is: " + (num1 / num2));
                }else{
                    System.out.println(RED_BOLD + "You cannot divide by 0!" + RESET);
                }
            } else if (choice.equals("exit")) {
                System.out.println(GREEN_BOLD + "Program calculator ended!" + RESET);
            } else{
                System.out.println(RED_BOLD + " Invalid choice!" + RESET);
            }
        }
    }

    //46. Zadaj počet hviezdičiek a vypíš ich v riadku pomocou while
    public void stars(Scanner scanner){
        System.out.print("Zadaj počet *: ");
        int stars = scanner.nextInt();
        int i = 0;
        while(i < stars){
            System.out.print(GREEN_BOLD + "* " + RESET);
            i++;
        }
    }

    //47. Vypíš číselný trojuholník (napr. 1, 12, 123, …).
    public void triangleOfNumbers(int rows){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //48. Generuj náhodné čísla 1–100, kým sa neobjaví číslo 77.
    public void generateRandomNum77(){
        Random random = new Random();
        int number = 77;
        int randomNum = 0;
        int counter = 0;
        while(randomNum != number){
            randomNum = random.nextInt(1, 100);
            counter++;
        }

        System.out.println("Trvalo " + counter + " pokusov, kým sa vygenerovalo číslo 77!");
    }

    //49. Simuluj zber bodov – používateľ zadáva body, kým nedosiahne cieľ 100.
    public void catchPoints(Scanner scanner){
        int sum = 0;
        while(sum != 100) {
            System.out.print("Zadaj body(musíš dosiahnuť 100 bodov): ");
            sum += scanner.nextInt();
            System.out.println("Máš " + sum + " bodov!");
        }
        System.out.println("Vyhral si, dosiahol si 100 bodov!");
    }

    //50. Program počíta, koľko hodov mincou trvá, kým padne 5× po sebe „hlava
    public void head5times(){
        Random random = new Random();
        int head = 0, counter = 0;
        while(head != 5){
            if(random.nextBoolean()){
                head++;
            }else{
                head = 0;
            }
            counter++;
        }

        System.out.println("Trvalo " + counter + " hodov, kým padla za sebou 5 krát hlava!");
    }
}
