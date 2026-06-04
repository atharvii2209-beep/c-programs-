#include <stdio.h>

int main() {
    int n, sum = 0, remainder;

    // Input the number
    printf("Enter a number: ");
    scanf("%d", &n);

    // Handle negative numbers
    if (n < 0) {
        n = -n;
    }

    // Use for loop to calculate sum of digits
    for (; n > 0; n = n / 10) {
        remainder = n % 10;   // Get last digit
        sum += remainder;     // Add to sum
    }

    printf("Sum of digits = %d\n", sum);

    return 0;
}
