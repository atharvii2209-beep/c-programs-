import java.util.Scanner;

public class Main {

    // Function to check if a number is palindrome
    static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        // Handle negative numbers by ignoring sign
        if (num < 0) {
            num = -num;
            original = -original;
        }

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return Math.abs(original) == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }

        sc.close();
    }
}
