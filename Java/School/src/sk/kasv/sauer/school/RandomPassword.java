package sk.kasv.sauer.school;

import java.util.Random;
import java.util.Scanner;

public class RandomPassword{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        RandomPassword obj = new RandomPassword();
//        int length = sc.nextInt();
//        String password = obj.generatePassword(length);
//        System.out.println(password);
        System.out.println(obj.randomChessPosition());
    }

    public String generatePassword(int length){
        String password = "";
        Random random = new Random();
        for(int i = 0; i < length; i++){
            password += (char)random.nextInt(33, 127);
        }

        return password;
    }

    public String randomChessPosition(){
        Random random = new Random();
        String position = "";
        String positionsLetters = "ABCDEFGH";
        position += positionsLetters.charAt(random.nextInt(8));
        position += random.nextInt(1,9);
        return position;
    }
}
