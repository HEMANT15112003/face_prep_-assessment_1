// [Code to remove duplicate... question starts with john...........]

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        Integer[] array = new Integer[size];
      
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(array));
       
        for (Integer num : set) {
            System.out.print(num + " \n");
        }
    }
}
