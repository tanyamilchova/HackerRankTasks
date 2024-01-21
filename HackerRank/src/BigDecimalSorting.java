package BigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimalSorting {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            String[] arr = new String[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.next();
            }
            scanner.close();

            Arrays.sort(arr, new BigDecimalComparator());

            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        }
    public static class BigDecimalComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {

            BigDecimal bd1 = new BigDecimal(s1);
            BigDecimal bd2 = new BigDecimal(s2);

            int numericComparison = bd2.compareTo(bd1);

            if (numericComparison == 0) {
                return 1;
            }
            return numericComparison;
        }
    }
}



