// In a supermarket, the rate of items differs every day. In each day it first increases a lot then decreases a little bit. Based on this concept the manager framed a series. Now your task is to find the series for the given number of days. Write program to generate the first 'n' terms of the following series 2, 3, 8, 63, 3968... a
// Input Format: The input is an integer 'n' which denotes the number of terms to be printed in the series.
// Output Format:
// Print the series and refer to the sample output for formatting.
// Sample Input 1:
// 5
// Sample Output 1:
// 238 63 3968

// Explanation:
// Here the input is 5 and hence 5 terms are printed.
// Sample Input 2:
// 1
// Sample Output 2:
// 2
// Explanation:
// Here the input is 1 and hence 1 term is printed.

// Input
// 1
// Output
// 2


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long currentTerm = 2;
        System.out.print(currentTerm);
        for (int i = 2; i <= n; i++) {
            currentTerm = (currentTerm * currentTerm) - 1;
            System.out.print(" " + currentTerm);
        }
        sc.close();
    }
}
