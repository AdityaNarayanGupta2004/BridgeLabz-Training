import java.util.Scanner;
public class HandShake {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numOfPeople = sc.nextInt();
        int handshake = (numOfPeople * (numOfPeople - 1)) / 2;
        System.out.println("Total number of handshakes is " + handshake);
    }
}
