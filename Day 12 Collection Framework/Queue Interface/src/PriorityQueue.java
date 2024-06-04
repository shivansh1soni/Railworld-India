import java.util.*;
class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue instance
        var priorityQueue = new PriorityQueue<Integer>();

        // Adding elements to the priority queue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(15);
        priorityQueue.offer(5);
        priorityQueue.offer(25);

        // Display the priority queue
        System.out.println("PriorityQueue after additions: " + priorityQueue);

        // Accessing elements from the priority queue
        System.out.println("Peek Element: " + priorityQueue.peek()); // Retrieve the head of the queue

        // Removing elements from the priority queue
        System.out.println("Removed Element: " + priorityQueue.remove());   // Remove the head of the queue
        System.out.println("Poll Element: " + priorityQueue.poll());       // Remove the head of the queue

        // Display the priority queue after removals
        System.out.println("PriorityQueue after removals: " + priorityQueue);

        // Check the status of the priority queue
        System.out.println("Is priority queue empty? " + priorityQueue.isEmpty());
        System.out.println("Priority queue size: " + priorityQueue.size());

        // Using iterator
        System.out.println("PriorityQueue elements using iterator:");
        for (Integer i : priorityQueue) {
            System.out.println(i);
        }

        // Clear the priority queue
        priorityQueue.clear();
        System.out.println("PriorityQueue after clear: " + priorityQueue);

        // Handling exception on remove when the queue is empty
        try {
            priorityQueue.remove();
        } catch (Exception e) {
            System.out.println("Exception on remove from empty priority queue: " + e);
        }

        // Handling exception on element when the queue is empty
        try {
            priorityQueue.element();
        } catch (Exception e) {
            System.out.println("Exception on element from empty priority queue: " + e);
        }

        // Adding elements again to demonstrate priority order
        priorityQueue.add(50);
        priorityQueue.add(30);
        priorityQueue.add(40);

        // Display the priority queue to show the priority order
        System.out.println("PriorityQueue with new elements: " + priorityQueue);
    }
}
