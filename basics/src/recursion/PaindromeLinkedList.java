package recursion;
import java.util.Stack;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next=null;
    }
}

public class PaindromeLinkedList {
    static void main() {
        Node head = new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(  1);

        // check whether the given linked list is a palindrome or not
        boolean result = checkPalindrome(head);
        if(result){
            System.out.print("The Given Linked List is a Palindrome");
        }
        else{
            System.out.print("The Given Linked List is not a Palindrome");

        }
    }

    public static boolean checkPalindrome(Node head){
        Stack<Integer>st = new Stack<>();
        Node start  = head;
        while(start!=null){
            st.push(start.data);
            start=start.next;
        }
        while(head!=null){
            if(head.data!=st.pop()){
                return false;
            }
            head=head.next;
        }
        return true;
    }
}
