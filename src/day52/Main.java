package day52;

import java.util.*;

// This class defines what a "Node" in our tree looks like
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: both are empty, so they are the same
        if (p == null && q == null) return true;

        // One is empty and the other isn't, or values don't match
        if (p == null || q == null || p.val != q.val) return false;

        // Recursively check left and right children
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Tree A: [1, 2, 3]
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        // Tree B: [1, 2, 3]
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        boolean result = sol.isSameTree(p, q);
        System.out.println("Are the trees identical? " + result);
    }
}