import java.util.*;

public class Hotal {
    int Tea = 10;
    int Coffee = 20;
    int vada = 6;

    public static void main(String[] args) {
        System.out.println("Welcome to Hotal");
        System.out.println("Actual Price: ");

        Hotal server = new Hotal();

        System.out.println("Tea: " + server.Tea);
        System.out.println("Coffee: " + server.Coffee);
        System.out.println("Vada: " + server.vada);

        //Hotal One
        System.out.println("Hotal1 Price");

        Hotal server1 = new Hotal();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Tea Price: ");
        server1.Tea = sc.nextInt();
        System.out.println("Tea: " + server1.Tea);

        //Hotal Two
        System.out.println("Hotal2 Price");

        Hotal server2 = new Hotal();

        System.out.println("Enter Coffee Price: ");
        server2.Coffee = sc.nextInt();
        System.out.println("Coffee: " + server2.Coffee);
    }
}
