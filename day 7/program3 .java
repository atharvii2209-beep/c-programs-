import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // handle negative numbers
        if (num < 0) {
            num = -num;
        }

        int result = sumOfDigits(num);

        System.out.println("Sum of digits = " + result);

        sc.close();
    }

    // recursive function to calculate sum of digits
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0; // base case
        }
        return (n % 10) + sumOfDigits
