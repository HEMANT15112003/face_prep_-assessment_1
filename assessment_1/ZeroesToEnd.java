// Description Write a program to move all zeroes to the end of a given integer.
// Input Format
// • The first line of input contains a number of test cases T.
// • For each test case, the first line of input contains a single integer of O's and 1's.
// Constraints
// • 1≤T≤10
// • 1≤N≤109
// Output Format
// The output contains a single-line integer value.

// Sample Input
// 2
// 1010101
// 1000111
// Sample Output
// 1111000
// 1111000

// Input
// 2 1010101 1000111
// Output
// 1111000
// 1111000

// Input
// Output
// 1111000

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int T = sc.nextInt();
        while (T-- > 0) {
            System.out.println("Enter the integer:");
            String str = sc.next();
            int countZero = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '0') {
                    countZero++;
                } else {
                    sb.append(str.charAt(i));
                }
            }
            while (countZero-- > 0) {
                sb.append('0');
            }
            System.out.println("The integer after moving all zeroes to the end is:");
            System.out.println(sb.toString());
        }
    }
}
