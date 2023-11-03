import java.util.*;

import javax.management.Query;
public class queue_array {
    public static class Queue {
        private int maxSize;
        private int front;
        private int rear;
        private int nItems;
        private int[] queueArray;

        public Queue(int size){
            maxSize = size;
            front =0;
            rear = -1;
            nItems =0;
            queueArray = new int[maxSize];
        }

        public void insert(int value){
            // The code `if(rear == maxSize -1)` checks if the rear pointer of the queue has reached
            // the end of the array. If it has, it means that the queue is full and there is no more
            // space to insert new elements. In this case, the code sets the rear pointer to -1,
            // effectively wrapping it around to the beginning of the array. This allows the queue to
            // continue inserting elements from the start of the array, creating a circular queue
            // behavior.
            if(rear == maxSize -1){
                rear = -1;
            }
            // The code `queueArray[++rear] = value;` is inserting the `value` into the queue at the
            // position indicated by the `rear` pointer. The `++rear` increments the `rear` pointer
            // before accessing the array, so it points to the next available position in the array.
            queueArray[++rear] = value;
            nItems++;
        }

        public int remove(){
            // The code `int temp = queueArray[front++];` is removing an element from the front of the
            // queue and storing it in the variable `temp`. The `front++` increments the `front`
            // pointer before accessing the array, so it points to the next element in the queue.
            int temp = queueArray[front++];
            if(front == maxSize){
                front =0;
            }
            nItems--;
            return temp;
        }
        
        public boolean isEmpty(){
            return (nItems == 0);
        }

        public boolean isFull(){
            return (nItems == maxSize);
        }
    }


    public static void main(String[] args) {
        Queue myQueue = new Queue(4);
        myQueue.insert(10);
        myQueue.insert(20);
        myQueue.insert(30);

        while(!myQueue.isEmpty()) {
            int value = myQueue.remove();
            System.out.println("Removed: " + value);
        }
    
    }
}
