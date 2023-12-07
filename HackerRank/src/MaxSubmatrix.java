package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxSubmatrix {
    // You are given a  2D array. An hourglass in an array is a portion shaped like this:
    //
    //a b c
    //  d
    //e f g
    //For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
    //The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.
    //
    //In this problem you have to print the largest sum among all the hourglasses in the array.
    //
    //Input Format
    //
    //There will be exactly  lines, each containing  integers seperated by spaces. Each integer will be between  and  inclusive.
    //
    //Output Format
    //
    //Print the answer to this problem on a single line.
// 11 12 13 14 15 16
//22 23 24 25 26 27
//31 32 33 34 35 36
//41 42 43 44 45 46
//51 52 53 54 55 56
//61 62 63 64 65 66

//1 2 3 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 0 0 5 5 5
//0 0 0 0 5 0
//0 0 0 5 5 5
//0 -4 -6 0 -7 -6
//-1 -2 -6 -8 -3 -1
//-8 -4 -2 -8 -8 -6
//-3 -1 -2 -5 -7 -4
//-3 -5 -3 -6 -6 -6
//-3 -6 0 -8 -6 -7

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            List<List<Integer>> arr=new ArrayList<>();
            IntStream.range(0,6).forEach(i->{
                try{
                    arr.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+S", "").split(" "))
                                    .map(Integer::parseInt)
                                    .collect(Collectors.toList())
                    );

                }catch ( IOException e){
                    System.out.println("Wrong input");
                    throw new RuntimeException(e);
                }
            });
            System.out.println(maxSubmatrix(arr));
        }

    private static int maxSubmatrix(List<List<Integer>> arr) {

            int max=  arr.get(0).get(0)+arr.get(0).get(1)+arr.get(0).get(2)+
                    arr.get(1).get(1)+
                    arr.get(2).get(0)+arr.get(2).get(1)+arr.get(2).get(2);

        for (int i = 0; i < arr.size()-2; i++) {
            for (int j = 0; j < arr.get(i).size()-2; j++) {
                int sum=0;
                sum=sum+arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+
                        arr.get(i+1).get(j+1)+
                        arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                if(max<sum){
                    max=sum;
                }
            }

        }
         return max;
    }


}
