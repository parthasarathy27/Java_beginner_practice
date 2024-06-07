package Returnkeyword;

public class Shop {

    int soap(int given) {
        int soap_price = 15;
        int reduce = given - soap_price;
        return reduce;
    }
    

    public static void main(String[] args) {
        Shop obj1 = new Shop();
        int remainder = obj1.soap(20);
        System.out.print(remainder);
    }
}
