package sk.kasv.sauer.school.arrays;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayNumbers {
    public static void main(String[] args) {
        // vypisat odpredu, vypisat odzadu
//        int[] array = new int[10];
//        Random random = new Random();
//
//        generateNumbers(array, random);
//        generateUniqueNumbers(array, random);
//        printArrayInOrder(array);
//        printArrayInReverse(array);
//        int min = minimum(array);
//        int max = maximum(array);
//
//        System.out.println();
//        System.out.println("Najväčšie číslo: " + min);
//        System.out.println("Najmenšie číslo: " + max);
//        System.out.println("Aritmetický priemer: " + average(array));
//        System.out.println();
//
//        System.out.println("Second example");
//        int[] array2 = new int[5];
//        generateUniqueNumbersFrom65to90(array2, random);
//        printArrayInOrder(array2);
//
//        System.out.println("\nTEXT AND PASSWORDS");
//        generateText(100);
//        generateUniqueNumbersFrom65to90(array2, random);
//        printArrayInOrder(array2);
//        char[] password = generateText(15);
//        printArrayInOrder(password);
//        int count = getCountOfVowels(password);
//        System.out.println(count);
//
//        char[] password2 = generateText(10);
//        printArrayInOrder(password2);
//        replaceCharacters(password2, 'M', '*');
//        printArrayInOrder(password2);
//        System.out.println();
//        System.out.println();

        //Znak v poli charov, pocet znakov v poli charov
        char[] password3 = generateText(15);
        printArrayInOrder(password3);
        System.out.println(isPresent(password3, 'A'));
        System.out.println(countChar(password3, 'A'));

        //Random possword
        System.out.println();
        System.out.println("Random password: " + randomPassword(50));

        //Validacia hesla
        System.out.println(isValidPassword("HESLO123"));
        System.out.println(isValidPassword("12345678"));
        System.out.println(isValidPassword("hesloooo"));
        System.out.println(isValidPassword("Heslo123"));

    }

    // Sifra, male pismena, velke pismena, cislice



    public static boolean isValidPassword(String password){
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        int up = 0, low = 0, num = 0, len = 0;

        for(int i = 0; i < password.length(); i++){
            if(upperCase.contains(String.valueOf(password.charAt(i)))){
                up++;
            }else if(lowerCase.contains((String.valueOf(password.charAt(i))))){
                low++;
            }else if(numbers.contains((String.valueOf(password.charAt(i))))){
                num++;
            }

            len++;
        }

        return up != 0 && low != 0 && num != 0 && len > 7;
    }

    private static String randomPassword(int length){
        String set = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char[] password = new char[length];
        Random rnd = new Random();
        int i;
        for(i = 0; i < length; i++){
            int index = rnd.nextInt(0, set.length());
            password[i] = set.charAt(index);
        }
        return String.valueOf(password);
    }

    private static boolean isPresent(char[] array, char z){
        for(char ch : array){
            if(ch == z){
                return true;
            }
        }
        return false;
    }

    private static int countChar(char[] array, char z){
        int counter = 0;
        for(char ch : array){
            if(ch == z){
                counter++;
            }
        }
        return counter;
    }

    private static void replaceCharacters(char[] password, char replacedChar, char changer){
        for(int i = 0; i < password.length; i++){
            if(Character.toUpperCase(password[i]) == replacedChar){
                password[i] = changer;
            }
        }
    }

    private static int getCountOfVowels(char[] password){
        String vowels = "aeiouyäáéíóúý";
        int counter = 0;
        for(char c : password){
            if(vowels.contains(String.valueOf(c).toLowerCase())){
                counter++;
            }
        }

        return counter;
    }

    private static void generateNumbers(int[] arr, Random random){
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(1, 11);
        }
    }

    // dorobit
    private static void generateUniqueNumbers(int[] arr, Random random){
        int i = 0, j = 0;
        while(i < arr.length){
            j = i;
            int temp = random.nextInt(1, 11);
            boolean isUnique = true;
            while(j >= 0){
                if(temp == arr[j]) {
                    isUnique = false;
                    break;
                }
                j--;
            }
            if(isUnique){
                arr[i] = temp;
                i++;
            }
        }
    }

    private static char[] generateText(int n){
        char[] array = new char[n];
        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = (char)random.nextInt(65,91);
        }

//        for(int i : array){
//            System.out.print(i + " ");
//        }
//
//        System.out.println();

        return array;
    }

    private static void generateNumbersFrom65to90(int[] array, Random random){
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(65,91);
        }
    }

    private static void generateUniqueNumbersFrom65to90(int[] array, Random random){
        int i = 0;
        while(i < array.length){
            int j = i;
            int temp = random.nextInt(65,91);
            boolean isUnique = true;
            while(j >= 0){
                if(temp == array[j]){
                    isUnique = false;
                    break;
                }
                j--;
            }
            if(isUnique) {
                array[i] = temp;
                i++;
            }
        }
    }

    private static void printArrayInReverse(int[] array) {
        for(int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void printArrayInOrder(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void printArrayInOrder(char[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int minimum(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }

    private static int maximum(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }

    private static double average(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }

        return (double)sum/arr.length;
    }
}
