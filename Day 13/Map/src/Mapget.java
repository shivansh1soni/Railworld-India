import java.util.*;

public class Mapget {
    public static void main(String[] args) {
        // Create a HashMap and populate it with some key-value pairs
        var map = new HashMap<String, Integer>();
        map.put("Kunal", 1);
        map.put("Madhav", 2);
        map.put("Nihal", 3);

        // Use the get() method to retrieve values associated with keys
        var appleValue = map.get("Kunal");
        var bananaValue = map.get("Madhav");
        var grapeValue = map.get("Param");  // Key not present in the map

        // Print the retrieved values
        System.out.println("Value associated with key 'Kunal': " + appleValue);
        System.out.println("Value associated with key 'Madhav': " + bananaValue);
        System.out.println("Value associated with key 'Param': " + grapeValue);  // Should print null
    }
}