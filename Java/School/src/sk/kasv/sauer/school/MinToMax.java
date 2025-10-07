package sk.kasv.sauer.school;

import java.util.Arrays;
import java.util.Scanner;

public class MinToMax {
    public static void sort(int[] numbers) {
        // write your code here
        int min = 0;
        for(int i = 0; i < numbers.length; i++){
            min = numbers[i];
            int index = i;
            for(int j = i; j < numbers.length; j++){
                if(numbers[j] < min){
                    min = numbers[j];
                    index = j;
                }
            }
            numbers[index] = numbers[i];
            numbers[i] = min;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}
