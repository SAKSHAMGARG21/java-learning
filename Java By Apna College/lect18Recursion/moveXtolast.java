public class moveXtolast {

    public static void movextolast(String str, int idx, int cout, String newstr) {

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
            movextolast(str, idx + 1, cout, newstr);
        } else {
            newstr += currchar;
            movextolast(str, idx + 1, cout, newstr);
        }
    }

    public static void main(String[] args) {
        String str = "dfaxxswxx";
        movextolast(str, 0, 0, "");
    }
}
