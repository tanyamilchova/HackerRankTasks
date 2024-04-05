package Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
//You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.
//Hint: You can use comparators to sort a list of objects. See the oracle docs to learn about comparators.
//Input Format
//The first line of input contains an integer , representing the total number of students. The next  lines contains a list of student information in the following structure:
//ID Name CGPA
//Constraints
//The name contains only lowercase English letters. The  contains only integer numbers without leading zeros. The CGPA will contain, at most, 2 digits after the decimal point.
//Output Format
//After rearranging the students according to the above rules, print the first name of each student on a separate line.
//
//Sample Input
//5
//    33 Rumpa 3.68
//    85 Ashis 3.85
//    56 Samiha 3.75
//    19 Samara 3.75
//    22 Fahim 3.76
//Sample Output
//Ashis
//Fahim
//Samara
//Samiha
//Rumpa
class StudentDetails{
    private String cgpa;
    private String name;
    private String id;
    StudentDetails(String id,String name, String cgpa){
        this.cgpa=cgpa;
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public String getCgpa() {
        return cgpa;
    }

    public String getId() {
        return id;
    }
}
public class SortStudentCGPADecreasing {

    public static void main(String[] args) {
         final Comparator<StudentDetails>CGPACOMPARATOR= new Comparator<StudentDetails>() {
             @Override
             public int compare(StudentDetails o1,StudentDetails o2) {
                 if(o2.getCgpa().equals(o1.getCgpa())) {
                     return o1.getName().compareTo(o2.getName());
                 }else {
                     if(o2.getName().equals(o1.getName())){
                         return o2.getId().compareTo(o1.getId());
                     }
                 }
                 return o2.getCgpa().compareTo(o1.getCgpa());
             }
         };
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        ArrayList<StudentDetails> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String line = sc.nextLine();
           StudentDetails studentData = getStudentDetails(line);
            list.add(studentData);
        }
        list.sort(CGPACOMPARATOR);
       for (StudentDetails studentDetails:list){
           System.out.println(studentDetails.getName());
       }
    }
    public static StudentDetails getStudentDetails(String input){
        String[]splitedInput=input.trim().split(" ");
        return new StudentDetails(splitedInput[0],splitedInput[1],splitedInput[2]);
    }
}
