import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        // Creating a Map using HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        int value = map.get("Two"); // Returns 2
        System.out.println(value);
        map.remove("One");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Sample array
        int[] array = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };

        // Create a HashMap to store frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array
        for (int num : array) {
            // If the element is already in the map, increment its count
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // Otherwise, add the element with a count of 1
                frequencyMap.put(num, 1);
            }
        }

        // Print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
        System.out.println();

        // int[] arr = { 2, 4, 6, 64, 4, 7, 6, 4, 3, 56, 74 };
        int[] arr = { 2, 1, 2, 3, 3, 3, 4, 4, 4, 4 };

        Map<Integer, Integer> mp = new HashMap<>(); // randomly add values not
        // maintain insertion order
        // Map<Integer, Integer> mp = new LinkedHashMap<>(); // maintain the insertion
        // order
        // Map<Integer, Integer> mp = new TreeMap<>(); // add key in sorted manner

        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " ,Frequency: " + entry.getValue());
        }
    }
}
