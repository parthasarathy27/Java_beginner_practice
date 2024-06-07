package Returnkeyword;

public class name {

    String getname() {
        return "john";
    }

    int getphone(int phone) {
        return phone;
    }
    

    public static void main(String[] args) {
        name obj1 = new name();
        String name = obj1.getname();
        int phone = obj1.getphone(1234567890);
        System.out.println("Name is: " + name);
        System.out.println("Phone number is: " + phone);
    }
}
