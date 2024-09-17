import java.util.Scanner;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class EmailValidator {
    public static void emailValidator(String email) throws MyException {
        // Write your code here
        int es = email.length() - 1;
        int dotidx = email.indexOf(".");
        int atidx = email.indexOf("@");
        int lastdotidx = email.lastIndexOf(".");
        int lastatidx = email.lastIndexOf("@");

        if (dotidx == -1 || atidx == -1 || lastatidx == es || lastdotidx == es || dotidx == 0 || atidx ==  0 || dotidx == atidx - 1 || atidx + 1 == dotidx) {
            throw new MyException("Invalid Email");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        try {
            emailValidator(email);
            System.out.println("Valid Email");
        } catch (MyException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}