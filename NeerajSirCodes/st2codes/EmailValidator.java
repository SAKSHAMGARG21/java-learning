import java.util.Scanner;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class EmailValidator {
    public static void emailValidator(String email) {
        // Write your code here
        int es = email.length();
        int dotidx = email.indexOf(".");
        int atidx = email.indexOf("@");
        int lastdotidx = email.lastIndexOf(".");
        int lastatidx = email.lastIndexOf("@");

        if (dotidx == -1 || atidx == -1 || lastatidx==es-1 || lastdotidx==es-1) {
            System.out.println("Invalid vaild");
            return;
        }

        for (int i = 0; i < email.length(); i++) {
            if (dotidx > 0 && atidx > 0 && dotidx < es && atidx < es) {
                if (dotidx < atidx - 1 || atidx + 1 < dotidx) {
                    System.out.println("Valid Email");
                    return;
                } else {
                    System.out.println("Invalid email");
                    return;
                }
            } else {
                System.out.println("Invalid email");
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        emailValidator(email);
        // System.out.println("Valid Email");
        // try {
        // } catch (MyException e) {
        //     System.out.println("Error " + e.getMessage());
        // }
    }
}