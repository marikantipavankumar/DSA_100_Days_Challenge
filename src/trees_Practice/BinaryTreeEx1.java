package trees_Practice;

import java.util.ArrayList;
import java.util.List;
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

     static void main(String[] args) {
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
        System.out.println("null");

        tree.preOrder(tree.root);
        System.out.println("null");

        tree.postOrder(tree.root);
        System.out.println("null");

        tree.rightView(tree.root);
        tree.leftView(tree.root);
    }

    // Inorder Traversal
     void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+"-> ");
        inOrder(root.right);
    }

    // preOrder Traversal
      void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"->");
        preOrder(root.left);
        preOrder(root.right);
    }

    // post order traversal
    void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+"-> ");
    }

    // right view of a Binary Tree
    public  void rightView(Node root){
        List<Integer> result = new ArrayList<>();
        rightSideView(root,result,0);
        System.out.println(result);
    }
    public  void  rightSideView(Node curr,List<Integer> result,int currDepth){
        if(curr == null){
            return;
        }
        if(currDepth == result.size()){

            result.add(curr.data);
        }
        rightSideView(curr.right,result,currDepth+1);
        rightSideView(curr.left,result,currDepth+1);
    }

    // left view of a Binary Tree
    public  void leftView(Node root){
        List<Integer> result = new ArrayList<>();
        leftSideView(root,result,0);
        System.out.println(result);
    }
    public  void  leftSideView(Node curr,List<Integer> result,int currDepth){
        if(curr == null){
            return;
        }
        if(currDepth == result.size()){

            result.add(curr.data);
        }
        leftSideView(curr.left,result,currDepth+1);
        leftSideView(curr.right,result,currDepth+1);
    }
}