package sk.kasv.sauer.school.str;

public class StringsExamples {
    public static void main(String[] args) {
        String a = "Autobus";
        String b = "Spisska Nova Ves";
        String c = "Hokej";
        String d = "";
        String e = null;
        String name = "     Matej         ";
        String currentDate = "2025-11-03";

        System.out.println("Word " + a + " contains " + a.length() + " characters.");
        System.out.println("Word " + d + " contains " + d.length() + " characters.");
        if(e != null)
            System.out.println("Word " + e + " contains " + e.length() + " characters.");
        int index = 12;
        if(index >= 0 && index < b.length()) {
            System.out.println("Character at position " + index + " is: " + b.charAt(index));
        }

        System.out.println(a.startsWith("ho"));
        System.out.println(c.toLowerCase().startsWith("ho"));
        System.out.println(c.endsWith("ej"));

        System.out.println(b.toLowerCase().contains("nova"));
        b.replace('a', '?');
        System.out.println(b.replace('a', '?'));
        System.out.println(b);

        System.out.println("My name is " + name.trim() + " and I am KASV student!");

        // Spisska Nova Vec -> Nova Ves
        System.out.println(b.substring(8));
        String subStringFromB = b.substring(8, 12);
        System.out.println(subStringFromB);

        // 2025-11-03
        System.out.println("Today is " + currentDate.substring(8) + "." +
                currentDate.substring(5, 7)+"."+currentDate.substring(0, 4));

        String s = "Hokej";
        if(c == s){ //tento if vzdy vrati false, lebo porovnava referencie
            System.out.println("Nevykoná sa");
        }

        // equals je case sensitive a porovnava textovu hodnotu (hokej != Hokej)
        if(c.equals(s)){
            System.out.println("Sú rovnaké");
        }

        // hokej == Hokej || Hokej == hokej
        if(c.equalsIgnoreCase(s)){
            System.out.println("Strings are equal");
        }

        System.out.println(c.concat(" " +b)); //c + b

        for(int i = b.length() -1; i >= 0; i--){
            System.out.print(b.charAt(i));
        }
    }
}
