import java.util.*;

public class stringPlan {

    public static boolean isPlan(String str) {
        // char[] arr = str.toCharArray();
        int i = 0;
        int e = str.length() - 1;
        while (i <= e) {
            if (!String.valueOf(str.charAt(i)).equalsIgnoreCase(String.valueOf(str.charAt(e)))) {
                return false;
            }
            i++;
            e--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder();
        String[] arrStr = s.split("\\s+");
        int c = 0;
        for (String string : arrStr) {
            if (isPlan(string) && string.length() > 1) {
                c++;
            }
        }
        System.out.println("Number of palindromes:  " + c);
    }
}
