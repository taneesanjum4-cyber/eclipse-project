public class Queue {
    int front = -1, rear = -1;
    int size = 100;
    int[] arr = new int[size];

    void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) front = 0;
            arr[++rear] = x;
            System.out.println("Enqueued: " + x);
        }
    }

    int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            int val = arr[front++];
            System.out.println("Dequeued: " + val);
            return val;
        }
    }

    int frontElement() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Q3 - Queue Implementation
        System.out.println("--- Q3: Queue Implementation ---");
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(15);
        q.display();
        System.out.println("Front element: " + q.frontElement());
        q.dequeue();
        q.display();

        // Q4 - Given Operations
        System.out.println("\n--- Q4: Given Operations ---");
        Queue q2 = new Queue();
        q2.enqueue(10);
        q2.display();
        q2.enqueue(20);
        q2.display();
        q2.enqueue(30);
        q2.display();
        q2.dequeue();
        q2.display();
        q2.enqueue(40);
        q2.display();
        q2.dequeue();
        q2.display();

        System.out.println("Final contents of Queue: 30 40");
        System.out.println("Front element: " + q2.frontElement());
    }
}
