/* Get input a number and check whether it is divsible by both 3 and 5 or not. if yes then print, 
the number is divisible by both 3 and 5 print the number is not divisible by 3 and 5. */

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("The number is divisible by both 3 & 5");
        } else {
            System.out.println("The number is not divisible by 3 & 5");
        }
    }
}