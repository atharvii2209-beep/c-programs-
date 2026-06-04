import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num, reversed = 0, remainder;

        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int original = num;

        // Handle negative numbers
        if (num < 0) {
            num = -num;
        }

        // Reverse using loop
        for (; num > 0; num = num / 10) {
            remainder = num % 10;                 // extract last digit
            reversed = reversed * 10 + remainder; // build reversed number
        }

        // Restore sign if original was negative
        if (original < 0) {
            reversed = -reversed;
        }

        System.out.println("Reversed number = " + reversed);

        sc.close();
    }
}
