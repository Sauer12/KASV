package sk.kasv.sauer.school.arrays;

public class Fibonacci {
    public static void fibonacii() {
        int[] fb = new int[15];
        generateFibonacciArray(fb);
        printArray(fb);
        System.out.println();
        printEvenNumbers(fb);
    }

    private static void generateFibonacciArray(int[] array){
        array[0] = 1;
        array[1] = 1;
        for(int i = 2; i < array.length; i++){
            array[i] = array[i - 1] + array[i - 2];
        }
    }

    private static void printArray(int[] array){
        System.out.print("Fibonacci sequence(" + array.length + "): ");
        for(int number: array){
            System.out.print(number + " ");
        }
    }

    private static void printEvenNumbers(int[] array){
        System.out.print("Even numbers: ");
        for(int number : array){
            if(number % 2 == 0){
                System.out.print(number + " ");
            }
        }
    }
}
