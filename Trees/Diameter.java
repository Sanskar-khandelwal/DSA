package Trees;

class Diameter {

    public static int findMax(TreeNode root,int maxi){
        if(root == null){
            return -1;
        }
        int lh = findMax(root.left, maxi);
        int rh = findMax(root.right, maxi);
        maxi = Math.max(maxi, lh + rh +2);
        return 1+ Math.max(lh, rh);
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        int maxi = 0;
      findMax(root, maxi);
        return maxi;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(30);
        root.left = new TreeNode(20);
        root.right = new TreeNode(40);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(25);
        root.right.left = new TreeNode(35);
        root.right.right = new TreeNode(50);
        int list =  diameterOfBinaryTree(root);
        System.out.println(list);

    }
}