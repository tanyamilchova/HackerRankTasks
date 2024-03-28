package org.example;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task5bReadExcel {
    public static void main(String[] args) {

        try (FileInputStream file=new FileInputStream("src/main/java/org/example/example.xlsx")){
            Workbook workbook= WorkbookFactory.create(file);
            int numberOfSheets= workbook.getNumberOfSheets();
            for (int i = 0; i < numberOfSheets; i++) {
                Sheet sheet = workbook.getSheetAt(i);

                for (Row row : sheet) {
                    for (Cell cell : row) {
                        switch (cell.getCellType()) {
                            case STRING -> System.out.print(cell.getStringCellValue() + ",");
                            case NUMERIC -> System.out.print(cell.getNumericCellValue() + ",");
                            case BOOLEAN -> System.out.print(cell.getBooleanCellValue() + ",");
                            default -> System.out.println("Data not available");
                        }
                    }
                    System.out.println();
                }
            }
        workbook.close();
        } catch (FileNotFoundException e) {
                System.out.println("File not found");
           e.printStackTrace();
        } catch (IOException e) {
                System.out.println("Problem with reading the file");
                e.printStackTrace();
        }
    }
}
