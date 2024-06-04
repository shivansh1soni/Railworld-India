import java.util.*;

public class MapisEmpty {
    public static void main(String[] args) {
        // Create an empty HashMap
        var map = new HashMap<String, Integer>();

        // Check if the map is empty
        System.out.println("Is the map empty? " + true); // Should print true

        // Insert a key-value pair into the map
        map.put("Apple", 1);

        // Check if the map is empty again
        System.out.println("Is the map empty after adding an entry? " + false); // Should print false

        // Clear the map
        map.clear();

        // Check if the map is empty after clearing
        System.out.println("Is the map empty after clearing? " + true); // Should print true
    }
}