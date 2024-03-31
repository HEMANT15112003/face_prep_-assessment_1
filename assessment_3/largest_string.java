// Write a program to get two strings from the user and display the largest string without using built-in functions. If the strings are equal print Equal.
// Input Format:
// Input consists of two strings.
// Output Format: Output consists of a string which is largest. If the strings are equal print Equal.
// Input Sample1: Focus Academy
// Output Sample1: Academy
// Input Sample2: Software Systems
// Output Sample2: Software

// Input
// Focus Academy
// Output
// Academy

// Input
// Systems Systems
// Output
// Equal

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int count1 = 0;
        for(char c : str1.toCharArray()) {
            count1++;
        }
        int count2 = 0;
        for(char c : str2.toCharArray()) {
            count2++;
        }
        if(count1 > count2) {
            System.out.println(str1);
        } else if(count1 < count2) {
            System.out.println(str2);
        } else {
            System.out.println("Equal");
        }
    }
}
