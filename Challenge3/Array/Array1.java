//Get input for 5 numbers using array and for loop

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            System.out.print("Enter the mark: ");
            marks[i] = input.nextInt();
        }
        System.out.print(marks[0] + ", " + marks[1] + ", " + marks[2] + ", " + marks[3] + ", " + marks[4]);
    }   
}
