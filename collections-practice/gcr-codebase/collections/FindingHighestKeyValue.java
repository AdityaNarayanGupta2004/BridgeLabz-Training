import java.util.*;
public class FindingHighestKeyValue {
    // main function
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String keyWithMaxValue = findMaxValueKey(map);
        System.out.println("Key with maximum value is: " + keyWithMaxValue);
    }
    
    // Function to find key with maximum value
    public static String findMaxValueKey(Map<String, Integer> map){
        if(map.isEmpty()) return null;
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}
