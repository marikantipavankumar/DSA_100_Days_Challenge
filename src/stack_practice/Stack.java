package stack_practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Stack {
    int[] arr;
    int capacity;
    int top=-1;

    Stack(int size){
        arr = new int[size];
        capacity = size;
    }

    // Push Operation
    void push(int x){
        if(top==capacity-1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top]=x;
    }

    // Pop Operation
    int pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek Operation
    int peek(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        System.out.println("Stack Elements are:"+ Arrays.toString(arr));
        return arr[top];
    }

    void display(){
        if(top ==-1){
            System.out.println("Stack is Empty:");
            return;
        }

        System.out.println("Stack Elements are:");
        for (int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // Is Empty
    boolean isEmpty(){
        return top==-1;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size of a stack:");
        int size = sc.nextInt();
        Stack s = new Stack(size);

        while (true){
            System.out.println("\n--- stack Menu---");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.peek");
            System.out.println("4.display");
            System.out.println("5.Exit");

            System.out.println("Enter Choice:");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Value");
                    int val = sc.nextInt();
                    s.push(val);
                    break;

                case 2:
                    int popped = s.pop();
                    if(popped!=-1){
                        System.out.println("Popped value is:"+popped);
                    }
                    break;

                case 3:
                    int top = s.peek();
                    if(top!=-1){
                        System.out.println("top value is:"+top);
                    }
                    break;

                case 4:
                    s.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }

    }
}
