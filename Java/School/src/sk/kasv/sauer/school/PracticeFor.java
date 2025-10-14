package sk.kasv.sauer.school;

public class PracticeFor {
    public static void main(String[] args){
        PracticeFor pf = new PracticeFor();
//        pf.printAhoj4times();
//        pf.printEvenNumbers(200);
//          pf.printFiveNumbers();
//          pf.printNoFourthNumber();
//          pf.numbers();
          pf.numbers2();
    }

    public void printAhoj4times(){
        for(int i = 0; i < 4; i++) {
            System.out.println("Ahoj!");
        }
    }

    public void printEvenNumbers(int maximumValue){
        for(int i = 0; i <= maximumValue; i=i+2){
            System.out.print((i) + " ");
        }
    }

    public void printFiveNumbers() {
        for (int i = 100; i > 0; i -= 5) {
            System.out.print(i + " ");
        }
    }

    public void printNoFourthNumber() {
        for (int i = 1; i <= 50; i++) {
            if (i % 4 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void numbers(){
        for(int i = 1; i <= 50; i++){
            if(i % 2 != 0 && i % 3 != 0)
                System.out.print(i + " ");
        }
    }

    public void numbers2(){
        for(int i = 32; i <= 127; i++) {
            if (i < 100) {
                System.out.println(" " + i);
            }
            else{
                System.out.println(i);
            }
        }
    }
}