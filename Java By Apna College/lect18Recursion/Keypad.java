public class Keypad {

    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printconbo(String str, int idx, String comb) {

        if (idx >= str.length()) {
            System.out.println(comb);
            return;
        }

        char curchar = str.charAt(idx);
        String curword = keypad[curchar - '0'];

        for (int i = 0; i < curword.length(); i++) {
            printconbo(str, idx + 1, comb + curword.charAt(i));
        }
    }

    public static void main(String[] args) {

        String str = "23";
        printconbo(str, 0, "");

    }
}
