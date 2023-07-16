package Trees;

import java.util.TreeMap;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BtFromInorderPostOrder {
    public static TreeNode  createTree(int[] inorder,int inStart,int inEnd, int[] postorder, int postStart,int postEnd, Map<Integer,Integer> map){
        if(postStart > postEnd || inStart > inEnd ){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postEnd]);
        int index = map.get(root.val);
        int elementsLeft = index - inStart; 

        root.left = createTree(inorder, inStart, index - 1, postorder, postStart, postStart + elementsLeft - 1, map);
        root.right = createTree(inorder, index + 1, inEnd, postorder, postStart + elementsLeft , postEnd - 1 ,map);
        return root;
    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeMap<Integer, Integer> map = new TreeMap();
        for(int i = 0;i < inorder.length; i++ ){
            map.put(inorder[i], i);
        }
     TreeNode root =    createTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length -1, map );
     return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        int [] inorder = {4, 2, 5, 1, 6, 3, 7};
        int[] postorder  = {4, 5, 2, 6, 7, 3, 1};
        buildTree(inorder,postorder );
    }
}