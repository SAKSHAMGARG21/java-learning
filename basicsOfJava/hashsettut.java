import java.util.HashSet;

// Key Points:
// Does not allow duplicate elements.
// Allows null values.
// Not synchronized (not thread-safe).
// Does not maintain insertion order.
public class hashsettut {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // Duplicate element

        System.out.println("HashSet: " + hashSet);

        // Checking if an element exists
        System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));

        // Removing an element
        hashSet.remove("Banana");
        System.out.println("After removing 'Banana': " + hashSet);

        System.out.println("HashSet: " + hashSet);
        System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));
        hashSet.remove("Banana");
        System.out.println("After removing 'Banana': " + hashSet);
        System.out.println("Size: " + hashSet.size());
        System.out.println("Is empty: " + hashSet.isEmpty());
        hashSet.clear();
        System.out.println("After clearing: " + hashSet);
        // HashSet: [Apple, Cherry, Banana]
        // Contains 'Banana': true
        // After removing 'Banana': [Apple, Cherry]
        // HashSet: [Apple, Cherry]
        // Contains 'Banana': false
        // After removing 'Banana': [Apple, Cherry]
        // Size: 2
        // Is empty: false
        // After clearing: []
        
        // HashSet<String> hashSet = new HashSet<>();
        // hashSet.add("Apple");
        // hashSet.add("Banana");
        // hashSet.add("Cherry");

        // Iterator<String> iterator = hashSet.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

    }
}
