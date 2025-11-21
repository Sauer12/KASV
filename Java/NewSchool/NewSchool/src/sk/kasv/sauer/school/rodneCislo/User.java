package sk.kasv.sauer.school.rodneCislo;

import java.time.LocalDate;

public class User {
    public LocalDate parsePersonalNumber(String rc){
        // kontroly
        if(rc == null || rc.isEmpty()) return null;

        // ak rodne cislo obsahuje /, dame ho prec
        if(rc.charAt(6) == '/'){
            rc = rc.substring(0, 6) + rc.substring(7);
        }

        // rc musi mat dlzku 10 cifier (starsie maju len 9 znakov)
        if(rc.length() != 10 && rc.length() != 9){
            return null;
        }

        // overime ci rc obsahuje iba cifry
        for(int i = 0; i < rc.length(); i++){
            if(!Character.isDigit(rc.charAt(i))){
                return null;
            }
        }

        // overenie ci rodne cislo je delitelne 11
        if(rc.length() == 10){
            long rcValue = Long.parseLong(rc);
            if(rcValue % 11 != 0){
                return null;
            }
        }

        int day, month, year;

        day = Integer.parseInt(rc.substring(4,6));
        month = Integer.parseInt(rc.substring(2, 4));
        year = Integer.parseInt(rc.substring(0, 2));
        if(year<30){
            year += 2000;
        } else{
            year += 1900;
        }
        String gender = month > 0 && month <= 12 ? "male" : (month>=51 && month<=62 ? "female" : null);
        month = month>50 ? month - 50 : month;

        if(month <1 || month>12)
            return null;
        if(day<1 || day>310)
            return null;

        return LocalDate.of(year, month, day);
    }
}
