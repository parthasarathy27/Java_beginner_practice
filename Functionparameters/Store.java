public class Store {
    void getsoap(int money) {
        System.out.println("Soap is available" + " " + money + "Rs");
    }

    void getChocolate(int money) {
        System.out.println("Chocolate is available" + " " + money + "Rs");
    }

    public static void main(String[] args) {
        Store obj1 = new Store();
        obj1.getsoap(20);
        obj1.getChocolate(50);
    }
}