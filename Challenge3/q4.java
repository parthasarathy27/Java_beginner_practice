// Print the number which are divisible by both 3 and 5 Range 1 to 100

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}