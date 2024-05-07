public class Laptop {
    String brandname = "";
    String Processor = "";
    String Ram = "";
    int price = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Laptop Store");
        System.out.println("*************************");
        System.out.println("Laptop1 Price");
        System.out.println("*************************");

        Laptop server = new Laptop();

        server.brandname = "Dell";
        server.Processor = "i5";
        server.Ram = "8GB";
        server.price = 50000;

        System.out.println("Brand Name: " + server.brandname);
        System.out.println("Processor: " + server.Processor);
        System.out.println("Ram: " + server.Ram);
        System.out.println("Price: " + server.price);

        //Laptop One
        System.out.println("*************************");
        System.out.println("Laptop2 Price");
        System.out.println("*************************");

        Laptop server1 = new Laptop();

        server1.brandname = "HP";
        server1.Processor = "i3";
        server1.Ram = "4GB";
        server1.price = 30000;

        System.out.println("Brand Name: " + server1.brandname);
        System.out.println("Processor: " + server1.Processor);
        System.out.println("Ram: " + server1.Ram);
        System.out.println("Price: " + server1.price);

        //Laptop Two
        System.out.println("*************************");
        System.out.println("Laptop3 Price");
        System.out.println("*************************");

        Laptop server2 = new Laptop();

        server2.brandname = "Lenovo";
        server2.Processor = "i7";
        server2.Ram = "16GB";
        server2.price = 70000;

        System.out.println("Brand Name: " + server2.brandname);
        System.out.println("Processor: " + server2.Processor);
        System.out.println("Ram: " + server2.Ram);
        System.out.println("Price: " + server2.price);
    }
}
