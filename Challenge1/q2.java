// Get input for variable: Name, Age and Address And print it

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String Name = input.nextLine();
        System.out.print("Enter your Age: ");
        int Age = input.nextInt();
        input.nextLine();
        System.out.print("Enter your Address: ");
        String Address = input.nextLine();
        System.out.println("My Name is: " + Name + "\n" + "My Age is: " + Age);
        System.out.println("My Address is: " + Address);
    }
}