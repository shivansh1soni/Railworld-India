import java.util.*;

public class MapEquals {
    public static void main(String[] args) {
        // Create the first HashMap and populate it with some key-value pairs
        var map1 = new HashMap<String, Integer>();
        map1.put("Devak", 1);
        map1.put("Ehan", 2);
        map1.put("Garg", 3);

        // Create the second HashMap and populate it with the same key-value pairs
        var map2 = new HashMap<String, Integer>();
        map2.put("Devak", 1);
        map2.put("Ehan", 2);
        map2.put("Garg", 3);

        // Create a third HashMap with different key-value pairs
        var map3 = new HashMap<String, Integer>();
        map3.put("Devak", 1);
        map3.put("Ehan", 2);
        map3.put("Harshit", 4);

        // Compare map1 and map2 for equality
        var isEqualMap1Map2 = map1.equals(map2);
        System.out.println("map1 equals map2: " + isEqualMap1Map2);  // should print true

        // Compare map1 and map3 for equality
        var isEqualMap1Map3 = map1.equals(map3);
        System.out.println("map1 equals map3: " + isEqualMap1Map3);  // should print false
    }
}