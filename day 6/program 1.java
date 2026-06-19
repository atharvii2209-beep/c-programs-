import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        // convert binary string to decimal
        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal equivalent of " + binary + " is: " + decimal);

        sc.close();
    }
}
