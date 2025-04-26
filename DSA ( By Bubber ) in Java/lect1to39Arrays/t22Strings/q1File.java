import java.util.*;;

public class q1File {

    public static char toLowercase(char ch) {

        if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
            return ch;
        } else {
            // return Character.toLowerCase(ch);
            return (char) ((int) ch - (int) 'A' + (int) 'a');
        }
    }

    public static boolean valid(char ch) {
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }

    public static boolean checkPlandrome(String res) {
        int s = 0;
        int e = res.length() - 1;

        while (s <= e) {
            if (res.charAt(s) != res.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static boolean isPlaindrome(String str) {
        int n = str.length();

        String validstr = "";
        for (int i = 0; i < n; i++) {
            if (valid(str.charAt(i))) {
                validstr += str.charAt(i);
            }
        }

        // System.out.println("valid string -> " + validstr);

        String res = "";
        for (int i = 0; i < validstr.length(); i++) {
            res += toLowercase(validstr.charAt(i));
        }
        // System.out.println("res string ->" + res);
        return checkPlandrome(res);
    }

    /* -------------------------------------------------------------------------- */
    public static String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        while (sb.length() != 0 && sb.indexOf(part) != -1 && sb.indexOf(part) < sb.length()) {
            sb.delete(sb.indexOf(part), sb.indexOf(part) + part.length());
        }
        return sb.toString();
    }

    /* -------------------------------------------------------------------------- */
    public static boolean checkprem(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int[] arr1 = new int[26];
        for (int i = 0; i < n; i++) {
            int idx = s1.charAt(i) - 'a';
            arr1[idx]++;
        }

        int win = n;
        int j = 0;
        int[] arr2 = new int[26];
        while (j < win && j < m) {
            int idx = s2.charAt(j) - 'a';
            arr2[idx]++;
            j++;
        }

        if (checkprem(arr1, arr2))
            return true;

        while (j < m) {
            int idx = s2.charAt(j) - 'a';
            arr2[idx]++;

            idx = s2.charAt(j - win) - 'a';
            arr2[idx]--;
            if (checkprem(arr1, arr2))
                return true;
            j++;
        }
        return false;
    }

    /* -------------------------------------------------------------------------- */
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && c == stack.peek()) {
                stack.pop(); // If current character is a duplicate, pop the previous character
            } else {
                stack.push(c); // Otherwise, push the current character onto the stack
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop()); // Build the result string by popping characters from the stack
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // String str = "N2 i&nJA?a& jnI2n";
        // System.out.println(isPlaindrome(str) ? true : false);

        // StringBuilder str = new StringBuilder("my name is saksham");
        // String newstr=str.replace(2, 4, "@40");
        // System.out.println(str);
        // String str = "my name is saksham";
        // String newstr = str.replace(" ", "@40");
        // System.out.println(newstr);

        // String str = "daabcbaabcbc";
        // String part = "abc";
        // String res = removeOccurrences(str, part);
        // System.out.println(res);

        // String str1 = "ab";
        // String str2 = "eidbaooo";
        // System.out.println(checkInclusion(str1,str2));

        // String str1 = "abbaca";
        // System.out.println(removeDuplicates(str1));

        

    }
}
