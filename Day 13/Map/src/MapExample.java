import java.util.*;

class MapExample {
    public static void main(String[] args) {
        var map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        //Elements can traverse in any order
        map.forEach((key, value) -> { //for each loop
            System.out.println(key + " " + value);
        });
    }
}