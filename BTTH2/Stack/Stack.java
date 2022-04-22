package Stack;


public interface Stack {
    void push(int value);
    int pop();
    int peek();
    boolean isEmpty();
}
class ArrayStack implements Stack {
    private int[] stack;
    private int top;
    public ArrayStack(int size) {
        stack = new int[size];
        top = -1;
    }
    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full");
        }
        stack[++top] = value;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return stack[top--];
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return stack[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
}
class LinkedStack implements Stack {
    public class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    Node top;
    LinkedStack() {
        top = null;
    }
    public void push(int value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        int value = top.value;
        top = top.next;
        return value;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return top.value;
    }
    public boolean isEmpty() {
        return top == null;
    }
}
class DemoAndReverse{
    public static void main(String[] args) {
        ArrayReverse();
        System.out.println("\n*-------------------------------------------------------*");
        LinkedListReverse();
    }
    public static void ArrayReverse(){
        Stack a = new ArrayStack(3);
        a.push(1);
        a.push(2);
        a.push(3);
        System.out.println("Peek in Stack using Array: " + a.peek());
        System.out.println("Reversing Stack using Array");
        while (!a.isEmpty()) {
            System.out.print(a.pop() + " ");
        }
    }
    public static void LinkedListReverse(){
        Stack l = new LinkedStack();
        l.push(7);
        l.push(8);
        l.push(9);
        System.out.println("Peek in Stack using Linked List: " + l.peek());
        System.out.println("Reversing Stack using Linked List");
        while (!l.isEmpty()) {
            System.out.print(l.pop() + " ");
        }
    }
}