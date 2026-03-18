import java.util.*;

public class SimpleHashtable {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        
        // INSERTION
        table.put(101, 1000);
        table.put(102, 2000);
        table.put(103, 3000);
        table.put(104, 4000);
        table.put(105, 5000);
        System.out.println("After insertion: " + table);
        
        table.put(103, 3500);
        System.out.println("After update: " + table);
        
        // SEARCHING
        System.out.println("\n=== SEARCHING ===");
        System.out.println("Get key 104: " + table.get(104));
        System.out.println("Contains key 102? " + table.containsKey(102));
        System.out.println("Contains value 5000? " + table.containsValue(5000));
        
        // DELETION
        table.remove(102);
        System.out.println("After removing key 102: " + table);
        
        table.remove(104, 4000);
        System.out.println("After removing key 104 with value 4000: " + table);
        
        // ADDITIONAL OPERATIONS
        System.out.println("Size: " + table.size());
        System.out.println("Is empty? " + table.isEmpty());
        System.out.println("All keys: " + table.keySet());
        System.out.println("All values: " + table.values());
        
        // ITERATION using keySet()
        System.out.println("\nIterating using keySet():");
        for (var key : table.keySet()) {
            System.out.println(key + " -> " + table.get(key));
        }
        
        table.clear();
        System.out.println("After clear: " + table);
    }
}