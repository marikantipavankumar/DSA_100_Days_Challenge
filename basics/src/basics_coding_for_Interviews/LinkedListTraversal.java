package basics_coding_for_Interviews;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next=null;
    }
}

public class LinkedListTraversal {
    public static  void main(String[] args){
        Node root  = new Node(10);
        root.next=new Node(20);
        root.next.next=new Node(30);
        root.next.next.next = new Node(40);

        listTraversal(root);

        boolean ans = cycleDetection(root);
        System.out.println("Cycle Detected:"+ans);
    }

    private static void listTraversal(Node root) {
        Node start = root;
        while(start!=null){
            System.out.print(start.data+"->");
            start=start.next;
        }
        System.out.println("null");
    }

    public static  boolean cycleDetection(Node root){
        Node slow  = root;
        Node fast = root;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
