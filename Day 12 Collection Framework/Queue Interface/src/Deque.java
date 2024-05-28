import java.util.*;
class DequeMethods {
    public static void main(String[] args) {
        // Create a Deque instance
        var deque = new ArrayDeque<String>();

        // Adding elements to the deque
        deque.add("Element 1");            // Add to the end
        deque.addFirst("Element 2");       // Add to the beginning
        deque.addLast("Element 3");        // Add to the end
        deque.offer("Element 4");          // Add to the end
        deque.offerFirst("Element 5");     // Add to the beginning
        deque.offerLast("Element 6");      // Add to the end

        // Display the deque
        System.out.println("Deque after additions: " + deque);

        // Accessing elements from the deque
        System.out.println("First Element: " + deque.getFirst()); // Retrieve first element
        System.out.println("Last Element: " + deque.getLast());   // Retrieve last element
        System.out.println("Peek Element: " + deque.peek());      // Peek at the first element
        System.out.println("Peek First: " + deque.peekFirst());   // Peek at the first element
        System.out.println("Peek Last: " + deque.peekLast());     // Peek at the last element

        // Removing elements from the deque
        System.out.println("Removed First Element: " + deque.removeFirst()); // Remove first element
        System.out.println("Removed Last Element: " + deque.removeLast());   // Remove last element
        System.out.println("Removed Element: " + deque.remove());            // Remove first element
        System.out.println("Poll First Element: " + deque.pollFirst());      // Poll first element
        System.out.println("Poll Last Element: " + deque.pollLast());        // Poll last element

        // Display the deque after removals
        System.out.println("Deque after removals: " + deque);

        // Check the status of the deque
        System.out.println("Is deque empty? " + deque.isEmpty());
        System.out.println("Deque size: " + deque.size());

        // Clear the deque
        deque.clear();
        System.out.println("Deque after clear: " + deque);

        // Trying to access elements from an empty deque (will throw exceptions)
        try {
            System.out.println("First Element: " + deque.getFirst());
        } catch (Exception e) {
            System.out.println("Exception on getFirst from empty deque: " + e);
        }

        try {
            System.out.println("Last Element: " + deque.getLast());
        } catch (Exception e) {
            System.out.println("Exception on getLast from empty deque: " + e);
        }

        // Adding elements again to demonstrate iterator
        deque.add("Element 7");
        deque.add("Element 8");
        deque.add("Element 9");

        // Using iterator
        System.out.println("Deque elements using iterator:");
        for (String i : deque) {
            System.out.println(i);
        }
    }
}
