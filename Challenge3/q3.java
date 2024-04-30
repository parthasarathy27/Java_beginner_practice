// Count the number of odd number from a to b
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {
            if( i % 2 == 1) {
                count++;
            }
        }
        System.out.println("Number of odd numbers between " + a + " and " + b + " is " + count);
    }
}
