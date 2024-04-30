/* Question: What is the score in a game?
 * - if the score is less than 50, print "You need to improve."
 * - if the score is between 50 and 70 (inclusive), print "Good job!"
 * - if the score is greater than 70, print "Excellent performance!"
 */

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score = input.nextInt();
        if (score < 50) {
            System.out.print("You need to improve.");
        } else if (score >= 50 && score <= 70) {
            System.out.print("Good job!");
        } else if(score > 70) {
            System.out.print("Excellent performance!");
        } else {
            System.out.print("Invalid score.");
        }
    }
}
