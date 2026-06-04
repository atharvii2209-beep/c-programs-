import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        int num, product = 1, rem;

        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        // Handle negative numbers
        if (num < 0) {
            num = -num;
        }

        // Special case: if number is 0, product should be 0
        if (num == 0) {
            product = 0;
        } else {
            // Loop to calculate product of digits
            for (; num > 0; num = num / 10) {
                rem = num % 10;       // extract last digit
                product *= rem;       // multiply with product
            }
        }

        System.out.println("Product of digits = " + product);

        sc.close();
    }
}
