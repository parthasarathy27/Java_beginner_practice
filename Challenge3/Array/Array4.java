/* Get input for size on array. 
Get input for each element in an array 
Find and print middle element in an array */

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] values = new int[size];

        for (int i = 0; i < size; i++) {
            values[i] = input.nextInt();
        }
        System.out.println("Middle element is: " + values[size / 2]);

    }
}
