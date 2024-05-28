import java.util.*;

public class LeapYear {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.println("Enter any Year :");
        var a = sc.nextInt();

        if (a % 100 == 0) {
            System.out.println(a % 400 == 0 ? a + " is Leap Year" : a + " is not Leap year");

        } else if (a % 4 == 0) {
            System.out.println(a + " is Leap year");
        } else
            System.out.println(a + " is not Leap year");
    }
}