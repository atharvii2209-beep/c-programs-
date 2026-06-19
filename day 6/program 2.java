import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // convert decimal to binary
        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary equivalent of " + decimal + " is: " + binary);

        sc.close();
    }
}
