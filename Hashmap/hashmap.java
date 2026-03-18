import java.util.*;

public class SimpleHashMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // INSERTION
        map.put(101, 1000);
        map.put(102, 2000);
        map.put(103, 3000);
        map.put(104, 4000);
        map.put(105, 5000);
        System.out.println("After insertion: " + map);
        
        map.put(103, 3500);
        System.out.println("After update: " + map);
        
        // SEARCHING
        System.out.println("\n=== SEARCHING ===");
        System.out.println("Get key 104: " + map.get(104));
        System.out.println("Contains key 102? " + map.containsKey(102));
        System.out.println("Contains value 5000? " + map.containsValue(5000));
        
        // DELETION
        map.remove(102);
        System.out.println("After removing key 102: " + map);
        
        map.remove(104, 4000);
        System.out.println("After removing key 104 with value 4000: " + map);
        
        // ADDITIONAL OPERATIONS
        System.out.println("Size: " + map.size());
        System.out.println("Is empty? " + map.isEmpty());
        System.out.println("All keys: " + map.keySet());
        System.out.println("All values: " + map.values());
        
        // ITERATION using keySet()
        System.out.println("\nIterating using keySet():");
        for (var key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
        
        map.clear();
        System.out.println("After clear: " + map);
    }
}