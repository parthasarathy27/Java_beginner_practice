// Print 10 Numbers from an array Using for loop

import java.util.Scanner;

public class Array2{
    public static void main(String[] args) {
        int[] values = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 9 ; i++) {
            System.out.print("Enter the value: ");
            values[i] = input.nextInt();
        }
    }
}
