   import java.util.Scanner;

public class Main {

    // Function to find nth Fibonacci term (iterative)
    static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int first = 0, second = 1, next = 0;
        for (int i = 2; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many terms of Fibonacci series you want: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        sc.close();
    }
}
