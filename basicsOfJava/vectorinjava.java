import java.util.*;

public class vectorinjava {
    public static void main(String[] args) {
        // Create a new vector
        Vector<Integer> vector = new Vector<>();

        // Add elements to the vector
        vector.add(1);
        vector.add(2);
        vector.add(3);

        // Insert an element at index 1
        vector.add(1, 4);

        // Remove the element at index 2
        vector.remove(2);

        // Print the elements of the vector
        System.out.println("Vector elements:");
        for (int i : vector) {
            System.out.println(i);
        }

        Collections.sort(vector);
        System.out.println(vector);
        Collections.reverse(vector);
        System.out.println(vector);

        // Check the size of the vector
        System.out.println("Vector size: " + vector.size());

        // Check if the vector is empty
        System.out.println("Is vector empty? " + vector.isEmpty());

        // Clear the vector
        vector.clear();
        System.out.println("Vector cleared. Is vector empty? " + vector.isEmpty());

        // Vector<String> vector = new Vector<>();
        
        // // Add elements to the vector
        // vector.add("Apple");
        // vector.add("Banana");
        // vector.add("Cherry");
        
        // // Get elements from the vector
        // String firstElement = vector.get(0); // "Apple"
        // String secondElement = vector.get(1); // "Banana"
        // String thirdElement = vector.get(2); // "Cherry"
        
        // // Print the elements
        // System.out.println("First element: " + firstElement);
        // System.out.println("Second element: " + secondElement);
        // System.out.println("Third element: " + thirdElement);
    }
}
