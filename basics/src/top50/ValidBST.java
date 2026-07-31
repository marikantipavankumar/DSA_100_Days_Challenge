package top50;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int val) {
        this.data = val;
    }
}

public class ValidBST{

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(20);

        System.out.println(isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE));
    }

    static  boolean isValidBST(TreeNode node,long min,long max){
        if(node == null){
            return true;
        }

        if(node.data<=min || node.data>=max){
            return false;
        }

        return isValidBST(node.left,min,node.data) && isValidBST(node.right,node.data,max);
    }
}

