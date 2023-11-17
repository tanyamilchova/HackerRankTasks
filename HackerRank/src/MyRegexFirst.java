import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegexFirst {
    // valid
    //000.12.12.034
    //121.234.12.12
    //23.45.12.56

    //invalid
    // 000.12.234.23.23
    //666.666.23.23
    //.213.123.23.32
    //23.45.22.32.
    //I.Am.not.an.ip
    public static void main(String[] args) {
String regex = "^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})(\\.(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})){3}$";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ip");
        while (sc.hasNext()) {
    String input=sc.nextLine();
    Pattern pattern=Pattern.compile(regex);
            Matcher matcher=pattern.matcher(input);
            if(matcher.matches()){
                System.out.println("Valid ip address");
            }
            else {
                System.out.println("Invalid ip address");
            }
        }
    }
}
