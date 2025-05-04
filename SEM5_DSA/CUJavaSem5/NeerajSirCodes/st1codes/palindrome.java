import java.util.*;

public class palindrome {

    public static boolean plan(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        String s = sc.nextLine();
        boolean ans = plan(s);
        if (ans) {
            System.out.println("is palindrme");
        } else {
            System.out.println("not plaindrome");
        }
    }
}
