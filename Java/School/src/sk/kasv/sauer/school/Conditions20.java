package sk.kasv.sauer.school;

import java.util.Scanner;

public class Conditions20 {
    public static void main(String[] args) {
        Conditions20 obj = new Conditions20();

        Scanner sc = new Scanner(System.in);

        //1.
        System.out.println(obj.isBiggerThen10(sc.nextInt()));
        //2.
        System.out.println(obj.isNegative(15));
        //3.
        System.out.println(obj.isEven(12));
        //4.
        System.out.println(obj.isAdult(20));
        //5.
        System.out.println(obj.isVowel('a'));
        //6.
        obj.isPositiveOrNegative(-5);
        //7.
        obj.isEvenOrOd(7);
        //8.
        System.out.println(obj.isDiscount(25));
        //9.
        obj.workDayOrWeekend(3);
        //10.
        obj.mark(3);
        //11.
        System.out.println(obj.equalNumbers(5, 5));
        //12.
        System.out.println(obj.isDivideByFive(15));
        //13.
        obj.temperature(-2);
        //14.
        obj.password("tajne");
        //15.
        System.out.println(obj.isLapYear(2024));
        //16.
        System.out.println(obj.isInInerval(15));
        //17.
        obj.whatIsYourAge(22);
        //18.
        obj.max(5, 8, 3);
        //19.
        obj.month(6);
        //20.
        System.out.println(obj.isValidTriangle(3, 4, 5));
    }

    // 1.cislo vacsie ako 10
    public boolean isBiggerThen10(int number){
        return number > 10;
    }

    // 2. zaporne cislo
    public boolean isNegative(int number){
        return number < 0;
    }

    // 3. je cele cislo parne
    public boolean isEven(int number){
        return number % 2 == 0;
    }

    // 4. Je plnolety
    public boolean isAdult(int age){
        return age >= 18;
    }

    // 5. je samohlaska
    public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // 6. Je kladne alebo zaporne
    public void isPositiveOrNegative(int number){
        if (number < 0) {
            System.out.println("Is negative");
        } else if (number == 0) {
            System.out.println("Is zero");
        } else{
            System.out.println("Is positive");
        }
    }

    // 7. Je parne alebo neparne
    public void isEvenOrOd(int number){
        if (number % 2 == 0) {
            System.out.println("Is even");
        }  else {
            System.out.println("Is odd");
        }
    }

    // 8. Ma clovek narok na zlavu?
    public boolean isDiscount(int age){
        return age < 26;
    }

    // 9. Pracovny den alebo vikend
    public void workDayOrWeekend(int day){
        if (day >= 1 && day <= 5){
            System.out.println("Is weekday");
        } else{
            System.out.println("Is weekend");
        }
    }

    // 10. Známka
    public void mark(int mark){
        if (mark >= 1 && mark < 5){
            System.out.println("Postúpil si!");
        }else{
            System.out.println("Neúspech!");
        }
    }

    // 11. Rovnaké čísla
    public boolean equalNumbers(int number1, int number2){
        return number1 == number2;
    }

    // 12. Cislo päť
    public boolean isDivideByFive(int number){
        return number % 5 == 0;
    }
    
    // 13. Teplota
    public void temperature(int stupne){
        if (stupne < 0){
            System.out.println("Mrzne!");
        } else if (stupne > 0) {
            System.out.println("Nemrzne");
        }else {
            System.out.println("Je 0 stupnov!");
        }
    }
    
    // 14. Heslo
    public void password(String password){
        if (password.equals("tajne")) {
            System.out.println("Vstup povolený!");
        }else{
            System.out.println("Vstup zakázaný!");
        }
    }
    
    // 15. Priestupny rok
    public boolean isLapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) && year % 400 == 0;
    }
    
    // 16. Interval 10-20
    public boolean isInInerval(int number){
        return number >= 10 && number <= 20;
    }
    
    // 17. Vek
    public void whatIsYourAge(int age){
        if(age < 6){
            System.out.println("Predškolák");
        } else if (age <= 18){
            System.out.println("Žiak");
        }else if (age <= 26){
            System.out.println("Študent");
        }else{
            System.out.println("Dospelý");
        }
    }
    
    // 18. Max cislo
    public void max(int a, int b, int c){
        if (a >= b && a >= c){
            System.out.println(a);
        }else System.out.println(Math.max(b, c));
    }
    
    // 19. Mesiac
    public void month(int number){
        if(number == 1){
            System.out.println("January");
        }else if(number == 2){
            System.out.println("February");
        }else if(number == 3){
            System.out.println("March");
        }else if(number == 4){
            System.out.println("April");
        }else if(number == 5){
            System.out.println("May");
        }else if(number == 6){
            System.out.println("June");
        }else if(number == 7){
            System.out.println("July");
        }else if(number == 8){
            System.out.println("August");
        }else if(number == 9){
            System.out.println("September");
        }else if(number == 10){
            System.out.println("October");
        }else if(number == 11){
            System.out.println("November");
        }else if(number == 12){
            System.out.println("December");
        }else{
            System.out.println("Invalid number of month!");
        }
    }
    
    // 20. Strany trojuholnika
    public boolean isValidTriangle(int a, int b, int c){
        return a + b > c && a + c > b && b + c > a;
    }
}

