/* - Create a class called "Find" with main fuction.
 * - Create a fuction called "evenorodd" with integer parameter called "int num".
 * - Inside Main fuciton get integer input form user.
 * - Pass that input to the evenorodd fuction and let the fuction decide whether the number is even or odd.
 */

import java.util.*;
import java.util.Scanner;

public class Find{

    void evenorodd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        Find obj = new Find();
        obj.evenorodd(number);
    }
}