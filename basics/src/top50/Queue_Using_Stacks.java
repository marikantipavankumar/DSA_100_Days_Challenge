package top50;

import java.util.Stack;

class QueueStack{
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    //enque
    void enque(int data){
        st1.push(data);
    }

    //deque
    int deque(){
        if(st1.isEmpty() && st2.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        if(st2.isEmpty()){
            while (!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        return st2.pop();
    }

    int peek(){
        if(st1.isEmpty() && st2.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        if(st2.isEmpty()){
            while (!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        return st2.peek();
    }

    boolean isEmpty(){
        return st1.isEmpty() && st2.isEmpty();
    }
}
public class Queue_Using_Stacks {
    static void main() {
        QueueStack qs = new QueueStack();
        qs.enque(10);
        qs.enque(20);
        qs.enque(30);
        qs.enque(40);
        qs.enque(50);
        System.out.println("popping the top element from the Queue:"+qs.deque());
        System.out.println("popping the top element from the Queue:"+qs.deque());
        System.out.println(" the top element from the Queue:"+qs.peek());
        System.out.println("Does queue is Empty:"+qs.isEmpty());
        System.out.println(" the top element from the Queue:"+qs.peek());


    }
}
