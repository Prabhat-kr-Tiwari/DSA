package Teest;


import java.util.*;

public  class Stack {
    static class stack {
        static int top = -1;
        static int n = 5;
        static int[] a = new int[n];

        public static void push() {
            Scanner sc = new Scanner(System.in);
            if (top == n - 1) {
                System.out.println("stack is full");
            } else {
                System.out.println("Enter the data:");
                int x = sc.nextInt();
                top++;
                a[top] = x;
            }
        }

        public static void display() {
            System.out.println("Stack is :");
            for (int i = top; i >= 0; i--) {
                System.out.println(a[i]);
            }
        }

        public static void main(String args[]) {
            stack stack = new stack();
            stack.push();
            stack.push();
            stack.push();
            stack.push();
            stack.push();
            stack.display();
        }

    }
}
