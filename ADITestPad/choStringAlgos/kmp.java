public class kmp {
    public static void main(String[] args) {
        String s = "abxabcabcaby";
        String p = "abcaby";

        System.out.println(s.contains(p) ? true : false);
    }
}
