package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class template1 {
    // Simple binary tree node
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { this.val = v; }
    }

    // Returning single value: sum of all nodes
    static int sum(TreeNode node) {
        if (node == null) return 0;
        return node.val + sum(node.left) + sum(node.right);
    }

    // Return preorder traversal as a list
    static List<Integer> preorder(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        if (node == null) return result;
        result.add(node.val);
        result.addAll(preorder(node.left));
        result.addAll(preorder(node.right));
        return result;
    }

    // Build a tree from level-order array where null means missing
    static TreeNode buildFromLevelOrder(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) return null;
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < arr.length) {
            TreeNode cur = q.poll();
            if (cur == null) break;
            if (i < arr.length) {
                Integer v = arr[i++];
                if (v != null) {
                    cur.left = new TreeNode(v);
                    q.add(cur.left);
                }
            }
            if (i < arr.length) {
                Integer v = arr[i++];
                if (v != null) {
                    cur.right = new TreeNode(v);
                    q.add(cur.right);
                }
            }
        }
        return root;
    }

    // Example runner. Pass args as level-order values, use "n" or "null" for missing.
    public static void main(String[] args) {
        Integer[] arr;
        if (args.length > 0) {
            arr = new Integer[args.length];
            for (int i = 0; i < args.length; i++) {
                String s = args[i];
                if (s.equalsIgnoreCase("n") || s.equalsIgnoreCase("null")) arr[i] = null;
                else {
                    try { arr[i] = Integer.parseInt(s); } catch (NumberFormatException e) { arr[i] = null; }
                }
            }
        } else {
            // sample values if no args provided
            arr = new Integer[] {1, 2, 3, 4, 5, null, 7};
        }

        TreeNode root = buildFromLevelOrder(arr);
        System.out.println("Sum: " + sum(root));
        System.out.println("Preorder: " + preorder(root));
    }
}