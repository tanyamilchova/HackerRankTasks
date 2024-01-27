package Singleton;

import java.util.Scanner;

public class SingletonClass {
    //A private Singleton non parameterized constructor.
    //A public String instance variable named .
    //Write a static method named getSingleInstance that returns the single instance of the Singleton class.
    public static String str;
    private static SingletonClass instance;
    private SingletonClass(String str){
        System.out.println("Hello I am a singleton! Let me say "+str+" to you");
    }
    public static SingletonClass getSingletonInstance(){
        if(instance ==null) {
            instance = new SingletonClass(getSingletonInstance().str);
        }
            return instance;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        SingletonClass singletonClass=new SingletonClass(str);
    }
}
