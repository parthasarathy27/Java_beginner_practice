// Get input for variable mark. if mark > 35 print pass. else print fail.

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your mark: ");
        int mark = input.nextInt();
        if ( mark >= 35) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}