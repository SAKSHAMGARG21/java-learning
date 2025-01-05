public class moveXtolast {

    public static void movealtolast(String str, int idx, int cout, String newstr) {

        if (idx >= str.length()) {
            for (int i = 0; i < cout; i++) {
                newstr += 'x';
            }
            System.out.print(newstr);
            return;
        }

        char currchar = str.charAt(idx);
        if (currchar == 'x') {
            cout++;
            movealtolast(str, idx + 1, cout, newstr);
        } else {
            newstr += currchar;
            movealtolast(str, idx + 1, cout, newstr);
        }
    }

    public static void main(String[] args) {
        String str = "dfaxxswxx";
        movealtolast(str, 0, 0, "");
    }
}
