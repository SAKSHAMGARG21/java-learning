import java.util.HashSet;

public class subsequnce {
    public static void subsequence(String str, int idx, String newstr) {
        if (idx >= str.length()) {
            System.out.println(newstr);
            return;
        }
        char ch = str.charAt(idx);
        subsequence(str, idx + 1, newstr + ch);
        subsequence(str, idx + 1, newstr);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequence(str, 0, "");
    }
}