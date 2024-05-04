import java.util.Scanner;

public class SwapTwoVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Before swap: num1 = " + num1 + " num2 = " + num2);

        //Method 1:
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        //Method 2:
        /*num1 = num1+num2;
        num2 = num1 - num2;
        num1 = num1 - num2;*/

        // Method 3:
        // num1 = (num1 * num2) / (num2 = num1);

        System.out.println("After swap: num1 = " + num1 + " num2 = " + num2);
    }
}
