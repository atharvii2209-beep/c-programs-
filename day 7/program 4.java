import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = reverse(num, 0);

        System.out.println("Reversed number = " + reversed);

        sc.close();
    }

    // recursive function to reverse a number
    public static int reverse(int n, int rev) {
        if (n == 0) {
            return rev; // base
