package Trees;

import java.sql.SQLOutput;
import java.util.*;
import java.util.Queue;

public class creatingTree {

class Node{
    Node lchild;
    int data;
     Node rchild;

     public Node(int val){
         this.data = val;
     }

};


public void creatingTree(){

    Queue<Node> q = new LinkedList<>();
    Node root = new Node(1);
    q.add(root);

    while(!q.isEmpty()){
        Node temp = q.remove();
        System.out.println("Enter left child");
        Scanner x = new Scanner(System.in);

        if(x.nextInt()!= -1){
         Node tempo = new Node(x.nextInt());
         tempo.lchild = null;
         tempo.rchild = null;
         temp.lchild = tempo;
         q.add(tempo);
        }


        System.out.println("Enter right child");
        Scanner y = new Scanner(System.in);

        if(y.nextInt()!= -1){
            Node tempo = new Node(x.nextInt());
            tempo.lchild = null;
            tempo.rchild = null;
            q.add(tempo);

    }

}

    public static void main(String[] args) {

    }
}
