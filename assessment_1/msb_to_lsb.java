// Write a program to print digits of a number from Most significant digit to least using recursion.
// Get a number from the user and print it's digits from MSD to LSD. Digits will be separated by a
// newline.
// Sample Input:
// 123
// Sample Output:
// 1
// 2
// 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        printDigits(number);
    }

    public static void printDigits(int number) {
        if (number >= 10) {
            printDigits(number / 10);
        }
        System.out.println(number % 10);
    }
}
