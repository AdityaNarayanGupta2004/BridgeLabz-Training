import java.util.*;
public class ImplementingQueueUsingStacks {
    public static void main(String[] args) {
        ImplementingQueueUsingStacks queue = new ImplementingQueueUsingStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.peek());    // 20
        System.out.println(queue.dequeue()); // 20
        System.out.println(queue.dequeue()); // 30
        System.out.println(queue.isEmpty()); // true
    }

    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public ImplementingQueueUsingStacks() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int x) {
        inStack.push(x);
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        if (outStack.isEmpty()) {
            // Transfer all elements from inStack to outStack
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }
    // Check if queue is empty
    public boolean isEmpty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}
