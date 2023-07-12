package Trees.Traversals;

import Trees.TreeNode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RInOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        ArrayList list = new ArrayList();
        inOrder(root, list);
        System.out.println(list);
    }

    public static ArrayList inOrder(TreeNode root, ArrayList list) {
        if(root == null){
            return list;
        }
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
      return list;
    }
}
