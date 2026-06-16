package trees;

public class Materials {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3));
        int result = new Solution().maxPathSum(root);
        System.out.println("Max path sum: " + result);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        maxPathHelper(root);
        return maxSum;
    }
    private int maxPathHelper(TreeNode node){
        if(node==null) return 0;
        int leftMax = Math.max(0, maxPathHelper(node.left));
        int rightMax = Math.max(0, maxPathHelper(node.right));
        int currentSum = node.val + leftMax + rightMax;
        maxSum = Math.max(maxSum, currentSum);
        return node.val + Math.max(leftMax, rightMax);
    }
}