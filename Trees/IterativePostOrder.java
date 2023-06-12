package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class IterativePostOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        ArrayList<Integer> list =  iterativePostOrder(root);
        System.out.println(list);

    }

    private static ArrayList<Integer> iterativePostOrder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();

        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();
        TreeNode node;

        st1.push(root);

        while(!st1.isEmpty()){
          node =  st1.pop();
            System.out.println(node.val);
          st2.push(node);
          if(node.left != null){
              st1.push(node.left);
          }
          if(node.right!= null){
              st1.push(node.right);
            }
        }
        int size = st2.size();
        for(int i = 0; i < size ; i++){
            list.add(st2.pop().val);
        }
   return list;
    }
}
