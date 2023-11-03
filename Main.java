public class Main{
    public static class CircularQueue {
    int size;
    int front;
    int rear;
    int[] queue;

    public CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % size;
            queue[rear] = data;
        }
    }

    public int dequeue() {
        int data = -1;
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
            data = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
        }
        return data;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(queue[i] + " ");
                i = (i + 1) % size;
            }
            System.out.println(queue[i]);
        }
    }
}
public static void main(String[] args) {
    CircularQueue queue = new CircularQueue(5);

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);

    queue.display();

    queue.dequeue();
    queue.dequeue();

    queue.display();
}
}