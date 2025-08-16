import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();
        String reversedString = "";

        // Reverse the string
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        // Compare original and reversed strings
        if (originalString.equalsIgnoreCase(reversedString)) { // Use equalsIgnoreCase for case-insensitive comparison
            System.out.println(originalString + " is a palindrome.");
        } else {
            System.out.println(originalString + " is not a palindrome.");
        }

        scanner.close();
    }
}