package trees;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class bfs {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val=x;
        }
    }

    List<Integer> levelOrder(TreeNode root){
        List<Integer> result =new ArrayList<>();
        if(root==null)return result;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root); //start with root

        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            result.add(node.val);
            System.out.print(node.val+ " ");

            //Add children to back of queue
            if(node.left != null) queue.offer(node.left);
            if(node.right != null) queue.offer(node.right);
        }
        return result;
    }

    public static void main(String []args){
        bfs tree=new bfs();
        TreeNode root=tree.new TreeNode(1);
        root.left=tree.new TreeNode(2);
        root.right=tree.new TreeNode(3);
        root.left.left=tree.new TreeNode(4);
        root.left.right=tree.new TreeNode(5);   
        root.right.left=tree.new TreeNode(6);
        root.right.right=tree.new TreeNode(7);
        List<Integer> values = tree.levelOrder(root);
        System.out.println();
        System.out.println(values);
    }
}
