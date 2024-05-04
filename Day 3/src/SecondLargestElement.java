import java.util.*;

public class SecondLargestElement {

    static int secondLargest(int[] arr, int n) {

        if (n < 2) return -1;

        int first = arr[0];
        int second = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < first && arr[i] > second) {
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int second = secondLargest(arr, n);
        System.out.println("The second largest element is: " + second);

    }
}
