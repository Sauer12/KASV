package sk.kasv.sauer.school.arrays;

public class Sifry {
    public static void main(String[] args) {
        System.out.println(encode("AZAZ", 3));
        System.out.println(decode("AZAZ", 3));
    }

//    public static String encrypt(String text, int changer){
//        char[] encryptedText = new char[text.length()];
//        for(int i = 0; i < text.length(); i++){
//            char ch = text.charAt(i);
//            int asciiValue = (int)ch + changer;
//            if(asciiValue >)
//                ch = (char)((int)ch + changer);
//            encryptedText[i] = ch;
//        }
//
//        return String.valueOf(encryptedText);
//    }

    public static String encode(String text, int offset){
        int i;
        char c;
        char[] result = new char[text.length()];

        if(text == null)
            return null;

        if(offset< 1 || offset > 9)
            offset = 3;

        for(i = 0; i < text.length(); i++){
            c = text.charAt(i);
            if(Character.isUpperCase(c)){
                 c = (char) ((int)c+offset);
                 if(c > 'Z')
                     c = (char)(c - 26);
            }else if(Character.isLowerCase(c)){
                c = (char)((int)c + offset);
                if(c > 'z')
                    c = (char)(c - 26);
            }else if(Character.isDigit(c)){
                c = (char) (c + offset);
                if(c > '9'){
                    c =(char)(c - 10);
                }
            }

            result[i] = c;
        }

        return String.valueOf(result);
    }

    //decode
    public static String decode(String password, int offset){
        int i;
        char c;
        char[] result = new char[password.length()];

        if(password == null)
            return null;

        if(offset< 1 || offset > 9)
            offset = 3;

        for(i = 0; i < password.length(); i++){
            c = password.charAt(i);
            if(Character.isUpperCase(c)){
                c = (char) ((int)c - offset);
                if(c < 'A')
                    c = (char)(c + 26);
            }else if(Character.isLowerCase(c)){
                c = (char)((int)c - offset);
                if(c < 'a')
                    c = (char)(c + 26);
            }else if(Character.isDigit(c)){
                c = (char) (c - offset);
                if(c < '0'){
                    c = (char)(c + 26);
                }
            }

            result[i] = c;
        }

        return String.valueOf(result);
    }
}
