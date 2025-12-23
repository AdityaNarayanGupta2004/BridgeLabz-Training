import java.util.*;
public class FootballTeam {
    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.println("Player Heights in cm:" + Arrays.toString(heights));
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        System.out.println("Mean Height is : " + mean + " cm");
        System.out.println("Shortest Height is : " + shortest + " cm");
        System.out.println("Tallest Height: is " + tallest + " cm");
    }
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        return heights;
    }
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    public static double findMean(int[] heights) {
        return findSum(heights) / (double)heights.length;
    }
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
}
