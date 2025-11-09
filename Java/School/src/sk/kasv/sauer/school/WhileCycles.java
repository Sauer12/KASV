package sk.kasv.sauer.school;

public class WhileCycles {
    public static void main(String[] args) {
        WhileCycles wc = new WhileCycles();
        wc.notSeven();
    }

    public void notSeven(){
        for(int i = 0; i <= 50; i++){
            if(i % 7 != 0)
                System.out.print(i + " ");
        }
    }
}
