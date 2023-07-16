package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class BoundryTraveral {

   public static void BoundryTraveralOfTree(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        leftTraversal(root, list);
        leafTraveral(root, list);
        rightTraversal(root.right, stack);
       while(!stack.isEmpty()){
         list.add(stack.pop());

       }
        System.out.println(list);
    }
    private static void leftTraversal(TreeNode root,ArrayList list) {
        if(root.left == null && root.right == null){
            return;
        }
       if(root.left != null){
           list.add(root.val);
           leftTraversal(root.left, list);
       }
       else if(root.right != null){
           list.add(root.val);
           leftTraversal(root.right, list);
       }
    }

    private static void leafTraveral(TreeNode root, ArrayList list) {
     if(root == null){
         return;
     }
     leafTraveral(root.left, list);
   if(root.left == null && root.right == null) {
       list.add(root.val);
   }
     leafTraveral(root.right, list);
    }

    private static void rightTraversal(TreeNode root, Stack stack) {

        if(root.left == null && root.right == null){
            return;
        }
        if(root.right != null){
            stack.push(root.val);
            rightTraversal(root.right, stack);
        }
        else if(root.left != null){
           stack.push(root.val);
            rightTraversal(root.left, stack);
        }
    }




    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(4);
        root.left.left.right.left = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);
        root.right = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);
        root.right.right.left.left = new TreeNode(10);
        root.right.right.left.right = new TreeNode(11);
        BoundryTraveralOfTree(root);
    }
}
