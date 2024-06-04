import java.util.*;

public class MapentrySet {
    public static void main(String[] args) {
        // Create a HashMap and populate it with some key-value pairs
        var map = new HashMap<String, Integer>();
        map.put("Abhik", 1);
        map.put("Chirag", 2);
        map.put("Darshit", 3);

        // Get the entry set
        var entrySet = map.entrySet();

        // Iterate through the entry set and print each entry
        entrySet.stream().map(entry -> "Key: " + entry.getKey() + ", Value: " + entry.getValue()).forEach(System.out::println);
    }
}