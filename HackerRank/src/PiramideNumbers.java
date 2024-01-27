package Figures;

public class PiramideNumbers {
    public static int findRows(int input){
        int rows=1;

        while(input>0){
            input-=rows;
            rows++;
        }
        return rows-1;
    }
    public static void drawPiramide(int input){
        int rows= PiramideNumbers.findRows(input);
        int spaces=rows-1;
        int numbers=1;
        int stars=1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print(numbers++);
                if(numbers>input){
                    break;
                }
            }
            stars++;
            spaces--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int input=18;
        System.out.println(PiramideNumbers.findRows(input));
        PiramideNumbers.drawPiramide(input);
    }

}
