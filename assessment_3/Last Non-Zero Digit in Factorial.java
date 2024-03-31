// Given a number n, find the last non-zero digit in n!.
// Input Format:
// The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer n.
// Output Format:
// For each test case in a new line, print the required output.
// Constraints:
// 1 <= T <= 100
// 1 <= n <= 100

// Examples:
// Example 1:
// Input:
// 5
// Output:
// 2
// Explanation:
// 5! 5*4*3*2*1 120. Last non-zero digit in 120 is 2.
// Example 2:
// Input:
// 33
// Output:
// 8
// Example 3:
// Input:
// 2
// 5
// 33
// Output:
// 2
// 8

// Input
// 2 5 33
// Output
// 2
// 8

// Input
// 3 99 75 70
// Output
// 4
// 4
// 8

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            int result = 1;
            for(int i = 2; i <= n; i++) {
                result *= i;
                while(result % 10 == 0) {
                    result /= 10;
                }
                result %= 1000; 
            }
            System.out.println(result % 10);
        }
    }
}
