import java.util.*; // import all classes from java.util package

public class ArrayList1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Create a List of Integers (ArrayList is a type of List)
        List<Integer> arr = new ArrayList<>();
        
        // Add elements to the list
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(9);
        arr.add(6);
        
        // Print the entire list
        System.out.println(arr);
        
        // Get the element at index 2 and store it in the variable ele
        int ele = arr.get(2);
        System.out.println(ele);
        
        // Set the element at index 1 to 7
        arr.set(1, 7);
        System.out.println(arr);
        
        // Add the element 1 at index 2
        arr.add(2, 1);
        System.out.println(arr);
        
        // Remove the element at index 3
        arr.remove(3);
        System.out.println(arr);
        
        // Get the size of the list
        int sz = arr.size();
        
        // Print each element of the list using a for loop
        for (int i = 0; i < sz; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        
        // Sort the list in ascending order using the Collections.sort() method
        Collections.sort(arr);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}