public class lps {
    public String findlong(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return s.substring(i + 1, j);
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            String odd = findlong(s, i, i);
            String even = findlong(s, i, i + 1);
            if (odd.length() > ans.length())
                ans = odd;
            if (even.length() > ans.length())
                ans = even;
        }
        return ans;
    }

    public static void main(String[] args) {
        lps l = new lps();
        String s = "babad";
        System.out.println(l.longestPalindrome(s));
    }
}
