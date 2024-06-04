import java.util.*;
public class MapClear {
    public static void main(String[] args) {
        // Create a HashMap and populate it with some key-value pairs
        var map = new HashMap<String, Integer>();
        map.put("Shivansh", 1);
        map.put("Sara", 2);
        map.put("Priyal", 3);

        // Display the map contents
        System.out.println("Original map: " + map);

        // Clear the map
        map.clear();

        // Display the map contents after clearing
        System.out.println("Map after clear(): " + map);
    }
}