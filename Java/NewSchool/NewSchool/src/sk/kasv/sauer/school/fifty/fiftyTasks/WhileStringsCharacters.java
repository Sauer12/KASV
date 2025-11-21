package sk.kasv.sauer.school.fifty.fiftyTasks;

import java.util.Scanner;

public class WhileStringsCharacters {
    public static void main(String[] args) {
        WhileStringsCharacters wsch = new WhileStringsCharacters();
        Scanner sc = new Scanner(System.in);
        // 31.
//        wsch.loadName(sc);
        // 32.
//        wsch.counterOfCharactersInString("Hello");
        // 33.
//        wsch.counterOfVowels("Hello my name is Lukas");
        // 34.
//        wsch.counterOfSpacesInText("Hello there are 4 spaces!");
        // 35.
//        wsch.StringCharByChar("Hello World!");
        // 36.
//        wsch.StringRightToLeft("Hello World!");
        // 37.
//        wsch.isDigitHere("ABCD51EFG");
        // 38.
//        wsch.pin("1234", sc);
        // 39.
//        wsch.isTextPalindrome("anna");
        // 40.
        wsch.counterOfa("anna");


    }
    // 31. Opakuj načítanie mena, kým používateľ nezadá prázdny reťazec.
    public void loadName(Scanner sc){
        String name = "";
        System.out.print("Enter a name: ");
        while(!(name = sc.nextLine()).equals("")){
            System.out.print("Enter a name: ");
        }
        System.out.println("Program ended");
    }

    // 32. Spočítaj počet znakov v reťazci bez použitia .length().
    public void counterOfCharactersInString(String s){
        int counter = 0;
        for(char a : s.toCharArray()){
            counter++;
        }
        System.out.println("Length of " + s + " is: " + counter);
    }

    // 33. Spočítaj počet samohlások v reťazci.
    public void counterOfVowels(String s) {
        String vowels = "aeiou";
        int counter = 0;
        s = s.toLowerCase();
        for (char ch : s.toCharArray()) {
            if (vowels.contains(String.valueOf(ch))) {
                counter++;
            }
        }
        System.out.println("Number of vowels in string \"" + s + "\" is: " + counter);
    }

    // 34. Spočítaj počet medzier v texte.
    public void counterOfSpacesInText(String s){
        int counter = 0;
        for(char c : s.toCharArray()){
            if(c == ' '){
                counter++;
            }
        }
        System.out.println("Number of spaces in text \"" + s + "\" is: " + counter);
    }

    // 35. Vypíš reťazec po znakoch zľava doprava.
    public void StringCharByChar(String s){
        for(int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i));
        }
    }

    // 36. Vypíš reťazec po znakoch sprava doľava.
    public void StringRightToLeft(String s){
        for(int i = s.length() - 1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
    }

    // 37. Over, či text obsahuje číslicu.
    public void isDigitHere(String s){
        String digits = "0123456789";
        boolean isDigit = false;
        for(char c : s.toCharArray()){
            if(digits.contains(String.valueOf(c))){
                isDigit = true;
                break;
            }
        }
        if(isDigit){
            System.out.println("String " + s + " contains digit!");
        }else{
            System.out.println("String " + s + " does not contains digit!");
        }
    }

    // 38. Opakuj zadávanie PIN kódu, kým nebude správny.
    public void pin(String pin, Scanner sc){
        System.out.print("Enter a pin: ");
        while(!(sc.nextLine()).equals(pin)){
            System.out.println("Incorrect pin!!!");
            System.out.print("Enter a pin: ");
        }
        System.out.println("Correct!");
    }

    // 39. Skontroluj, či je text palindróm (napr. „oko“).
    public void isTextPalindrome(String s){
        s = s.toLowerCase();
        for(int i = 0, j = s.length() - 1; i < s.length()/2; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                System.out.println("Text is not palindrome!");
                return;
            }
        }
        System.out.println("Text is a palindrome!");
    }

    // 40. Počítaj, koľko krát sa v texte vyskytuje písmeno „a“.
    public void counterOfa(String s){
        int counter = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'a'){
                counter++;
            }
        }
        System.out.println("There is " + counter + " 'a' characters!");
    }
}
