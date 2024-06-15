import java.util.*;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String Sent = input.nextLine();
        String Last="";
        char Final;
        for(int i = 0; i < Sent.length(); i++) {
            Final = Sent.charAt(i);
            Last = Final+Last;
        }
        System.out.print("Reversed Sentence : " + Last);
    }
}
