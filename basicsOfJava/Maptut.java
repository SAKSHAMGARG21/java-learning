import java.util.Map;
import java.util.HashMap;

public class Maptut {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("Map: " + map);
        System.out.println("Value for key 'Two': " + map.get("Two"));
        map.remove("Two");
        System.out.println("After removing 'Two': " + map);
        System.out.println("Contains key 'One': " + map.containsKey("One"));
        System.out.println("Contains value 3: " + map.containsValue(3));
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());

        // output
        // One = 1
        // Two = 2
        // Three = 3
        // Map: {One=1, Two=2, Three=3}
        // Value for key 'Two': 2
        // After removing 'Two': {One=1, Three=3}
        // Contains key 'One': true
        // Contains value 3: true
        // Keys: [One, Three]
        // Values: [1, 3]
        // Entries: [One=1, Three=3]
    }
}
