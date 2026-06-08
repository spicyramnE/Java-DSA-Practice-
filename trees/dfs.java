package trees;
/* sorry for too many comments, my way of self learning talking myself throughout the code helps me remember it */
public class dfs {
   
    class TreeNode {
        int val;        //consider this to be the ROOT value initally 
        TreeNode left;      // root's left subtree
        TreeNode right;     // root's right subtree

        TreeNode(int x) {   
            this.val = x;   //im sending in the value here which is taken by the current tree node 
        }
    }
    //root->left->right for preorder root is first ok
    void preorder(TreeNode node){
        if(node==null){
            return;
        }
        System.out.print(node.val+" "); // print value 
        preorder(node.left);    //check left subtree
        preorder(node.right);   //check right subtree
    }
    //left->root->right for inorder root is in the middle 
    void inorder(TreeNode node){
        if (node==null) return;
        inorder(node.left);
        System.out.print(node.val+" "); //print value at the middle
        inorder(node.right);
    } 
    //left->right->root for postorder because then root is at the end
    void postorder(TreeNode node){
        if(node==null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val+" "); //print value at the end
    }
    public static void main(String []args){
        dfs DFS=new dfs();

        //bulding the tree to push and then run the values for each type of dfs is necessary
        TreeNode root=DFS.new TreeNode(10); //root value is 1
        root.left=DFS.new TreeNode(6); //left child of root is 2        
        root.right=DFS.new TreeNode(15);
        root.left.left=DFS.new TreeNode(3); //left child of 2 is 3
        root.left.right=DFS.new TreeNode(8);
        root.right.left=DFS.new TreeNode(12);
        root.right.right=DFS.new TreeNode(20);
        
        //runnnign
        System.out.println("Preorder Traversal:");
        DFS.preorder(root); //preorder traversal
        System.out.println("\nInorder Traversal:");
        DFS.inorder(root); //inorder traversal
        System.out.println("\nPostorder Traversal:");
        DFS.postorder(root); //postorder traversal
        System.out.println();

   
    }  


}