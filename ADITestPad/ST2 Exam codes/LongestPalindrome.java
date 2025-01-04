import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int mx = -1;
        int st = 0;
        int n = str.length();
        if (n <= 1)
            System.out.println(str);
        for (int i = 0; i < n; i++) {
            int l = i, r = i;
            while (l >= 0 && r < n && str.charAt(l) == str.charAt(r)) {
                l--;
                r++;
            }

            int len = r - l - 1;
            if (len > mx) {
                mx = len;
                st = l + 1;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            int l = i, r = i + 1;
            while (l >= 0 && r < n && str.charAt(l) == str.charAt(r)) {
                l--;
                r++;
            }

            int len = r - l - 1;
            if (len > mx) {
                mx = len;
                st = l + 1;
            }
        }
        // System.out.println(st + " " + mx);

        System.out.println(str.substring(st, st + mx));
    }
}
