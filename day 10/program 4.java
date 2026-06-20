public class Main {
    public static void main(String[] args) {
        int rows = 5; 
        int alphabet = 65;

        for (int i = 1; i <= rows; i++) {
            // print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // print characters forward
            for (int k = 0; k < i; k++) {
                System.out.print((char)(alphabet + k) + " ");
            }
    
            for (int k = i - 2; k >= 0; k--) {
                System.out.print((char)(alphabet + k) + " ");
            }
            System.out.println();
        }
    }
}
