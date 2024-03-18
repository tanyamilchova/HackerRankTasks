package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class ComparatorOfPlayers {


//You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.
//
//Hint: You can use comparators to sort a list of objects. See the oracle docs to learn about comparators.
//
//Input Format
//
//The first line of input contains an integer , representing the total number of students. The next  lines contains a list of student information in the following structure:
//
//ID Name CGPA
//Constraints
//
//
//
//
//
//
//The name contains only lowercase English letters. The  contains only integer numbers without leading zeros. The CGPA will contain, at most, 2 digits after the decimal point.
//
//Output Format
//
//After rearranging the students according to the above rules, print the first name of each student on a separate line.
//
//Sample Input
//
//5
//33 Rumpa 3.68
//85 Ashis 3.85
//56 Samiha 3.75
//19 Samara 3.75
//22 Fahim 3.76
//Sample Output
//
//Ashis
//Fahim
//Samara
//Samiha
//Rumpa
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Checker checker = new Checker();
            int n = Integer.parseInt(sc.nextLine());
            Player[] players = new Player[n];
            for (int i = 0; i < players.length; i++) {
                players[i] = new Player(sc.next(), sc.nextInt());
            }
            Arrays.sort(players, checker);
//            System.out.println(Arrays.toString(players));
            for(int i = 0; i < players.length; i++){
                System.out.printf("%s %s\n", players[i].name, players[i].score);
            }
        }
    }
class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.score == o2.score) {
            return o1.name.compareTo(o2.name);
        }
        return (o2.score - o1.score);
    }
}
