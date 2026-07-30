//package trees.bst;
//
//import com.sun.source.tree.Tree;
//
//class TreeNode{
//    int val;
//    TreeNode right;
//    TreeNode left;
//
//    public TreeNode(int val){
//        this.val = val;
//    }
//}
//
//public class BST_Constructin {
//    static void main() {
//        int[] arr = {1,2,3,4,5,6,7};
//
//        TreeNode root = null;
//        for(int val:arr){
//            root = insert(root,val);
//        }
//
//        preOrder(root);
//
//    }
//
//    static TreeNode insert(TreeNode root,int val){
//        if(root==null){
//            return new TreeNode(val);
//        }
//
//        if(val<root.val){
//            root.left= insert(root.left,val);
//        }
//
//        else  if(val>root.val){
//            root.right = insert(root.right,val);
//        }
//
//        return  root;
//    }
//
//    // InOrder Traversal Of a Binary Search Tree
//    static  void preOrder(TreeNode root){
//        if(root==null){
//            return;
//        }
//
//        System.out.print(root.val+" ");
//
//        inOrder(root.left);
//        inOrder(root.right);
//    }
//}
