#include <stdio.h>

int main() {
    int num, reversed = 0, remainder, original;

    // Get input from the user
    printf("Enter an integer: ");
    scanf("%d", &num);

    original = num; // Store the original number

    // Reverse the number
    while (num != 0) {
        remainder = num % 10; // Get the last digit
        reversed = reversed * 10 + remainder; // Build the reversed number
        num /= 10; // Remove the last digit from the original number
    }

    // Check if the original and reversed numbers are equal
    if (original == reversed) {
        printf("%d is a palindrome number.\n", original);
    } else {
        printf("%d is not a palindrome number.\n", original);
    }

    return 0;
}