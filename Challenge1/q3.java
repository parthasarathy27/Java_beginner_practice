/* Get input for 3 integer variables: a, b,and c. Now multiply all variables and store it in d.
Now add all variables and store it in e. Now divide d by e. */

import java.util.Scanner;

public class q3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e;
        System.out.print("Enter the first number: ");
        a = input.nextInt();
        System.out.print("Enter the second number: ");
        b = input.nextInt();
        System.out.print("Enter the third number: ");
        c = input.nextInt();
        d = a * b * c;
        e = a + b + c;

        System.out.println("The sum of the three numbers is: " + d/e);
    }
}
