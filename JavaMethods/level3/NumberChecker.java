package JavaMethods.level3;

public class NumberChecker {
     // Count digits
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Return digits array
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // ✅ Example: Armstrong number
    public static boolean isArmstrong(int number) {
        int[] digits = getDigits(number);
        int count = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, count);
        }
        return sum == number;
    }

    // ✅ Example: Duck number (contains 0, but not starting zero)
    public static boolean isDuck(int number) {
        String str = String.valueOf(number);
        return str.indexOf('0') > 0;
    }

    // ✅ Example: Palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        for (int i = 0, j = digits.length - 1; i < j; i++, j--) {
            if (digits[i] != digits[j]) return false;
        }
        return true;
    }

    // Add more methods (prime, neon, spy, automorphic, buzz, harshad, etc.)

    public static void main(String[] args) {
        int testNumber = 153;

        System.out.println("Digits: " + java.util.Arrays.toString(getDigits(testNumber)));
        System.out.println("Armstrong? " + isArmstrong(testNumber));
        System.out.println("Duck? " + isDuck(testNumber));
        System.out.println("Palindrome? " + isPalindrome(testNumber));
    }
}
