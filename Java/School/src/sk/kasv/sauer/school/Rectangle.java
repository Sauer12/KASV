package sk.kasv.sauer.school;

public class Rectangle {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.rectangle(5, 3, 'X');
    }

    public void rectangle(int rows, int cols, char symbol){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    // Du **********
    //    *        *
    //    *        *
    //    *        *
    //    **********
}
