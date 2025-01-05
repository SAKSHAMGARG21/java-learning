import java.util.*;;

public class file {

    public static char toLowercase(char ch) {

        if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
            return ch;
        } else {
            // return Character.toLowerCase(ch);
            return (char) ((int) ch - (int) 'A' + (int) 'a');
        }
    }

    public static boolean valid(char ch) {
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }

    public static boolean checkPlandrome(String res) {
        int s = 0;
        int e = res.length() - 1;

        while (s <= e) {
            if (res.charAt(s) != res.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static boolean isPlaindrome(String str) {
        int n = str.length();

        String validstr = "";
        for (int i = 0; i < n; i++) {
            if (valid(str.charAt(i))) {
                validstr += str.charAt(i);
            }
        }

        // System.out.println("valid string -> " + validstr);

        String res = "";
        for (int i = 0; i < validstr.length(); i++) {
            res += toLowercase(validstr.charAt(i));
        }
        // System.out.println("res string ->" + res);
        return checkPlandrome(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        String str = "N2 i&nJA?a& jnI2n";
        System.out.println(isPlaindrome(str) ? true : false);

    }
}
