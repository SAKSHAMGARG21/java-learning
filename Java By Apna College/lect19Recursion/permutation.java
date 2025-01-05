import java.util.*;
public class permutation {
    public static void permute(String str, String permt) {

        if (str.length() == 0) {
            System.out.println(permt);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            permute(newstr, permt + ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permute(str, "");
    }
}
