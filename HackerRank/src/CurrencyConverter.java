import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {


//public static final NumberFormat getCurrencyInstance()
//Returns a currency format for the current default FORMAT locale.
//This is equivalent to calling getCurrencyInstance(Locale.getDefault(Locale.Category.FORMAT)).
//
//Returns:
//the NumberFormat instance for currency formatting
//See Also:
//Locale.getDefault(java.util.Locale.Category), Locale.Category.FORMAT
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();
            String formattedAmount="";

//            NumberFormat us=NumberFormat.getCurrencyInstance(US);
            NumberFormat us = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
            NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            NumberFormat china = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
            NumberFormat france = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));
//            NumberFormat china=NumberFormat.getCurrencyInstance(CHINA);
//            NumberFormat france=NumberFormat.getCurrencyInstance(FRANCE);

            String formattedAmount1 = us.format(payment);
            String formattedAmount2 = india.format(payment);
            String formattedAmount3=china.format(payment);
            String formattedAmount4=france.format(payment);
            System.out.println("US: "+formattedAmount1);
            System.out.println("India: "+formattedAmount2);
            System.out.println("China: "+formattedAmount3);
            System.out.println("France: "+formattedAmount4);






            System.out.println(formattedAmount); // Output: $1,234.56

            // Write your code here.


        }
    }

