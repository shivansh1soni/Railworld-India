import java.util.*;
class ArrayListMethods {
    public static void main(String[] args) {
        var fruits = new ArrayList<String>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("ArrayList after adding elements: " + fruits);

        // Add element at a specific index
        fruits.add(1, "Papaya");
        System.out.println("ArrayList after adding Blueberry at index 1: " + fruits);

        // Access elements in the ArrayList
        var fruitAtIndex2 = fruits.get(2);
        System.out.println("Element at index 2: " + fruitAtIndex2);

        // Modify elements in the ArrayList
        fruits.set(2, "Blackberry");
        System.out.println("ArrayList after modifying element at index 2: " + fruits);

        // Remove elements from the ArrayList by index
        fruits.remove(1);
        System.out.println("ArrayList after removing element at index 1: " + fruits);

        // Remove elements from the ArrayList by value
        fruits.remove("Cherry");
        System.out.println("ArrayList after removing 'Cherry': " + fruits);

        // Check if the ArrayList contains a specific element
        boolean containsApple = fruits.contains("Apple");
        System.out.println("ArrayList contains 'Apple': " + containsApple);

        // Get the size of the ArrayList
        var size = fruits.size();
        System.out.println("Size of ArrayList: " + size);

        // Iterate over elements using for-each loop
        System.out.println("Iterating over ArrayList elements:");
        for (String i : fruits) {
            System.out.println(i);
        }

        // Clear all elements from the ArrayList
        fruits.clear();
        System.out.println("ArrayList after clearing all elements: " + fruits);

        // Check if the ArrayList is empty
        var isEmpty = true;
        System.out.println("ArrayList is empty: " + isEmpty);

        // Add some elements back to demonstrate sorting
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Blueberry");

        // Sort the ArrayList
        Collections.sort(fruits);
        System.out.println("Sorted ArrayList: " + fruits);

        // Get the index of an element
        var indexOfBanana = fruits.indexOf("Banana");
        System.out.println("Index of 'Banana': " + indexOfBanana);

        // Convert ArrayList to Array
        var fruitsArray = new String[fruits.size()];
        fruits.toArray(fruitsArray);
        System.out.println("ArrayList converted to Array:");
        for (String i : fruitsArray) {
            System.out.println(i);
        }

        // Initialize ArrayList with elements
        var moreFruits = new ArrayList<>(fruits);
        System.out.println("New ArrayList initialized with another ArrayList: " + moreFruits);

    }
}

