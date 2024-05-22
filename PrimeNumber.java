public class PrimeNumber {
    public static boolean isPrime(int num, int divisor) {
        if (num < 2) return false;
        if (divisor == 1) return true;
        if (num % divisor == 0) return false;
        return isPrime(num, divisor - 1);
    }

    public static void printPrimes(int current, int limit) {
        if (current > limit) return;
        if (isPrime(current, current / 2)) {
            System.out.print(current + " ");
        }
        printPrimes(current + 1, limit);
    }

    public static void main(String[] args) {
        int limit = 20;
        System.out.println("Prime numbers up to " + limit + ":");
        printPrimes(2, limit);
    }
}