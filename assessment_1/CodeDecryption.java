// Description
// A company transfers an encrypted code to one of its clients. The code needs to be decrypted so that it can be used for accessing all the required information. The code can be decrypted by interchanging each consecutive digit and once a digit has been interchanged then it cannot be used again. If at a certain point there is no digit to be interchanged with, then the single digit must be left as it is.
// Write an algorithm to decrypt the code so that it can be used to access the required information.
// Input Format
// The first line of the input consists of an integer - encrypted code, representing the encrypted code given to the client.
// Output Format Print an integer representing the decrypted code that can be used for accessing the required information
// Sample Input 0
// 39631
// Sample Output 0
// 93361

// Explanation
// Step 1 - Interchange the first two digits, 3 and 9, which form 93631.
// Step 2 - Interchange the third and fourth digits, 6 and 3 which form 93361,
// Step 3 - For the fifth digit as there is no digit to be interchanged with, it is left it is so it will be kept as 93361.
// So, the output is 93361.

// Input
// 39631
// Output
// 93361

// Input
// 1234
// Output
// 2143

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the encrypted code:");
        String code = sc.next();
        char[] arr = code.toCharArray();
        for (int i = 0; i < arr.length - 1; i += 2) {
            char temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        String decryptedCode = new String(arr);
        System.out.println("The decrypted code is:");
        System.out.println(decryptedCode);
    }
}
