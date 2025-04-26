import java.util.*;

public class Arraylistrun {
    
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Cherry");
        arrayList.add("Banana");

        Collections.reverse(arrayList);
        System.out.println("ArrayList: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("ArrayList: " + arrayList);
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Element at index 1: " + arrayList.get(1));
        arrayList.set(1, "Blueberry");
        arrayList.add(0, "Grapes");
        System.out.println("After setting index 1 to 'Blueberry': " + arrayList);
        System.out.println(arrayList.size());
        arrayList.remove("Apple");
        System.out.println("After removing 'Apple': " + arrayList);
        System.out.println("Size: " + arrayList.size());
        System.out.println("Contains 'Cherry': " + arrayList.contains("Cherry"));
        arrayList.clear();
        System.out.println("After clearing: " + arrayList);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(3);
        arr.add(6);

        System.out.println(arr.size());
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr.size());
        System.out.println(arr);

        // ! Create an ArrayList
        // ArrayList<String> arrayList = new ArrayList<>();
        // arrayList.add("Apple");
        // arrayList.add("Banana");
        // arrayList.add("Cherry");

        // ! Convert ArrayList to array
        // String[] array = new String[arrayList.size()];
        // arrayList.toArray(array);

        // ! Print the array
        // for (String item : array) {
        // System.out.println(item);
        // }
    }
}