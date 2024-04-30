/* Question: What is the color of the traffic light?
 * If the answer is "Red", print "Stop."
 * if the answer is "Yellow", print "Slow down."
 * If the answer is "Green", print "Go."
 */
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the color of the traffic light? ");
        String color = input.nextLine();
        if (color.equals("Red") || color.equals("red")) {
            System.out.println("Stop.");
        } else if (color.equals("Yellow") || color.equals("yellow")) {
            System.out.println("Slow down.");
        } else if (color.equals("Green") || color.equals("green")) {
            System.out.println("Go.");
        } else {
            System.out.println("Invalid color.");
        }
    }
}
