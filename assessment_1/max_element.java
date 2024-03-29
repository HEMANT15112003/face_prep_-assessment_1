// Maximum Element in an Array
// Write a program to find the maximum element in an array using recursion.
// Input Format:
// Input consists of the size of the array and array elements
// Output Format:
// The output prints the maximum element in an array.
// Refer sample input and output for formatting specifications.

// Sample Input 1:
// 6
// 2
// 5
// 1
// 7
// 4
// 2
// Sample Output 1:
// Maximum element in the array is 7

// Sample Input 2:
// 5
// 23
// 43
// 14
// 76
// 98
// Sample Output 2:
// Maximum element in the array is 98


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum element in the array is " + findMax(arr, n));
    }

    public static int findMax(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        else
            return Math.max(arr[n - 1], findMax(arr, n - 1));
    }
}
