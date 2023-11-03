public class cir_que {
    public static class CircularQueue {
        int size;
        int front ;
        int rear;
        int[] queue;
        
        public CircularQueue(int size){
            this.size = size;
            queue = new int [size];
            front = -1;
            rear = -1;
        }
        public void enqueue(int data){
            if((rear+1)% size == )
        }
        public int dequeue(){
            return 0;
        }
        public void display(){

        }
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(1);
        queue.display();
        queue.dequeue();
    }
}
