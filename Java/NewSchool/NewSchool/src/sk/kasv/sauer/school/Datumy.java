package sk.kasv.sauer.school;

import java.time.LocalDate;
import java.util.Date;

public class Datumy {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2078, 12, 24);
        System.out.println(ld + " => " + ld.getDayOfWeek());
        LocalDate localDate;
    }
}
