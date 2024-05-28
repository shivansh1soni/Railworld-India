import java.util.*;
class LinkedListMethods {
    public static void main(String[] args) {
        var fruits = new LinkedList<String>();

        // Add elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Papaya");
        System.out.println("LinkedList after adding elements: " + fruits);

        // Add element at a specific index
        fruits.add(1, "Blueberry");
        System.out.println("LinkedList after adding Blueberry at index 1: " + fruits);

        // Add elements to the beginning and end
        fruits.addFirst("Avocado");
        fruits.addLast("Date");
        System.out.println("LinkedList after adding elements to the beginning and end: " + fruits);

        // Access elements in the LinkedList
        var firstFruit = fruits.getFirst();
        var lastFruit = fruits.getLast();
        var fruitAtIndex2 = fruits.get(2);
        System.out.println("First element: " + firstFruit);
        System.out.println("Last element: " + lastFruit);
        System.out.println("Element at index 2: " + fruitAtIndex2);

        // Modify elements in the LinkedList
        fruits.set(2, "Blackberry");
        System.out.println("LinkedList after modifying element at index 2: " + fruits);

        // Remove elements from the LinkedList by index
        fruits.remove(1);
        System.out.println("LinkedList after removing element at index 1: " + fruits);

        // Remove elements from the LinkedList by value
        fruits.remove("Cherry");
        System.out.println("LinkedList after removing 'Cherry': " + fruits);

        // Remove first and last elements
        fruits.removeFirst();
        fruits.removeLast();
        System.out.println("LinkedList after removing first and last elements: " + fruits);

        // Check if the LinkedList contains a specific element
        var containsApple = fruits.contains("Apple");
        System.out.println("LinkedList contains 'Apple': " + containsApple);

        // Get the size of the LinkedList
        var size = fruits.size();
        System.out.println("Size of LinkedList: " + size);

        // Iterate over elements using for-each loop
        System.out.println("Iterating over LinkedList elements:");
        for (String i : fruits) {
            System.out.println(i);
        }

        // Clear all elements from the LinkedList
        fruits.clear();
        System.out.println("LinkedList after clearing all elements: " + fruits);

        // Check if the LinkedList is empty
        var isEmpty = fruits.isEmpty();
        System.out.println("LinkedList is empty: " + isEmpty);

        // Add some elements back to demonstrate sorting
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Blueberry");

        // Sort the LinkedList
        Collections.sort(fruits);
        System.out.println("Sorted LinkedList: " + fruits);

        // Get the index of an element
        var indexOfBanana = fruits.indexOf("Banana");
        System.out.println("Index of 'Banana': " + indexOfBanana);

        // Convert LinkedList to Array
        var fruitsArray = new String[fruits.size()];
        fruits.toArray(fruitsArray);
        System.out.println("LinkedList converted to Array:");
        for (String i : fruitsArray) {
            System.out.println(i);
        }

        // Initialize LinkedList with elements
        LinkedList<String> moreFruits = new LinkedList<>(fruits);
        System.out.println("New LinkedList initialized with another LinkedList: " + moreFruits);


    }
}
