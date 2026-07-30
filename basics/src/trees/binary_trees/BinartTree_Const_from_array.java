package trees.binary_trees;

import com.sun.source.tree.Tree;

class TreeNode{
    int val;
    TreeNode right;
    TreeNode left;

    public TreeNode(int val){
        this.val = val;
    }
}
public class BinartTree_Const_from_array {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7};
        TreeNode root  = buildTree(arr,0);
        preOrder(root);
    }

    static TreeNode buildTree(int[] arr,int index){
        if(index>=arr.length){
            return null;
        }

        TreeNode root = new TreeNode(arr[index]);
        root.left = buildTree(arr,2*index+1);
        root.right = buildTree(arr,2*index+2);
        return  root;

    }

    public static void preOrder(TreeNode root){
        if(root == null){
            return ;
        }
        System.out.println(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }




}
