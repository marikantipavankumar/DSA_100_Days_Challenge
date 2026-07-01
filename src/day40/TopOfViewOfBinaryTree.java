package day40;


import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class TopOfViewOfBinaryTree {

    static ArrayList<Integer> topView(Node root) {

        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Node> q = new LinkedList<>();
        Queue<Integer> hd = new LinkedList<>();

        q.add(root);
        hd.add(0);

        while (!q.isEmpty()) {

            Node curr = q.poll();
            int d = hd.poll();

            if (!map.containsKey(d)) {
                map.put(d, curr.data);
            }

            if (curr.left != null) {
                q.add(curr.left);
                hd.add(d - 1);
            }

            if (curr.right != null) {
                q.add(curr.right);
                hd.add(d + 1);
            }
        }

        for (int val : map.values()) {
            res.add(val);
        }

        return res;
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);
        root.right.right = new Node(100);

        ArrayList<Integer> result = topView(root);

        System.out.println(result);
    }
}