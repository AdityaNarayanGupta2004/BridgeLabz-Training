import java.util.*;
public class HarryAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int curryear = sc.nextInt();
        if(curryear > 2000){
            System.out.print("The harry age is:");
            int age = curryear-2000;
            System.out.println(age);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
