/*
 * - Create a class called "School" with main fuction.
 * - Create a fuction called "passorfail" which sould return the stringtky "Pass" or "Fail".
 * - Inside Main fuciton get integer input form user for total marks.
 * - Pass that input to the passorfail fuction and let the fuction decide whether the student has passed or failed.
 */
import java.util.*;
import java.util.Scanner;

public class School {

    String passorfail(int totalMarks) {
        if (totalMarks >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total marks: ");
        int totalMarks = input.nextInt();
        School obj = new School();
        String result = obj.passorfail(totalMarks);
        System.out.println(result);
    }
}
