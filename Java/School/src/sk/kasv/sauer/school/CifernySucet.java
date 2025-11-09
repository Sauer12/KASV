package sk.kasv.sauer.school;

import java.util.Scanner;

public class CifernySucet {
    public static void main(String[] args) {
        CifernySucet cs = new CifernySucet();
//        cs.sucet10();
        System.out.print("Najväčšie štvorciferné číslo deliteľné 97 je: ");
        System.out.print(cs.maxNumberDivide());
    }

    public void sucet10(){
        int cifSum = 0;

        while(true) {
            cifSum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Zadaj číslo, ktorého ciferný súčet je 10: ");
            int cislo = sc.nextInt();
            while (cislo != 0) {
                cifSum += cislo % 10;
                cislo = cislo / 10;
            }
            if (cifSum == 10){
                break;
            }
            System.out.println("Nezadal si číslo, ktorého ciferný súčet je 10: ");
        }

        System.out.println("Správne číslo, ciferný súčet je " + cifSum);
    }

    public int maxNumberDivide(){
        for(int i = 9999; i > 0; i--){
            if (i % 97 == 0){
                return i;
            }
        }
        return 0;
    }
}

// y = 12, x = 4, 