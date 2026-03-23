package trees_Practice;

import java.util.function.BinaryOperator;

public class BinaryTreeEx1 {

    // Inner class
     static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    public static void main(String[] args) {
        BinaryTreeEx1 tree = new BinaryTreeEx1();

        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);

        tree.root.right.left.right = new Node(10);

      //  System.out.println("Inorder Traversal of a tree is:"tree.inOrder(tree.root));
        tree.inOrder(tree.root);
    }

    // Inorder Traversal

    static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+"-> ");
        inOrder(root.right);
    }
}