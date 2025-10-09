package sk.kasv.sauer.school;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("School app");
        sayHello();

        App app = new App();
    }

    public static void sayHello(){
        System.out.println("What is your name?:" );
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", how are you?");
    }

    public void sayHi(){
        System.out.println("Hi, how are you?");
    }


}
