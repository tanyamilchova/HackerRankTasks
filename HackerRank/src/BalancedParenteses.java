package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class BalancedParenteses {
    public static void main(String[] args) {

//A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.
//
//Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
//
//Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
//
//Given a string, determine if it is balanced or not.
//
//Input Format
//
//There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.
//
//The part of the code that handles input operation is already provided in the editor.
//
//Output Format
//
//For each case, print 'true' if the string is balanced, 'false' otherwise.
//
//Sample Input
//
//{}()
//({()})
//{}(
//[]
//Sample Output
//
//true
//true
//false
//true
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        try {

            String input ;
            while ( (input= bufferedReader.readLine())!=null) {
                String[] testCases = input.split("\n");
                for (String testCase : testCases) {
                    System.out.println(checkBalances(testCase));
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {

            }
        }

    }
public static boolean checkBalances(String input){

    Stack<Character>characterStack=new Stack<>();
       for(char element:input.toCharArray()){
           if(element=='[' || element=='{' || element=='(' ){
               characterStack.push(element);
           }else {

               if(characterStack.isEmpty()){
                   return false;
               }
               char topChar=characterStack.pop();
               if(element==')' && topChar!='(' ||
                  element=='}' && topChar!='{' ||
                  element==']' && topChar!='['){
                   return  false;
               }
           }

       }
   return characterStack.isEmpty();
    }
}
