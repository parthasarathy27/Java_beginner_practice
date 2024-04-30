/* Get input for five subjects marks. Add all of it, and find average.
 * If average mark is less than 35. print "Additional class is required"
 * else print "You are good to go!"
 */
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks for Subject 1: ");
        int sub1 = input.nextInt();
        System.out.print("Enter the marks for Subject 2: ");
        int sub2 = input.nextInt();
        System.out.print("Enter the marks for Subject 3: ");
        int sub3 = input.nextInt();
        System.out.print("Enter the marks for Subject 4: ");
        int sub4 = input.nextInt();
        System.out.print("Enter the marks for Subject 5: ");
        int sub5 = input.nextInt();
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double avg = total / 5;
        if (avg < 35) {
            System.out.println("Additional class is required");
        } else {
            System.out.println("You are good to go!");
        }
    }
}
