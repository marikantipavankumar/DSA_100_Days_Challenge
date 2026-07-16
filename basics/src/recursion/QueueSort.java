package recursion;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSort {
    static void main() {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(7);
        q.add(16);
        q.add(9);
        q.add(20);
        q.add(5);

        System.out.println("Queue After sorting is:" );
        queueSort(q);
        while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }
    }

    static void queueSort(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int temp = q.poll();
        queueSort(q);
        sortedInsert(q,temp,q.size());
    }
    static void sortedInsert(Queue<Integer>q,int temp,int size){
        //base condition
        if(q.isEmpty() || size==0){
            q.add(temp);
            return;
        }

        else if(temp<=q.peek()){
            q.add(temp);
            frontToEnd(q,size);
        }
        else{
            q.add(q.poll());
            sortedInsert(q,temp,size-1);
        }
    }

    static void frontToEnd(Queue<Integer> q,int size){
        if(size==0){
            return;
        }
        q.add(q.poll());
        frontToEnd(q,size-1);
    }
}
