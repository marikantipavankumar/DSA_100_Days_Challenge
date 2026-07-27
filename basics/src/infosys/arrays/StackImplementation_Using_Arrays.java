package infosys.arrays;

public class StackImplementation_Using_Arrays {

    private  int[] data;
    private  int capacity;
    private  int top;

    public StackImplementation_Using_Arrays(int capacity){
        this.capacity=capacity;
        data = new int[capacity];
        this.top=-1;
    }

    private boolean iSEmpty() {
        if(top==-1){
            return true;
        }
        return false;
    }

    private int top() {
        if(isEmpty()){
            throw new IllegalStateException("Cannot peel:Stack is Empty");
        }
        return data[top];
    }

    // pop an element from the stack
    private int pop() {
        if(isEmpty()){
            throw new IllegalStateException("Cannot pop:Stack is Empty");
        }
        return data[top--];
    }

    // pushing an element into the stack
    public void push(int i) {
        if(isFull()){
            throw new StackOverflowError("Cannot Push:Stack is Full");
        }
        data[++top]=i;
    }

    public boolean isFull(){
        if(top==capacity){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    public int size(){
        return top+1;
    }

    static void main() {
        StackImplementation_Using_Arrays stack = new StackImplementation_Using_Arrays(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Popped element from the stack is:"+stack.pop());
        System.out.println("Size of the stack is:"+stack.size());
        System.out.println("Does stack is Empty:"+stack.iSEmpty());
        System.out.println("Stack TOp is:"+stack.top());

    }
}
