// Print even number between a to b using for loop and if else.

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
        for (int i = a; i <= b; i++) {
            if( i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    
}
