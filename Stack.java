public class Stack {
    int top = -1;
    int size = 100;
    int[] arr = new int[size];

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = x;
            System.out.println("Pushed: " + x);
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int val = arr[top--];
            System.out.println("Popped: " + val);
            return val;
        }
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Q1 - Stack Implementation
        System.out.println("--- Q1: Stack Implementation ---");
        Stack s = new Stack();
        s.push(5);
        s.push(15);
        s.display();
        System.out.println("Top element: " + s.peek());
        s.pop();
        s.display();

        // Q2 - Given Operations
        System.out.println("\n--- Q2: Given Operations ---");
        Stack s2 = new Stack();
        s2.push(10);
        s2.display();
        s2.push(20);
        s2.display();
        s2.push(30);
        s2.display();
        s2.pop();
        s2.display();
        s2.push(40);
        s2.display();
        s2.pop();
        s2.display();

        System.out.println("Final contents of Stack: 10 20");
        System.out.println("Top element: " + s2.peek());
    }
}
