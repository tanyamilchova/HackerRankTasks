package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRemoveRepeatedWords {


        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            //To solve this challenge, complete the following three lines:
            //
            //Write a RegEx that will match any repeated word.
            //Complete the second compile argument so that the compiled RegEx is case-insensitive.
            //Write the two necessary arguments for replaceAll such that each repeated word is replaced with the very first instance the word found in the sentence.
            // It must be the exact first occurrence of the word, as the expected output is case-sensitive.
//            String input ="5\n" +
//                    "Goodbye bye bye world world world\n" +
//                    "Sam went went to to to his business\n" +
//                    "Reya is is the the best player in eye eye game\n" +
//                    "in inthe\n" +
//                    "Hello hello Ab aB";
            String input=enterInput();
            String output=matchWithRegex(input);
            System.out.println(output);
        }
        static String matchWithRegex(String input){
            String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
            Pattern pattern= Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
            Matcher matcher=pattern.matcher(input);

            while (matcher.find()) {
                input = input.replaceAll(matcher.group(), matcher.group(1));
            }
            return input;
        }
        public static String enterInput(){
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            String input="";
            StringBuilder stringBuilder=new StringBuilder();
            try {
                int num = Integer.parseInt(bufferedReader.readLine());
                for (int i = 0; i < num; i++) {
                    String inputRow = bufferedReader.readLine();
                 stringBuilder.append(inputRow).append("\n");
                }

            }catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            input=stringBuilder.toString();
            return input;
        }
}

