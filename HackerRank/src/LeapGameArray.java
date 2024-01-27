package Array;

import java.util.Arrays;
import java.util.Scanner;

public class LeapGameArray {
    //Let's play a game on an array! You're standing at index  of an -element array named .
    // From some index  (where ), you can perform one of the following moves:
    //Move Backward: If cell  exists and contains a , you can walk back to cell .
    //Move Forward:
    //If cell  contains a zero, you can walk to cell .
    //If cell  contains a zero, you can jump to cell .
    //If you're standing in cell  or the value of , you can walk or jump off the end of the array and win the game.
    //In other words, you can move from index  to index , , or  as long as the destination index is a cell containing a . If the destination index is greater than , you win the game.
    //STDIN           Function
    //-----           --------
    //4               q = 4 (number of queries)
    //5 3             game[] size n = 5, leap = 3 (first query)
    //0 0 0 0 0       game = [0, 0, 0, 0, 0]
    //6 5             game[] size n = 6, leap = 5 (second query)
    //0 0 0 1 1 1     . . .
//    6 3
//    0 0 1 1 1 0
    //3 1
    //0 1 0
    //Sample Output
    //
    //YES
    //YES
    //NO
    //NO
    public static boolean canWin(int leap, int[] game) {

        int countOnes = 0;
        boolean canJump = true;
        boolean ones = false;

        if (leap > game.length - 1) {
            return true;
        } else {
            if (game[leap] == 0) {
                return true;
            }

            for (int i = 1; i < game.length; i++) {
                if (game[i] == 1) {
                    canJump = false;
                    countOnes++;
                    ones = true;
                    if (i == game.length - 1) {
                        if (leap > countOnes) {
                            canJump = true;
                        }
                    }
                } else {
                    if (leap > countOnes && ones) {
                        canJump = true;
                    }
                    if (!canJump) {
                        break;
                    }
                    countOnes = 0;
                    ones = false;
                }

            }
            return canJump;
        }
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();
        while (queries-- > 0) {
            int n = sc.nextInt();
            int leap = sc.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = sc.nextInt();
            }

            System.out.println(canWin(leap, game) ? "Yes" : "No");
        }
        sc.close();


    }
}