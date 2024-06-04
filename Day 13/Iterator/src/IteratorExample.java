import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        // Create an ArrayList and populate it with some elements
        var list = new ArrayList<String>();
        list.add("Shivansh");
        list.add("Sara");
        list.add("Priyal");

        // Get the iterator
        var iterator = list.iterator();

        // Iterate through the list using the iterator
        while (iterator.hasNext()) {
            var element = iterator.next();
            System.out.println(element);

            // Optionally remove elements during iteration
            if (element.equals("Aadhvita")) {
                iterator.remove(); // Remove "Banana" from the list
            }
        }

        // Print the list after iteration and removal
        System.out.println("List after iteration: " + list);
    }
}
