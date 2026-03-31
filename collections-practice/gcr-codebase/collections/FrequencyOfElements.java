import java.util.*;
public class FrequencyOfElements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> freqMap = new HashMap<>();

        System.out.print("Enter no of elements : ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
        }
        System.out.println(freqMap);
        for (String st : freqMap.keySet()) {
            System.out.println(st + " -> " + freqMap.get(st));
        }
    }
}
