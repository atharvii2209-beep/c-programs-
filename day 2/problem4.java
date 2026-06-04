import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        int num, reversed = 0, remainder;

        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int original = num;

        // Handle negative numbers (palindrome check usually ignores sign)
        if (num < 0) {
            num = -num;
        }

        // Reverse the number
        for (; num > 0; num = num / 10) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
        }

        // Compare with original (ignoring sign)
        if (original < 0) {
            original = -original;
        }

        if (original == reversed) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

        sc.close();
    }
}
