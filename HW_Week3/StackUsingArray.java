package OOP.hw3.java;

import java.util.*;
import java.io.*;

public class StackUsingArray {
    private char[] stack;
    private int top;
    private int size;

    StackUsingArray(int size) {
        this.size = size;
        stack = new char[size];
        top = -1;
    }

    public void push(char item) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = item;
        }
    }

    public char pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return '\0';
        } else {
            return stack[top--];
        }
    }

    public char peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return '\0';
        } else {
            return stack[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
class StackUsingArrayTest {
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
        StackUsingArray stack = new StackUsingArray(infix.length());
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String infix = scanner.nextLine();
        System.out.println("Postfix expression: " + infix2postfix(infix));
    }
}