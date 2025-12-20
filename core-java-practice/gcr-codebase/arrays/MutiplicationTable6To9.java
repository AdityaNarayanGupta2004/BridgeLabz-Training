import java.util.*;
public class MutiplicationTable6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int multiplicationresult[] = new int[4];
        int c = 0;
        for(int i = 6; i <= 9; i++){
            multiplicationresult[c++] = i*num;
            System.out.println(num +" * "+ i +" = "+ i*num);
        }

    }
}
