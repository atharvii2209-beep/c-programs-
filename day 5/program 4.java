import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        long largestPrime = -1;

        // divide by 2 until odd
        while (num % 2 == 0) {
            largestPrime = 2;
            num /= 2;
        }

        // check odd factors
        for (long i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                largestPrime = i;
                num /= i;
            }
        }

        // if num itself is prime and > 2
        if (num > 2) {
            largestPrime = num;
        }

        System.out.println("Largest prime factor is: " + largestPrime);

        sc.close();
    }
}
