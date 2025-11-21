package sk.kasv.sauer.school.arrays;

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        numbers[0]= 2;
        numbers[1] = 9;
        numbers[2] = 14;
        numbers[3] = 22;
        numbers[4] = 33;
        numbers[5] = 40;
        numbers[6] = 50;
        int[] numbers2 = {7, 14, 16, 24, 34};
//        System.out.println("First array: " + Arrays.toString(numbers2));

        //prve pole - vypis
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + "  ");
        }

        System.out.println();

        //druhe pole - vypis (odzadu)
        for(int i = numbers2.length - 1; i >= 0; i--){
            System.out.print(numbers2[i] + "  ");
        }
        System.out.println();
        new App().generateAndPrint4Numbers();
        System.out.println();

        Fibonacci.fibonacii();
    }

    public void generateAndPrint4Numbers(){
        int[] arr = new int[6];
        Random rnd = new Random();
        int i;
        for(i=0; i<arr.length; i++){
            arr[i] = rnd.nextInt(1, 11);
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(i=arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
