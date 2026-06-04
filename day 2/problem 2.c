
#include <stdio.h>

int main() {
    int num, count = 0;

    // Input the number
    printf("Enter a number: ");
    scanf("%d", &num);

    // Special case: if number is 0
    if (num == 0) {
        count = 1;
    } else {
        // Handle negative numbers
        if (num < 0) {
            num = -num;
        }

        // Count digits using loop
        for (; num > 0; num = num / 10) {
            count++;
        }
    }

    printf("Number of digits = %d\n", count);

    return 0;
}
