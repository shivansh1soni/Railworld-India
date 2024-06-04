import java.util.*;
class StackMethods {
    public static void main(String[] args) {
        // Create a Stack of Strings
        var fruits = new Stack<String>();

        // Push elements onto the Stack
        fruits.push("Apple");
        fruits.push("Banana");
        fruits.push("Cherry");
        System.out.println("Stack after pushing elements: " + fruits);

        // Access the top element of the Stack without removing it
        var topElement = fruits.peek();
        System.out.println("Top element: " + topElement);

        // Pop elements from the Stack
        var poppedElement = fruits.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping element: " + fruits);

        // Check if the Stack is empty
        var isEmpty = fruits.isEmpty();
        System.out.println("Stack is empty: " + isEmpty);

        // Push more elements onto the Stack
        fruits.push("Date");
        fruits.push("Elderberry");
        System.out.println("Stack after pushing more elements: " + fruits);

        // Search for an element in the Stack (returns 1-based position from the top of the stack)
        var position = fruits.search("Banana");
        System.out.println("Position of 'Banana' in the Stack: " + position);

        // Clear all elements from the Stack
        fruits.clear();
        System.out.println("Stack after clearing all elements: " + fruits);

        // Check if the Stack is empty again
        isEmpty = fruits.isEmpty();
        System.out.println("Stack is empty after clearing: " + isEmpty);

        // Add elements to demonstrate iteration and additional operations
        fruits.push("Fig");
        fruits.push("Grape");
        fruits.push("Honeydew");

        // Iterate over elements using for-each loop
        System.out.println("Iterating over Stack elements:");
        for (String i : fruits) {
            System.out.println(i);
        }

        // Convert Stack to Array
        var fruitsArray = new String[fruits.size()];
        fruits.toArray(fruitsArray);
        System.out.println("Stack converted to Array:");
        for (String i : fruitsArray) {
            System.out.println(i);
        }

        // Initialize Stack with elements
        var moreFruits = new Stack<String>();
        moreFruits.addAll(fruits);
        System.out.println("New Stack initialized with another Stack: " + moreFruits);

        // Get the size of the Stack
        var size = fruits.size();
        System.out.println("Size of Stack: " + size);

        // Use contains method to check for an element
        var containsApple = fruits.contains("Apple");
        System.out.println("Stack contains 'Apple': " + containsApple);

    }
}
