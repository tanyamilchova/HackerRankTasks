package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class Task5aReadCSV {
    public static void main(String[] args) {

        String file = "src/main/java/org/example/example.csv";
        String line = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            while((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                for(String index : row) {
                    System.out.print(index);
                }
                System.out.println();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}

