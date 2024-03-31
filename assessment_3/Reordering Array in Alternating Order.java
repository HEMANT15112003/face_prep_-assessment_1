// Given an array of N integers, your task is to reorder it to A1, An, A2, An-1, A3,..
// Input
// First line contains a single integer N - the size of the array
// Second line contains N space separated integers - the elements of the array
// Constraints
// 1 <= N <= 104
// 1<= Ai <= 109

// Output
// Print the array after reordering.
// Sample Input
// 5
// 54321
// Sample Output
// 51423

// Input
// 5 5 4 3 2 1
// Output
// 5 1 4 2 3

// Input
// 4 4 3 7 1
// Output
// 4 1 3 7

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] reordered = new int[N];
        for(int i = 0; i < N / 2; i++) {
            reordered[2 * i] = arr[i];
            reordered[2 * i + 1] = arr[N - i - 1];
        }
        if(N % 2 != 0) {
            reordered[N - 1] = arr[N / 2];
        }
        for(int i = 0; i < N; i++) {
            System.out.print(reordered[i] + " ");
        }
    }
}
