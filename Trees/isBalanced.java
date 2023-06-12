package Trees;

import java.util.ArrayList;

public class isBalanced {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
        boolean ans = isTreeBalanced(root);
        System.out.println(ans);
    }

    private static boolean isTreeBalanced(TreeNode Node) {
        if(Node == null){
            return true;
        }

        int l = getHeight(Node.left);
        int r = getHeight(Node.right);
        if(Math.abs(l-r) > 1){
            return false;
        }
        return isTreeBalanced(Node.left) && isTreeBalanced(Node.right);
    }

    private static int getHeight(TreeNode Node) {
        if(Node == null){
            return 0;
        }

        return 1 +  Math.max(getHeight(Node.left), getHeight(Node.right));

    }

}
