// Description:
// A survey was conducted to find the growth rate of a particular virus. They found that on each day its growth rate differs. For example, on the first day its rate increases by 13 whereas on the second day its growth rate increases by the second multiple of 13, and on the third day third multiple of 13 and it goes on like this. Write a program to generate the first 'n' terms of the following series 2, 15, 41, 80,...

// Input Format:
// The input is an integer 'n' which denotes the number of terms to be printed in the series.

// Output Format:
// Print the series and refer to the sample output for formatting.

// Sample Input 1:
// 5

// Sample Output 1:
// 2 15 41 80 132

// Explanation:
// Here the input value is 5 and hence 5 elements are getting printed.

// Sample Input 2:
// 6

// Sample Output 2:
// 2 15 41 80 132 197

// Explanation:
// Here the input value is 6 and hence 6 elements are getting printed.

import java.util.Scanner;

public class Main {
    public static void printSeries(int n) {
        int term = 2;
        int multiple = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            multiple += 13;
            term += multiple;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        printSeries(n);
    }
}
