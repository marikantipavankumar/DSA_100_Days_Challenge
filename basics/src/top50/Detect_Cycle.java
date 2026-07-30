package top50;

//class  Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data=data;
//        this.next = null;
//    }
//}
public class Detect_Cycle {
    static void main() {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        first.next= second;
        second.next= third;
        third.next= fourth;
        fourth.next= second;  // cycle found here
        boolean ans = detectCycle(first);
        System.out.println(ans);
    }

    static  boolean detectCycle(Node first){
        Node fast = first;
        Node slow = first;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
