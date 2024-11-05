public class permutations {
    public static void printpermute(String str, int idx, String perm) {

        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i + 1);
            printpermute(rem, idx + 1, perm + ch);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printpermute(str, 0, "");
    }
}
