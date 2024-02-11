package Exception;
import java.util.Scanner;

public class ExseptionHandling {
    //You are required to compute the power of a number by implementing a calculator.
    // Create a class MyCalculator which consists of a single method long power(int, int). This method takes two integers,  and , as parameters and finds .
    // If either  or  is negative, then the method must throw an exception which says "".
    // Also, if both  and  are zero, then the method must throw an exception which says ""
    //
    //For example, -4 and -5 would result in .
    //
    //Complete the function power in class MyCalculator and return the appropriate result after the power operation or an appropriate exception as detailed above.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
        int n=sc.nextInt();
        int p=sc.nextInt();

            if (validateInput(n, p)) {
                System.out.println(printPowerOfN(n, p));
            }
        }
    }
    public static int printPowerOfN(int n, int p){
        double power=0;
        power=Math.pow(n,p );
        return (int) power;
    }
    public static boolean validateInput(int n,int p){
        boolean valid=true;
        if(n<0 || p<0){
            try {
                throw new Exception(": n or p should mot be negative");
            } catch (Exception e) {
                System.out.println(e.getClass().getName()+e.getMessage());

                valid=false;
            }
        }else {
            if (n == 0 && p == 0) {
                try {
                    throw new Exception(": n and p should not be zero");
                } catch (Exception e) {
                    System.out.println(e.getClass().getName() + e.getMessage());
                    valid=false;
                }
            }
        }
        return valid;
    }
}
