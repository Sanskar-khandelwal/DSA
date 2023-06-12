package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class IterativeInOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        ArrayList<Integer> list =  iterativeInOrder(root);
        System.out.println(list);

    }

    private static ArrayList<Integer> iterativeInOrder(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
     if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current subtree
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // Process the current node
            curr = stack.pop();
            result.add(curr.val); // Add the value to the ArrayList

            // Move to the right subtree
            curr = curr.right;
        }

        return result;
    }

    }

