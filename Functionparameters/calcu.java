package Functionparameters;

public class calcu {

    void add(int a, int b) {
        System.out.println("Sum of two numbers is" + " " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("Subtraction of two numbers is" + " " + (a - b));
    }

    void mul(int a, int b) {
        System.out.println("Multiplication of two numbers is" + " " + (a * b));
    }

    void div(int a, int b) {
        System.out.println("Division of two numbers is" + " " + (a / b));
    }

    public static void main(String[] args) {
        calcu obj1 = new calcu();
        obj1.add(20, 40);
        obj1.sub(50, 20);
        obj1.mul(10, 5);
        obj1.div(100, 10);
    }
}
