import java.util.*;

public class q2phonenumkeyPad {
    public static void solve(String str, int idx, List<String> res, StringBuilder temp, String[] map) {
        if (idx == str.length()) {
            res.add(temp.toString());
            return;
        }

        String mapstr = map[str.charAt(idx) - '0'-1];

        for (int i = 0; i < mapstr.length(); i++) {
            temp.append(mapstr.charAt(i));
            solve(str, idx + 1, res, temp, map);
            temp.deleteCharAt(temp.length() - 1); // Corrected line
        }
    }

    public static List<String> compute(String n) {
        List<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        String[] map = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        solve(n, 0, res, temp, map);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        List<String> res = compute(n);
        System.out.println(res);
    }
}
