package sk.kasv.sauer.school.fifty.fiftyTasks;

public class WhileZakladne {
    public static void main(String[] args) {
        WhileZakladne wz = new WhileZakladne();
        // 1.
        wz.printNums();
        // 2.
        wz.printEvenNums();
        // 3.
        wz.printReversNums();
        // 4.
        wz.printMultiplication3();
        // 5.
        wz.sumNumsTo100();
        // 6.
        wz.sumEvenFrom1To50();
        // 7.
        wz.printSecondPow();
        // 8.
        wz.printThirdPow();
        // 9.
        wz.sum1toN(15);
        // 10.
        wz.divisible5from1to100();
    }

    // 1. Cisla od 1 do 10
    public void printNums(){
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    // 2. Vypis parne cisla od 2 do 20
    public void printEvenNums(){
        for(int i = 2; i <= 20; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();
    }

    // 3. Vypis cisla od 10 do 1 v opacnom poradi
    public void printReversNums(){
        for(int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    // 4. Vypis vsetky nasobky 3 mensie ako 30
    public void printMultiplication3(){
        for(int i = 1; i < 30; i++){
            if(i % 3 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();
    }

    // 5. Spocitaj cisla od 1 do 100
    public void sumNumsTo100(){
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);
        System.out.println();
    }

    // 6. Spocitaj len parne cisla od 1 do 50
    public void sumEvenFrom1To50(){
        int sum = 0;
        for(int i = 1; i <= 50; i++){
            if(i % 2 == 0)
                sum += i;
        }
        System.out.println(sum);
        System.out.println();
    }

    // 7. Zobraz druhe mocniny cisel od 1 do 10
    public void printSecondPow(){
        for(int i = 1; i <= 10; i++){
            System.out.print(i * i + " ");
        }
        System.out.println();
        System.out.println();
    }

    // 8. Zobraz tretie mocniny cisel od 1 do 10
    public void printThirdPow(){
        for(int i = 1; i <= 10; i++){
            System.out.print(i * i * i + " ");
        }
        System.out.println();
        System.out.println();
    }

    // 9. Spocitaj sucet cisel od 1 po zadane n
    public void sum1toN(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
        System.out.println();
    }

    // 10. Spocitaj pocet cisel delitelnych 5 v intervale 1 - 100
    public void divisible5from1to100(){
        int count = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 5 == 0){
                count++;
            }
        }
        System.out.println(count);
        System.out.println();
    }
}
