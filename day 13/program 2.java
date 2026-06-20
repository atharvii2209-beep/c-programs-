import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];  // calculate sum while inputting
        }

        // Calculate average
        double avg = (double) sum / n;

        // Print array elements
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Print sum and average
        System.out.println("\nSum of array elements = " + sum);
        System.out.println("Average of array elements = " + avg);

        sc.close();
    }
}
