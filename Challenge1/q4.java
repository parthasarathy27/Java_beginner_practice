/* Det input 3 variables: Name, Score, Department. Let the user Enter the score
   for 100 Marks, You convert it for 10 and print it.
 */

 import java.util.Scanner;

class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String Name = input.nextLine();
        System.out.print("Enter your Score: ");
        double Score = input.nextInt();
        input.nextLine();
        System.out.print("Enter your Department: ");
        String Department = input.nextLine();
        System.out.println("My Name is: " + Name + "\n" + "My Score is: " + Score/10 + "/10");
        System.out.println("My Department is: " + Department);
    }
}