package bynaryTree.printTreePostOrder;

import java.util.Scanner;

class Node{
     Node left;
     Node right;
     int data;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
 class PrintTreeRev {

    public static Node insertNode(Node root,int value){
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

    public static void inReversedOrder(Node root){
        if(root==null){
            return;
        }else {
            inReversedOrder(root.left);
            inReversedOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numElements=Integer.parseInt(sc.nextLine());
        Node root=null;
        while (numElements-- >0){

            int data=Integer.parseInt(sc.nextLine());
            root=insertNode(root,data);
        }
        sc.close();
        inReversedOrder(root);
    }
}
