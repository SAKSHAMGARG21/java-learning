// import java.util.Arrays;
// import java.util.HashMap;

// public class removeDuplicateChar {

//     public static void remDupChar(String str, int idx, Boolean[] arr) {
//         if (idx >= str.length()) {
//             return;
//         }
//         char ch = str.charAt(idx);
//         int i = ch - 'a';
//         arr[i] = true;

//         remDupChar(str, idx + 1, arr);
//     }

//     public static void main(String[] args) {

//         String str = "abbccdd";

//         Boolean[] arr = new Boolean[26];
//         Arrays.fill(arr, false);
//         remDupChar(str, 0, arr);

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i]) {
//                 char ch = (char) (i + 'a');
//                 System.out.print(ch);
//             }
//         }
//     }
// }
import java.util.HashMap;

public class removeDuplicateChar {
    public static boolean[] mp = new boolean[26];

    public static void remDupChar(String str, int idx, StringBuilder newstr) {
        if (idx >= str.length()) {
            System.out.println(newstr.toString());
            return;
        }
        char ch = str.charAt(idx);
        if (mp[ch - 'a']) {
            remDupChar(str, idx + 1, newstr);
        } else {
            newstr.append(ch);
            mp[ch - 'a'] = true;
            remDupChar(str, idx + 1, newstr);
        }
    }

    public static void main(String[] args) {
        String str = "abbccdd";
        StringBuilder newstr = new StringBuilder();
        remDupChar(str, 0, newstr);
    }
}
