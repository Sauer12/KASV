package sk.sauer.lukas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static final String CYAN_BOLD = "\033[1;36m";
    public static final String BLACK_BOLD = "\033[1;30m";
    public static final String RESET = "\033[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        App app = new App();

        app.showMainMenu(scanner);
    }

    public static void clearScreen(){
        for(int i = 0; i < 50; i++){
            System.out.println();
        }
    }

    public void showMainMenu(Scanner scanner){
        clearScreen();
        System.out.println(CYAN_BOLD + "WORDS MEMORIZER V0.1");
        System.out.println(BLACK_BOLD + "1 - Učiť sa");
        System.out.println(BLACK_BOLD + "2 - Vytvoriť nový zoznam");
        System.out.println(BLACK_BOLD + "3 - Nastavenia");
        System.out.println(BLACK_BOLD + "q - Ukončiť program");
        System.out.print(RESET + "Zadaj možnosť: ");
        String choice = scanner.nextLine();
        if(choice.equals("1")){
            learningMode(scanner);
        } else if (choice.equals("2")){
            System.out.println();
        }else{
            System.out.println();
        }
    }

    public void learningMode(Scanner scanner){
        clearScreen();
        System.out.println(CYAN_BOLD + "WORDS MEMORIZER V0.1");
        // tu doplnit cyklus, ktory preiteruje vsetky subory v lists a vypise pred nich cislo, napr. 1 - Testovací zoznam
        getFileName(scanner);
    }

    public void learn(Scanner scanner, String nameOfFile){
        List<String> keysList = new ArrayList<>();
        List<String> valuesList = new ArrayList<>();

        try{
            File file = new File("src/sk/sauer/lukas/lists/" + nameOfFile);
            Scanner fileScanner = new Scanner(file);

            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if(!line.isEmpty()) {
                    // Rozdelíme riadok podľa bodkočiarok
                    String[] pairs = line.split(";");
                    for(String pair : pairs){
                        pair = pair.trim();
                        if(!pair.isEmpty()){
                            //Rozdelíme každý pár podľa čiarky
                            String[] parts = pair.split(",");
                            if (parts.length == 2){
                                keysList.add(parts[0].trim());
                                valuesList.add(parts[1].trim());
;                           }
                        }
                    }
                }
            }
            fileScanner.close();

            // Konvertujeme List na pole
            String[] keys = keysList.toArray(new String[0]);
            String[] values = valuesList.toArray(new String[0]);

            for(String s : keys){
                System.out.println(s);
            }

            for(String s : values){
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Súbor " + nameOfFile + " sa nenašiel!");
        }
    }

    public void getFileName(Scanner scanner){
        File listsDir = new File("src/sk/sauer/lukas/lists");
        File[] files = listsDir.listFiles();

        if (files == null || files.length == 0){
            System.out.println("V priečinku sa nenašli žiadne súbory.");
            return;
        }

        List<String> csvFiles = new ArrayList<>();
        int counter = 1;

        for (File file : files){
            if (file.isFile() && file.getName().endsWith(".csv")) {
                csvFiles.add(file.getName());
                // Odstranenie pripony .csv pre lepsie zobrazenie
                String displayName = file.getName().replace(".csv", "");
                System.out.println(BLACK_BOLD + counter + " - " + displayName);
                counter++;
            }
        }

        if (csvFiles.isEmpty()) {
            System.out.println("V priečinku sa nenašli žiadne CSV súbory.");
            return;
        }

        System.out.print(RESET + "Vyber si zoznam, ktorý sa chceš učiť: ");
        String choice = scanner.nextLine().toLowerCase();
        if (choice.equals("q")){

        }

        try {
            int choiceNum = Integer.parseInt(choice);
            if (choiceNum >= 1 && choiceNum <= csvFiles.size()) {
                String selectedFile = csvFiles.get(choiceNum - 1);
                learn(scanner, selectedFile);
            } else {
                System.out.println("Neplatná voľba!");
            }
        } catch (NumberFormatException e){
            System.out.println("Zadajte prosím číslo!");
        }
    }
}
