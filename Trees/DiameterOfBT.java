package Trees;

import java.util.ArrayList;

public class DiameterOfBT {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(7);
        int list =  diameter(root, 0);
        System.out.println(list);
    }

    private static int diameter(TreeNode root, int max) {
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        max =   Math.max(max, (lh + rh));
      return 1+ max;
    }

    private static int height(TreeNode Node) {
        if(Node == null){
            return 0;
        }
        int lh = height(Node.left);
        int rh = height(Node.right);
        return 1 + Math.max(lh, rh);
    }
}
