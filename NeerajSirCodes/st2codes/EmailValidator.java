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


// import java.util.Scanner;

// class EmailValidator {
//     public static void main(String[] args) {
//         Scanner s1 = new Scanner(System.in);
//         String email = s1.nextLine();
//         s1.close();

//         if (isValidEmail(email)) {
//             System.out.print("Valid");
//         } else {
//             System.out.print("Invalid");
//         }
//     }

//     public static boolean isValidEmail(String email) {
//         int es = email.length() - 1;
//         int dotidx = email.indexOf(".");
//         int atidx = email.indexOf("@");
//         int lastdotidx = email.lastIndexOf(".");
//         int lastatidx = email.lastIndexOf("@");

//         // Basic checks
//         if (dotidx == -1 || atidx == -1 || lastatidx == es || lastdotidx == es || dotidx == 0 || dotidx == atidx - 1 || atidx + 1 == dotidx) {
//             return false;
//         }

//         // Check for multiple @ symbols
//         if (atidx != lastatidx) {
//             return false;
//         }

//         // Check for valid characters
//         String localPart = email.substring(0, atidx);
//         String domainPart = email.substring(atidx + 1);
//         if (!localPart.matches("[A-Za-z0-9._%+-]+") || !domainPart.matches("[A-Za-z0-9.-]+")) {
//             return false;
//         }

//         // Check for at least one dot in the domain part
//         if (domainPart.indexOf(".") == -1) {
//             return false;
//         }

//         return true;
//     }
// }
