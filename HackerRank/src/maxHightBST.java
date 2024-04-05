package bynaryTree.heightOfBymaryTree;

import java.util.Scanner;

class Node{
    Node left;
    Node right;
    int data;
    public  Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
 class maxHightBST {
     public static Node insertNode(Node root, int value){
         Node current;
         if(root==null){
             return new Node(value);
         }else {
             if(root.data>=value){
                 current=insertNode(root.left,value);
                 root.left=current;
             }else {
                 current=insertNode(root.right,value);
                 root.right=current;
             }
             return root;
         }
     }

     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int t = scan.nextInt();
         Node root = null;
         while (t-- > 0) {
             int data = scan.nextInt();
             root = insertNode(root, data);
         }
         scan.close();
         int height=heightH(root);
         System.out.println(height+" height");
     }

     private static int heightH(Node root) {
         int heightLeft;
         int heightRight;
         if(root==null){
             return -1;
         }else {
             heightLeft = heightH(root.left)+1;
             heightRight=heightH(root.right)+1;
         }
            return Math.max(heightLeft,heightRight);
     }
 }
