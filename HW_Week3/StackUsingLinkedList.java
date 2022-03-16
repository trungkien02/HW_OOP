package OOP.hw3.java;


import java.util.Scanner;

public class StackUsingLinkedList {
    public class Node {
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
        }
    }
    Node top;
    StackUsingLinkedList() {
        top = null;
    }

    public void push(char data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public char pop() {
        if (top == null) {
            return '\0';
        }
        char data = top.data;
        top = top.next;
        return data;
    }

    public char peek() {
        if (top == null) {
            return '\0';
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
class StackUsingLinkedListTest {
    static int Precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
    static String infix2postfix(String infix) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        String postfix = "";
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix += ch;
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix += stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && Precedence(stack.peek()) >= Precedence(ch)) {
                    postfix += stack.pop();
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }
        return postfix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String infix = sc.nextLine();
        System.out.println("Postfix expression: " + infix2postfix(infix));
    }
}
