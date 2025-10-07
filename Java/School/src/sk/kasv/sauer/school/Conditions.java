package sk.kasv.sauer.school;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
//        System.out.print("Zadaj číslo mesiaca: ");
        Conditions obj = new Conditions();
//        String result = obj.rocneObdobie(new Scanner(System.in).nextInt());
//        System.out.println(result);

//        System.out.println(obj.isLapYear(2200));
//        System.out.println(obj.checkDate(29, 2, 2000));
        System.out.println(obj.checkDate2(29, 2, 2000));
        System.out.println(obj.checkDate2(30, 2, 2000));
        System.out.println(obj.checkDate2(29, 2, 2001));
        System.out.println(obj.checkDate2(31, 1, 2000));
        System.out.println(obj.checkDate2(32, 1, 2000));
        System.out.println(obj.checkDate2(0, 1, 2000));
        System.out.println(obj.checkDate2(1, 1, 2000));
        System.out.println(obj.checkDate2(31, 11, 2000));
    }

    public String rocneObdobie(int month){
        if(month == 12 || month == 1 || month == 2){
            return "Winter";
        } else if (month >= 3 && month <= 5) {
            return "Spring";
        } else if (month >= 6 && month <= 8) {
            return "Summer";
        } else if (month >= 9 && month <= 11) {
            return "Autumn";
        } else{
            return null;
        }
    }

    // Existuje dany den? (funkcne, ale neefektivne a nedobre riesenie, prerobit
    public boolean isLapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        }
        return false;
    }

    // Vrati true alebo false pre existenciu daneho dna v danom mesiaci a v danom roku
    public boolean checkDate(int day, int month, int year){
        if((day >= 1 && day <= 31) && (month >= 1 && month <= 12)){
            if((month == 2 && isLapYear(year)) && day <= 29){
                return true;
            }else if(month == 2 && day <= 28) {
                return true;
            }else{
                if((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30){
                    return true;
                }else
                    return (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12);
            }
        }else{
            return false;
        }
    }

    // Vrati true alebo false pre existenciu daneho dna v danom mesiaci a v danom roku cez polia
    public boolean checkDate2(int day, int month, int year) {
        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLapYear(year)) {
            months[1] = 29;
        }

        if (months[month - 1] >= day && day > 0) {
            return true;
        }

        return false;
    }
}
