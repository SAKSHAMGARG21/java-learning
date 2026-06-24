import java.util.HashMap;

public class DistinctCharsInWindow {
    public static void countDistinctInWindow(String s, int k) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int distinctCount = 0;

        for (int i = 0; i < s.length(); i++) {
            // Add new character to the window
            freqMap.put(s.charAt(i), freqMap.getOrDefault(s.charAt(i), 0) + 1);
            if (freqMap.get(s.charAt(i)) == 1) distinctCount++;

            // Remove character that goes out of the window
            if (i >= k) {
                char leftChar = s.charAt(i - k);
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                if (freqMap.get(leftChar) == 0) distinctCount--;
            }

            if (i >= k - 1) System.out.print(distinctCount + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        countDistinctInWindow("aabcda", 3); // Output: 2 3 3 3
    }
}
