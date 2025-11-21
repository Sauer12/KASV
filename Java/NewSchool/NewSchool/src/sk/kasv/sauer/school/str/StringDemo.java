package sk.kasv.sauer.school.str;

public class StringDemo {
    public static void main(String[] args) {
        String name = "Lukáš Sauer";
        System.out.println(name.length() + " " + name.charAt(0));
        System.out.println("Java je super".toUpperCase());
        System.out.println("Programovanie".contains("gram"));
        String[] words = "Ahoj svet z javy".split(" ");
        for(String s : words){
            System.out.println(s);
        }
        System.out.println("banana".replaceAll("a", "*"));
        System.out.println("     Košice    ".trim());
        System.out.println("JAVA".equals("java"));
        System.out.println("java".equalsIgnoreCase("JAVA"));
        System.out.println(String.valueOf(123));
        System.out.println(String.join("=", "java", "is", "gut"));
        System.out.println("Test".repeat(5));;

        int a = 5;
        String s = "IDK";
        String b = String.format("Test %d %s", a, s);
        System.out.println(b);

        StringBuilder sb = new StringBuilder();
        sb.append("Test");
        sb.append(" is alright!");
        System.out.println(sb.toString());
        
        String test = "lololol";
        System.out.println(test.replace('o', 'a'));
        System.out.println(test.replaceAll("lo", "pes"));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ahoj ").append(" z ").append(" Javy");
        stringBuilder.insert(0, ">> ").insert(stringBuilder.length(), " <<");
        System.out.println(stringBuilder);
        StringBuilder sb2 = new StringBuilder().append("JAVA").reverse();
        System.out.println(sb2);
        String sss = "";
        for(int i = 1; i <= 5; i++){
            sss += i + " ";
        }
        System.out.println(sss);

        String text = "Mesto Kosice";
        text = text.replaceAll("Kosice", "Bratislava");
        System.out.println(text);
    }
}
