import java.util.*;

class Solution {

    public String getFreqofStr(String str) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey() + ":" + entry.getValue() + ", ");
        }
        return sb.toString().substring(0, sb.length() - 2);
    }
}

public class file {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Solution ob = new Solution();

        System.out.println(ob.getFreqofStr(str));
    }
}
