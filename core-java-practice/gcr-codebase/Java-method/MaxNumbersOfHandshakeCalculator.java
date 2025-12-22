import java.util.*;
public class MaxNumbersOfHandshakeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = calculateHandshake(numberOfStudents);
        System.out.println("The maximum number of possibles handshakes possible: " + handshakes);

        sc.close();
    }
    public static int calculateHandshake(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }
}
