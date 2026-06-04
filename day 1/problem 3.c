#include <stdio.h>

int main() {
    int n, reversed = 0, remainder;

    // Input the number
    printf("Enter a number: ");
    scanf("%d", &n);

    int original = n;
    if (n < 0) {
        n = -n;  // make positive for processing
    }

    // Reverse using for loop
    for (; n > 0; n = n / 10) {
        remainder = n % 10;                  // extract last digit
        reversed = reversed * 10 + remainder; // build reversed number
    }

    // Restore sign if original was negative
    if (original < 0) {
        reversed = -reversed;
    }

    printf("Reversed number = %d\n", reversed);

    return 0;
}
