import java.lang.reflect.Array;
import java.util.*;

public class q3uniqueCharsubString {
    public static boolean checkstr(String str) {
        Map<Character, Integer> mp = new HashMap<>();
        for (char ch : str.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> et : mp.entrySet()) {
            if (et.getValue() > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < n - 3; i++) {
            String temp = "";
            for (int j = i; j < i + 4; j++) {
                temp += str.charAt(j);
            }
            arr.add(temp);
        }
        ArrayList<String> res = new ArrayList<>();
        for (String st : arr) {
            if (checkstr(st)) {
                res.add(st);
            }
        }
        System.out.println(res);
        System.out.println(res.size());
    }
}
