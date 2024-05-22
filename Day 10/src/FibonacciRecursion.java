import java.util.stream.IntStream;

public class FibonacciRecursion {

    public static int fibonacci(int n) {
        return n <= 1 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void printFibonacciSeries(int n) {
        IntStream.range(0, n).mapToObj(i -> fibonacci(i) + " ").forEach(System.out::print);
    }

    public static void main(String[] args) {
        int terms = 10;
        System.out.println("Fibonacci series up to " + terms + " terms:");
        printFibonacciSeries(terms);
    }
}