import java.util.HashMap;

// Key Points:
// Allows null values and one null key.
// Not synchronized (not thread-safe).
// Does not maintain insertion order.
public class hashmaptut {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);

        for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        System.out.println("HashMap: " + hashMap);
        System.out.println("HashMap size: " + hashMap.size());

        // Accessing elements
        System.out.println("Value for key 'Apple': " + hashMap.get("Apple"));

        // Removing elements
        hashMap.remove("Banana");
        System.out.println("After removing 'Banana': " + hashMap);

        System.out.println("HashMap: " + hashMap);
        System.out.println("Value for key 'Apple': " + hashMap.get("Apple"));
        hashMap.remove("Banana");
        System.out.println("After removing 'Banana': " + hashMap);
        System.out.println("Contains key 'Cherry': " + hashMap.containsKey("Cherry"));
        System.out.println("Contains value 2 : " + hashMap.containsValue(2));
        System.out.println("Keys: " + hashMap.keySet());
        System.out.println("Values: " + hashMap.values());
        System.out.println("Entries: " + hashMap.entrySet());
    }
}
