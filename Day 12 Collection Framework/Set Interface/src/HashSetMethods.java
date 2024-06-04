import java.util.*;

public class HashSetMethods {
    public static void main(String[] args) {
        // Creating a HashSet
        var set = new HashSet<String>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        System.out.println("HashSet after adding elements: " + set);

        // Checking if an element exists
        System.out.println("HashSet contains 'Banana': " + set.contains("Banana"));

        // Removing an element
        set.remove("Grapes");
        System.out.println("HashSet after removing 'Grapes': " + set);

        // Iterating over elements using iterator
        System.out.print("Iterating using iterator: ");
        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Iterating over elements using for-each loop
        System.out.print("Iterating using for-each loop: ");
        for (var i : set) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Checking the size of the HashSet
        System.out.println("Size of the HashSet: " + set.size());

        // Checking if the HashSet is empty
        System.out.println("Is the HashSet empty? " + set.isEmpty());

        // Clearing the HashSet
        set.clear();
        System.out.println("HashSet after clearing: " + set);

        // Adding all elements from another collection
        var anotherSet = new HashSet<String>();
        anotherSet.add("Mango");
        anotherSet.add("Pineapple");
        set.addAll(anotherSet);
        System.out.println("HashSet after adding all elements from another set: " + set);

        // Converting the HashSet to an array
        var array = set.toArray();
        System.out.print("HashSet elements as an array: ");
        for (var obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
