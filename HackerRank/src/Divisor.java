package Interface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Divisor {
    //A Java interface can only contain method signatures and fields. The interface can be used to achieve polymorphism.
    // In this problem, you will practice your knowledge on interfaces.
    //
    //You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n).
    // You need to write a class called MyCalculator which implements the interface.
    //
    //divisorSum function just takes an integer as input and return the sum of all its divisors.
    // For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.
    //
    //Read the partially completed code in the editor and complete it. You just need to write the MyCalculator class only.
    // Your class shouldn't be public.

    public interface AdvancedArithmetic{
        int divisor_sum(int n);
    }



    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {

            int num = Integer.parseInt(bufferedReader.readLine());
            MyCalculator myCalculator=new MyCalculator();
            System.out.println(myCalculator.divisor_sum(num));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static class MyCalculator implements AdvancedArithmetic {

        @Override
        public int divisor_sum(int n) {
            System.out.println("I implemented: AdvancedArithmetic");
            ArrayList<Integer> dividors = new ArrayList<>();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    dividors.add(i);
                    sum += i;
                }
            }
            return sum;
        }
    }
}
