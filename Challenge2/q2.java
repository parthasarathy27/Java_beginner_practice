/* Get input variable income. if income is greater than 7000 scholarship is granted. 
else not eligible for scholarship */ 

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your income: ");
        int income = input.nextInt();
        if ( income > 7000) {
            System.out.println("Scholarship is Granted");
        }
        else {
            System.out.println("Not Eligible for Scholarship");
        }
    }
}
