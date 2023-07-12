package Trees;

import java.util.ArrayList;

public class SearchingInBST {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(30);
        root.left = new TreeNode(20);
        root.right = new TreeNode(40);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(25);
        root.right.left = new TreeNode(35);
        root.right.right = new TreeNode(50);
        int list =  search(root, 50);
        System.out.println(list);


    }

    private static int search(TreeNode root, int item) {
        if(root == null){
            return 0;
        }

        if(root.val == item){
            return 1;
        }


        else if(item > root.val){
          return   search(root.right, item);
        }
        else {
          return   search(root.left, item);
        }

    }
}
