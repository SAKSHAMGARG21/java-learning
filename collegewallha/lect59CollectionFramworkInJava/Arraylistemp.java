import java.util.*;

public class Arraylistemp {

    static void ArrayListExamples() {
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
    }

    static void StackExamples() {

        Stack<String> st = new Stack<>();
        st.push("pw");
        st.push("skills");
        System.out.println(st.peek()); // skills
        System.out.println(st.pop()); // skills (will also remove it)
        System.out.println(st.peek()); // pw
        System.out.println(st.size()); // 1
        System.out.println(st.empty()); // false
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        ArrayListExamples();
        StackExamples();
    }

}
