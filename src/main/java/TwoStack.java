import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TwoStack {
}

class MyQueue<T> {
    Queue<T> fifo;
    Stack<T> lifo;

    public MyQueue(){
        fifo = new LinkedList<>();
        lifo = new Stack<>();
    }

    public void enqueue(T obj ) {
        fifo.add(obj);
        lifo.add(obj);
    }

    public void dequeue() {
       fifo.poll();
       lifo.pop();
    }

    public T peek() {
        return fifo.peek();
    }
}