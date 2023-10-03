import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numberToCheck = scanner.nextInt();
        int originalNumber = numberToCheck;
        int reversedNumber = 0;

        while (numberToCheck != 0) {
            int digit = numberToCheck % 10;
            reversedNumber = reversedNumber * 10 + digit;
            numberToCheck /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
