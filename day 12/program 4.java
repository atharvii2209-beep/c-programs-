import java.util.Scanner;

public class Main {

    // Function to check if a number is Perfect Number
    static boolean isPerfect(int num) {
        if (num <= 1) return false;  // 1 is not considered perfect

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPerfect(n)) {
            System.out.println(n + " is a Perfect Number.");
        } else {
            System.out.println(n + " is not a Perfect Number.");
        }

        sc.close();
    }
}
