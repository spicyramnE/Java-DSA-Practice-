package trees;

public class dfs {
   
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }
    public static void preorder(TreeNode node){
        if(node==null){
            return;
        }
        System.out.print(node.val+" ");
        preorder(node.left);
        preorder(node.right);
    }
    
}
