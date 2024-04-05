package Array;

import java.util.Scanner;

public class LeapGame {
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
            System.out.println(win(0, leap, game) ? "YES" : "NO");
        }
        sc.close();
    }

private static boolean win(int position, int leap, int[] game) {
    if (position >= game.length) {
        return true;
    }
    if (position < 0 || game[position] == 1) {
        return false;
    }
    game[position] = 1;
    return win(position + leap, leap, game) ||
            win(position + 1, leap, game) ||
            win(position - 1, leap, game);
}

    }




