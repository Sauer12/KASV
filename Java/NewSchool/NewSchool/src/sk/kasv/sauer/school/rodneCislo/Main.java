package sk.kasv.sauer.school.rodneCislo;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.parsePersonalNumber("111111/1111"));
        System.out.println(user.parsePersonalNumber("84504031234"));
        System.out.println(user.parsePersonalNumber("8452161"));
        System.out.println(user.parsePersonalNumber("845216123412"));
        System.out.println(user.parsePersonalNumber("849161234"));
        System.out.println(user.parsePersonalNumber("0815A62027"));
        System.out.println(user.parsePersonalNumber(null));
    }
}
