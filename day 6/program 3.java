import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int n = num;

        while (n > 0) {
            count += (n & 1); // check last bit
            n >>= 1;          // right shift
        }

        System.out.println("Number of set bits in " + num + " = " + count);

        sc.close();
    }
}
