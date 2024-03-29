// Description
// • An oil factory has N number of containers and each has a different capacity. During renovation, the manager decided to make some changes with the containers. He wishes to make different pairs for the containers in such a way that in the first pair, the container of maximum capacity is paired with the container of minimum capacity, and so on for the rest of the containers, to maintain a balance throughout all the pairs of containers.
// • Write an algorithm to make different pairs of containers in such a way that the first container in the pair is of maximum capacity and second container in the pair is of minimum capacity.
// Input Format
// • The first line of the input consists of an integer - numContainers, representing the number of containers (N).
// • The next line consists of N space-separated integers - cont1, cont2,.... contN, representing container capacity.
// Constraints
// . 1 <= numContainers <= 1000
// • 1<= conti <= 1000
// 1 <= i <= numContainers

// Output Format
// • Print K lines consisting of two space-separated integers representing the pairs that will be formed to maintain the balance by pairing the container of maximum capacity with the container of minimum capacity and so on.
// • Note
// • If only one container is left and no pair is possible then print the capacity of that container and the second value will be '0'.
// Sample Input
// 6
// 100 560 23 19 53 20
// Sample Output
// 560 19
// 100 20
// 53 23

// Input
// 6 100 560 23 19 53 20
// Output
// 560 19
// 100 20
// 53 23

// Input
// 5 15 25 35 45 55
// Output
// 55 15
// 45 25
// 35 0

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of containers:");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("Enter the capacities of the containers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("The pairs are:");
        for (int i = 0; i < n / 2; i++) {
            System.out.println(arr[i] + " " + arr[n - i - 1]);
        }
        if (n % 2 != 0) {
            System.out.println(arr[n / 2] + " 0");
        }
    }
}
