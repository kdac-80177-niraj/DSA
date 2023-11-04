import java.util.LinkedList;
import java.util.Queue;

public class StackMain{
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackMain() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int value) {
        queue1.add(value);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        int poppedValue = queue1.poll();

        // Swap queue1 and queue2 to maintain the correct order
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return poppedValue;
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        int topValue = queue1.peek();

        // Swap queue1 and queue2 to maintain the correct order
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topValue;
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public int size() {
        return queue1.size();
    }

    public static void main(String[] args) {
        StackMain stack = new StackMain();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());

        stack.push(4);
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
    }
}
