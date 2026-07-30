package top50;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next=null;
    }
}

public class LinkedListReverse {
    static void main() {

        Node root  = new Node(10);
        root.next = new Node(20);
        root.next.next = new Node(30);
        root.next.next.next = new Node(40);

        Node temp = revereseLL(root);
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    static  Node revereseLL(Node root){
        Node prev = null;
        Node curr = root;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
