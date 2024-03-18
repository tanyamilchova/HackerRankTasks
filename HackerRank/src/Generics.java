import OOP2.Ar;

import java.util.ArrayList;

public class Generics {
    //Generic methods are a very efficient way to handle multiple datatypes using a single method. This problem will test your knowledge on Java Generic methods.
    //
    //Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.
    //
    //You are given code in the editor. Complete the code so that it prints the following lines:
    //
    //1
    //2
    //3
    //Hello
    //World
    //Do not use method overloading because your answer will not be accepted.
    public static void main(String[] args) {
        ArrayList<Integer>intList=new ArrayList<>();
        ArrayList<String>stringList=new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        stringList.add("Hello");
        stringList.add("World");


        printGenericTypes(intList);
        printGenericTypes(stringList);
    }
    public static <T>void printGenericTypes(ArrayList<T> list){
        for (T t:list){
            System.out.println(t);
        }
    }
}
