import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (position of Fibonacci term): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int result = fibonacci(n);
            System.out.println("The " + n + "th Fibonacci term is: " + result);
        }

        sc.close();
    }

    // iterative method to find nth Fibonacci term
    public static int fibonacci(int n) {
        if (n == 1) return 0; // first term
        if (n == 2) return 1; // second term

        int first = 0, second = 1, next = 0;
        for (int i = 3; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        return second;
    }
}
