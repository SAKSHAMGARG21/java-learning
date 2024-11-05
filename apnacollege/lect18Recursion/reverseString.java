public class reverseString {
    public static void revstr(String str, int i, StringBuilder sb) {
        if (i >= str.length()) {
            return;
        }

        char ch = str.charAt(i);
        revstr(str, i + 1, sb);
        sb.append(ch);
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        revstr(str, 0, sb);
        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "Hello";
        String reversed = reverse(str);
        System.out.println(reversed);
    }
}
