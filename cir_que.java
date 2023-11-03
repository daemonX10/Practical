public class cir_que{
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
            // The code `if (front == -1) front = 0;` is checking if the front pointer of the circular
            // queue is at its initial value of -1. If it is, it means that the queue is empty and we
            // need to set the front pointer to 0 to indicate that the queue now has an element. This
            // is necessary because in a circular queue, the front and rear pointers wrap around to the
            // beginning of the array when they reach the end.
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
