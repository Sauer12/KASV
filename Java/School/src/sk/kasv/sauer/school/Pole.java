package sk.kasv.sauer.school;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pole {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] resultArr = rotate(arr, 8);
//        for(int i : resultArr){
//            System.out.print(i);
//        }
// write your code here
        Scanner sc = new Scanner(System.in);
        int[] box1 = new int[3];
        int[] box2 = new int[3];
        for(int i = 0; i < 3; i++){
            box1[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            box2[i] = sc.nextInt();
        }

        boolean isBox1 = false;
        boolean isBox2 = false;

        for(int i = 0; i < 3; i++){
            boolean isSmaler1 = false;
            boolean isSmaler2 = false;

            for(int j = 0; j < 3; j++){
                if(box1[i] <= box2[j]){
                    isSmaler1 = true;
                }

                if(box2[i] <= box1[j]){
                    isSmaler2 = true;
                }
            }

            isBox1 = isSmaler1;
            isBox2 = isSmaler2;
        }

        System.out.println(isBox1);
        System.out.println(isBox2);
    }

    private static int[] rotate(int[] arr, int steps) {
        int[] result_arr = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            steps = steps % arr.length;
            if(i + steps < arr.length){
                result_arr[i + steps] = arr[i];
            }else{
                result_arr[i + steps - arr.length] = arr[i];
            }
        }

        return result_arr;
    }
}
