public class ArmstrongNumber {

    public static int countDigits(int num) {
        return num == 0 ? 0 : 1 + countDigits(num / 10);
    }

    public static int power(int base, int exp) {
        return exp == 0 ? 1 : base * power(base, exp - 1);
    }

    public static int sumOfPowers(int num, int numDigits) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        return power(digit, numDigits) + sumOfPowers(num / 10, numDigits);
    }

    public static boolean isArmstrong(int num) {
        var numDigits = countDigits(num);
        return num == sumOfPowers(num, numDigits);
    }

    public static void main(String[] args) {
        int number = 153;
        System.out.println(isArmstrong(number) ? number + " is an Armstrong number." : number + " is not an Armstrong number.");
    }
}