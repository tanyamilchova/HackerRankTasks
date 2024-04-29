package Array;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String filePath = "output.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));

        int stringListCount=Integer.parseInt(bufferedReader.readLine());
        List<String>stringList=new ArrayList<>();
        for (int i = 0; i < stringListCount; i++) {
            String stringListItem=bufferedReader.readLine();
            stringList.add(stringListItem);
        }
        System.out.println("StringList "+stringList);
        int queryListCount=Integer.parseInt(bufferedReader.readLine());
        List<String>queries=new ArrayList<>();
        for (int i = 0; i < queryListCount; i++) {
            String quieryItem=bufferedReader.readLine();
            queries.add(quieryItem);
        }
        System.out.println("QueryList  "+queries);
        List<Integer>res=matchingStrings(stringList,queries);
        System.out.println(res);

        for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));
            if(i!=res.size()-1){
                bufferedWriter.write("\n");
            }
        }
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        List<Integer>result=new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            int countOccurances=0;

            for (int j = 0; j < stringList.size(); j++) {
                if(queries.get(i).equals(stringList.get(j))) {
                    countOccurances++;
                }
            }
            result.add(countOccurances);
        }
        return result;
    }
}
