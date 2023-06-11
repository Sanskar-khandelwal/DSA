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
        ArrayList list = new ArrayList<>();
        TreeNode Node;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            Node = stack.pop();
            while(Node.left != null){
                stack.push(Node.left);
                Node = Node.left;
            }
            list.add(Node.val);

        }
        return list;

    }
}
