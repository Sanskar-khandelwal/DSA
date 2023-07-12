package Trees.Traversals;

import Trees.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Stack;

public class IInOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        ArrayList list = new ArrayList();
        list =    inOrder(root, list);
        System.out.println(list);
    }

    private static ArrayList inOrder(TreeNode root, ArrayList list) {
        TreeNode node;
        Stack<TreeNode> stack = new Stack<>();
        node = root;
        while( node!=null ||   !stack.isEmpty()){
            while(node!= null){
                stack.push(node);
                node = node.left;
            }
            node  = stack.pop();
            list.add(node.val);
            node = node.right;
        }
        return list;
    }
}
