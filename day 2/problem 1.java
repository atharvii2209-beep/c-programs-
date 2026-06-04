
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int num, sum = 0, rem;

        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        // Handle negative numbers
        if (num < 0) {
            num = -num;
        }

        // Loop to calculate sum of digits
        for (; num > 0; num = num / 10) {
            rem = num % 10;   // extract last digit
            sum += rem;       // add to sum
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}
