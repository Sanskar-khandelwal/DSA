package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CreatingTree {


    private  class Node{
        Node left;
        int data;
        Node right;
    }
  public void create(){
        Node p,t;
      Queue<Node> q = new LinkedList<>();


      Scanner sc = new Scanner(System.in);
       System.out.println("Enter root value");
       int x = sc.nextInt();

      Node root = new Node();
      root.left = root.right = null;
       root.data = x;
      q.add(root);

  }
    public static void main(String[] args) {

    }
}
