// Get input for variable: Name and Age and print it?

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String Name = input.nextLine();
        System.out.print("Enter your Age: ");
        int Age = input.nextInt();
        System.out.println("My Name is " + Name + "\n" + "My Age is " + Age);
    }
}