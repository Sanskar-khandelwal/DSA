package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    int val;
    LevelOrderTraversal left;
    LevelOrderTraversal right;
    LevelOrderTraversal(int val) {
        this.val = val;
    }

    public static void main(String[] args) {
        LevelOrderTraversal Tree = new LevelOrderTraversal(1);
        Tree.left = new LevelOrderTraversal(3);
        Tree.right = new LevelOrderTraversal(5);
        Tree.left.left = new LevelOrderTraversal(7);
        Tree.left.right = new LevelOrderTraversal(9);
        Tree.right.left = new LevelOrderTraversal(11);
        Tree.right.right = new LevelOrderTraversal(12);

      ArrayList<ArrayList<Integer>> list =   levelOrder(Tree);
        System.out.println(list);
    }

      public static  ArrayList<ArrayList<Integer>>  levelOrder(LevelOrderTraversal root) {
        ArrayList<ArrayList<Integer>> wraplist = new ArrayList<>();

          LevelOrderTraversal Node;
        Queue<LevelOrderTraversal> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> sublist = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node = q.remove();
                System.out.println(Node.val);
                if (Node.left != null) {
                    q.add(Node.left);
                }
                if (Node.right != null) {
                    q.add(Node.right);
                }
                sublist.add(Node.val);
            }
            wraplist.add(sublist);
        }
        return wraplist;

    }

}
