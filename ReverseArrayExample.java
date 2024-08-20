import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayExample {
    public static void reverse(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        Collections.reverse(list);
        // Convert list back to array
        list.toArray(array);
    }

    public static String sortSentence(String s) {
        char[] chstr = s.toCharArray();
        String res = new String();
        int n = chstr.length;
        // System.out.println(n);
        int k = 1;
        for (int l = 0; l < 10; l++) {
            int ls = 0;
            System.out.print(k + " ");
            for (int i = 0; i < n; i++) {
                char ch = chstr[i];
                if (ch == ' ') {
                    int sch = chstr[i - 1] - '0';
                    if (sch == k) {
                        int st = ls, e = i - 2;
                        for (int j = st; j <= e; j++) {
                            res += chstr[j];
                        }
                        res += ' ';
                        k++;
                        break;
                    }
                    ls = i + 1;
                }
            }
            System.out.println();
        }
        return res;
    }

    public static void main(String[] args) {
        // Integer[] array = {1, 2, 3, 4, 5};
        // System.out.println("Original array: " + Arrays.toString(array));
        // reverse(array);
        // System.out.println("Reversed array: " + Arrays.toString(array));

        // String str = "World";
        // char ch = 'H';

        // System.out.println(str.charAt(2));
        // char[] st = str.toCharArray();
        // String result = new String();
        // for (char c : st) {
        // result += c;
        // }
        // char[] fst = result.toCharArray();
        // Arrays.sort(fst);
        // System.out.println(fst);

        // String str = "Hello";
        // char ch = '!';
        // String result = str + ch;
        // System.out.println(result);

        // String s = new String("lEetcOde");
        // String t = new String();
        // String vow = "aeiouAEIOU";
        // int cnt = 0;
        // char[] charr = s.toCharArray();
        // // System.out.println(s.charAt(1));
        // for (int i = 0; i < charr.length; i++) {
        // if (vow.indexOf(charr[i]) != -1) {
        // t += s.charAt(i);
        // cnt++;
        // }
        // }

        // char[] ch = t.toCharArray();
        // Arrays.sort(ch);

        // int l = 0;
        // for (int i = 0; i < charr.length; i++) {
        // if (vow.indexOf(charr[i]) != -1) {
        // charr[i] = ch[l++];
        // }
        // }

        // t = new String();
        // for (char c : charr) {
        // t += c;
        // }
        // System.out.println(t);

        String s = sortSentence("is2 sentence4 This1 a3");
        System.out.println(s);
    }
}
