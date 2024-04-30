// Get input for variable a and b print the number from a to b

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }        
    }
}