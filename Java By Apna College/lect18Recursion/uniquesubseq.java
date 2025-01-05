import java.util.HashSet;

public class uniquesubseq {

    public static void subsequence(String str, int idx, String newstr, HashSet<String> set) {
        if (idx >= str.length()) {
            if (!set.contains(newstr)) {
                System.out.println(newstr);
                set.add(newstr);
            }
            return;
        }
        char ch = str.charAt(idx);
        subsequence(str, idx + 1, newstr + ch, set);
        subsequence(str, idx + 1, newstr, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequence(str, 0, "", set);
    }
}
