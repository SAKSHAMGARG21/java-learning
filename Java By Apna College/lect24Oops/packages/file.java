import Bank.*;

public class file {
    public static void main(String[] args) {
        Account obj1 = new Account();
        obj1.name = "tony";
        System.out.println(obj1.name); // You can't access password directly, it's not a good practice

        obj1.setpass(2134);
        System.out.println(obj1.getpass());
    }
}