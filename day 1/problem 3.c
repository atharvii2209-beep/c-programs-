
#include <stdio.h>

int main() {
    int N, sum = 0;

    // Input the value of N
    printf("Enter the value of N: ");
    scanf("%d", &N);

    // Using formula: sum = N * (N + 1) / 2
    sum = N * (N + 1) / 2;

    // Output the result
    printf("The sum of the first %d natural numbers is: %d\n", N, sum);

    return 0;
}
