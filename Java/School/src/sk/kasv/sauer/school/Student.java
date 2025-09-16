package sk.kasv.sauer.school;

public class Student {
    String firstName;
    String lastName;
    int age;

    public void info(){
        System.out.println("I am student." + " My name is " + firstName + " " + lastName + ", I am " + age + " years old.");
    }
}
