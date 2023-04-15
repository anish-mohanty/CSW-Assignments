package test ;
import java.util.HashMap;

public class q2b {
    public static void main(String[] args) {
     
        HashMap<String, String> map = new HashMap<>();
      
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");
        
        
        String key = "FIVE";
        String value = "EEE";
        if (map.containsKey(key) && map.get(key).equals(value)) {
            map.remove(key);
            System.out.println("Mapping removed: " + key + " -> " + value);
        } else {
            System.out.println("Mapping not removed: " + key + " -> " + value);
        }
        
        System.out.println("Updated HashMap: " + map);
    }
}
