
/* Get input for salary and age 
 * If salary is greater than or equal to 20000 or age less than or equal to 25,
 * get input for required loan amount. If not print you are not eligible for loan.
 * If required loan amount is less than or equal to 50,000 print you are eligible for loan.
 * If it is greater thAN 50,000 print maximum loan amount is 50,000.
*/
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = input.nextInt();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (salary >= 20000 || age <= 25) {
            System.out.print("Enter the required loan amount: ");
            int loan = input.nextInt();
            if (loan <= 50000) {
                System.out.println("You are eligible for loan.");
            } else {
                System.out.println("Maximum loan amount is 50,000.");
            }
        }
        else {
            System.out.println("You are not eligible for loan.");
        }
    }
}
