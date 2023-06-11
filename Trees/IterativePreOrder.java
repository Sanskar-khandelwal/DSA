package Trees;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class IterativePreOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
         root.right = new TreeNode(3);
         root.left.left = new TreeNode(4);
         root.left.right = new TreeNode(5);
         root.right.left = new TreeNode(6);
         root.right.right = new TreeNode(7);
       ArrayList<Integer> list =  iterativePreOrder(root);
        System.out.println(list);


    }

   public static ArrayList<Integer> iterativePreOrder(TreeNode root){
        TreeNode node;
       ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
       Stack<TreeNode> stack = new Stack();
       stack.push(root);
       while(!stack.isEmpty()){
           node =  stack.pop();
           if(node.right != null){
               stack.push(node.right);
           }
           if(node.left != null){
               stack.push(node.left);
           }
           list.add(node.val);
       }
       return list;
    }

}
