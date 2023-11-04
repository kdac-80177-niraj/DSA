import java.util.Stack;

public class StackMain<T> {
    private Stack<T> enqueueStack;
    private Stack<T> dequeueStack;

    public StackMain() {
        enqueueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }

    public void enqueue(T item) {
        enqueueStack.push(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }

        return dequeueStack.pop();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }

        return dequeueStack.peek();
    }

    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }

    public int size() {
        return enqueueStack.size() + dequeueStack.size();
    }

    public static void main(String[] args) {
        StackMain<Integer> queue = new StackMain<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeue: " + queue.dequeue()); // Dequeue: 1
        System.out.println("Dequeue: " + queue.dequeue()); // Dequeue: 2

        queue.enqueue(4);

        System.out.println("Peek: " + queue.peek()); // Peek: 3
        System.out.println("Queue size: " + queue.size()); // Queue size: 2
    }
}
