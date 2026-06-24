
import java.util.*;

public class q4RemoveOccurrences {
    public static String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replace(part, "");
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String part = scanner.nextLine();
        String result = removeOccurrences(s, part);
        System.out.println(result);
    }
}
