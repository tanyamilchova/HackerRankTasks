package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertInDeleteFromList {
    //Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.
    //
    //Input Format
    //
    //The first line contains an integer,  (the initial number of elements in ).
    //The second line contains  space-separated integers describing .
    //The third line contains an integer,  (the number of queries).
    //The  subsequent lines describe the queries, and each query is described over two lines:
    //
    //If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
    //If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
    //Sample Input
    //
    //5
    //12 0 1 78 12
    //2
    //Insert
    //5 23
    //Delete
    //0
    //Sample Output
    //
    //0 1 78 12 23
    //Explanation
    //L=[12,0,1,78,12]
    //
    // Insert 23 at index 5.
    //L=[12,0,1,78,12,23]
    // Delete the element at index 0.
    //L=[0,1,78,12,23]
    public static void main(String[] args) {
        insertRemoveElFromList();
    }
    public static void insertRemoveElFromList() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int element = sc.nextInt();
            list.add(element);
        }

        int numQuieries = sc.nextInt();
        sc.nextLine();
        ArrayList<String> queries = new ArrayList<>();
        for (int i = 0; i < numQuieries * 2; i++) {
            String queryPart = sc.nextLine();
            queries.add(queryPart);
        }
        System.out.println(queries);
        for (int i = 0; i < queries.size() ; i += 2) {
            String type = queries.get(i);
            String actionRow = queries.get(i + 1);

            if(type.contains("Insert")) {
                insertElementOnPosition(actionRow,list);
            }
            if(type.contains("Delete")) {
                deleteElementOfPosition( actionRow,list);
            }
        }
        for (Integer i:list) {
            System.out.print(i+" ");
        }
    }

    private static void deleteElementOfPosition(String actionRow,ArrayList<Integer> list) {
        int position=Integer.parseInt(actionRow);

        if(position<list.size()) {
                    list.remove(position);
                    System.out.println(list);
                }else {
                    System.out.println("Position is bigger than the size of the array");
                }
        }

    private static void insertElementOnPosition(String actionRow,ArrayList<Integer> list) {
        String[]arrQuiery=actionRow.split(" ");
        int insertPos=Integer.parseInt(arrQuiery[0].trim());
        int number=Integer.parseInt(arrQuiery[1].trim());
        if(insertPos<=list.size()) {
            list.add(insertPos, number);
        }else {
            System.out.println("Position is bigger than the size of the array");
        }
    }
}


