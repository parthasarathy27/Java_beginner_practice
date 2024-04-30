// Print maths tables

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int[] table = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for (int i = 0; i <= 9; i++) {
            table[i] = num * (i + 1);
            System.out.println(num + " * " + (i + 1) + " = " + table[i]);
        }
    }
}
