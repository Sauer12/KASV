package sk.kasv.sauer.school.Integer;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Integer a = 25;
        System.out.println(a.intValue());
        int b = Integer.parseInt("1234") + 10;
        System.out.println(b);
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.min(20, 30));
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.bitCount(63));
        System.out.println(Integer.compare(11, 5));

        char[] pole = {'1', '2', '3'};
        String s = Arrays.toString(pole);
        System.out.println(s);
    }
}
