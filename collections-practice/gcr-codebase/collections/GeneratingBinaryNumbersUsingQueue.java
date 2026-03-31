import java.util.*;
public class GeneratingBinaryNumbersUsingQueue {
    public static void main(String[] args) {
        int N = 5;
        System.out.println("First " + N + " binary numbers:");
        generateBinaryNumbers(N);
    }
    public static void generateBinaryNumbers(int N) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        for (int i = 0; i < N; i++) {
            String current = queue.remove();
            System.out.print(current + " ");
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }
}
