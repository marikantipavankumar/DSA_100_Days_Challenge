package top50;

class StackEx{
    private int[] arr;
    private  int top;
    private  int capacity;

    StackEx(int size){
        arr = new int[size];
        top = -1;
        capacity = size;
    }

   public void push(int data){
      if(top==arr.length){
          System.out.println("Stack Overflow: stack is full,Can't Insert");
          return;
      }
      arr[++top]=data;
   }

    public int pop() {
        if(top==-1){
            System.out.println("Stack Underflow: stack is Empty,Can't pop from the empty stack");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if(top==-1){
            System.out.println("Stack Underflow: stack is Empty,Can't peek from the empty stack");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        if(top==-1){
            return true;
        }
        return false;
    }

    public void display(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

}

public class Stack_Implementation {
    static void main() {
        StackEx st = new StackEx(10);
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Stack before popping:");
        st.display();

        System.out.println("Popped element from the stack is:"+st.pop());
        System.out.println("Popped element from the stack is:"+st.pop());
        st.peek();
        boolean ans = st.isEmpty();
        st.display();
    }
}
