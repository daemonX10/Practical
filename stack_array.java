import java.util.*;
public class stack_array {
    
    public static class Stack{
        private int maxSize;
        private int top;
        private int[] stackArray;

        public Stack (int size){
            maxSize = size;
            stackArray = new int[maxSize];
            top = -1;
        }

        public void push(int val){
            if(!isFull()){
                top ++;
                stackArray[top] = val;
            }else{
                System.out.println("stack is full ");
            }
        }

        public int pop(){
            if(!isEmpty()){
                return stackArray[top--];
            }else{
                System.out.println(" empty stack");
                return -1;
            }
        }

        public boolean isEmpty(){
            return (top == -1);
        }

        public boolean isFull(){
            return (top + 1 == maxSize);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(1);
        System.out.println(stack.pop());
    }
}
