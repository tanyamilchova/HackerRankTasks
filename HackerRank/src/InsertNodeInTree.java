package bynaryTree.inserrtInTree;

import java.util.Scanner;

class Node{
    Node left;
    Node right;
    int data;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

}
public class InsertNodeInTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        Node root=null;
        while (n-- >0){
            int data=sc.nextInt();
            root=insertNode(root,data);
        }
        sc.close();
        preorder(root);
    }

    public static void preorder(Node root) {
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node insertNode(Node root, int data) {
        if(root==null){
            return new Node(data);
        }else {
            Node current;
            if(root.data>=data){
                current=insertNode(root.left,data);
                root.left=current;
            }
            else {
                current=insertNode(root.right,data);
                root.right=current;
            }
        }
        return root;
    }
}
