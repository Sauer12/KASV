package sk.kasv.sauer.school.fifty.fiftyTasks;

import java.util.Scanner;

public class WhileMathematics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WhileMathematics wm = new WhileMathematics();
        //21. Faktorial s rekurziou
        System.out.println(wm.factorial(5));

        //21. Faktorial bez rekurzie
        wm.factorial2(5);

        //22. Pocet cislic v zadanom cisle
        System.out.println(wm.counterOfDigits(151502));

        //23. Vypočítaj súčet číslic zadaného čísla.
        System.out.println(wm.sumOfDigits(1235));

        //24. Over, ci je cislo palindrom
        System.out.println(wm.isPalindrome(1221)); //true
        System.out.println(wm.isPalindrome(12321)); //true
        System.out.println(wm.isPalindrome(15391)); //false

        //25. Zisti, či je číslo prvočíslo.
        System.out.println(wm.isPrimeNumber(19)); //true

        //26. Nájdite najväčší spoločný deliteľ (GCD) dvoch čísel pomocou while.
        System.out.println(wm.GCD(15, 24));

        //27. Preveď desiatkové číslo na binárne (bez vstavaných metód).
        System.out.println(wm.decimalToBinary(13));
        System.out.println(wm.decimalToBinary(174));

        //28. Vypíš Fibonacciho postupnosť do zadaného n.
        wm.fibonacci(21);
        System.out.println();

        //29. Spočítaj počet deliteľov čísla.
        System.out.println(wm.numOfDivisors(15));
        System.out.println(wm.numOfDivisors(25));

        //30. Nájdite najmenší spoločný násobok (LCM) dvoch čísel.
        System.out.println(wm.minLCM(12, 15));
        System.out.println(wm.minLCM(24, 45));
    }

    //21. Faktorial cez rekurziu
    public int factorial(int num){
        if(num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }

    //21. Faktorial bez rekurzie
    public void factorial2(int num){
        int factorial = 1;
        for(int i = num; i > 0; i--){
            factorial *= i;
        }
        System.out.println(factorial);
    }

    //22. Pocet cislic v zadanom cisle
    public int counterOfDigits(int num){
        int digits = 0;
        if(num == 0){
            return 1;
        }

        while(num != 0){
            num = num/10;
            digits++;
        }

        return digits;
    }

    //23. Vypočítaj súčet číslic zadaného čísla
    public int sumOfDigits(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }

    //24. Over, či je číslo palindróm (napr. 1221).
    public boolean isPalindrome(int n){
        String strN = String.valueOf(n);

        for(int i = 0, j = strN.length() - 1; i < (strN.length()/2); i++, j--){
            if(strN.charAt(i) != strN.charAt(j)){
                return false;
            }
        }

        return true;
    }

    //25. Zisti, či je číslo prvočíslo.
    public boolean isPrimeNumber(int num){
        int counter = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                counter++;
            }
        }
        if(counter == 2){
            return true;
        }

        return false;
    }

    //26. Nájdite najväčší spoločný deliteľ (GCD) dvoch čísel pomocou while. (da sa robit aj cez Euklidov algoritmus)
    public int GCD(int a, int b){
        int i = 1;
        int min = a;
        int gcd = 0;

        if(b < a){
            min = b;
        }

        while(i <= min){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
            i++;
        }

        return gcd;
    }

    //27. Preveď desiatkové číslo na binárne (bez vstavaných metód).
    public int decimalToBinary(int number){
        String binary = "";
        while(number != 0){
            int k = number % 2;
            number = number / 2;
            binary += String.valueOf(k);
        }
        return Integer.parseInt(binary);
    }

    //28. Vypíš Fibonacciho postupnosť do zadaného n.
    public void fibonacci(int n){
        if(n < 1){
            System.out.print(0);
            return;
        }
        System.out.print(1 + " ");
        int i = 1, j = 1, k = 1;
        while(i <= n){
            System.out.print(i + " ");
            i += j;
            j = k;
            k = i;
        }
    }

    //29. Spočítaj počet deliteľov čísla.
    public int numOfDivisors(int num){
        if(num < 0)
            return 0;

        int counter = 0;
        int i = 1;
        while(i <= num){
            if(num % i == 0){
                counter++;
            }
            i++;
        }

        return counter;
    }

    //30. Nájdite najmenší spoločný násobok (LCM) dvoch čísel.
    public int minLCM(int a, int b){
        int max = b;
        if(max < a){
            max = a;
        }

        int i = max;
        while(i % a != 0 || i % b != 0){
            i++;
        }

        return i;
    }
}
