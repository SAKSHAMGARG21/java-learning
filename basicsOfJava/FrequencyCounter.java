// import java.util.*;

// import java.util.HashMap;
// import java.util.Map;

// public class MapExample {
//     public static void main(String[] args) {
//         // Creating a Map using HashMap
//         Map<String, Integer> map = new HashMap<>();
//         map.put("One", 1);
//         map.put("Two", 2);
//         map.put("Three", 3);
//         int value = map.get("Two"); // Returns 2
//         System.out.println(value);
//         map.remove("One");
//         for (Map.Entry<String, Integer> entry : map.entrySet()) {
//             System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//         }
//     }
// }

// import java.util.HashMap;
// import java.util.Map;

// public class MapExample {
//     public static void main(String[] args) {
//         // Creating a Map using HashMap
//         Map<String, Integer> map = new HashMap<>();

//         // Adding elements to the Map
//         map.put("One", 1);
//         map.put("Two", 2);
//         map.put("Three", 3);

//         // Accessing elements
//         System.out.println("Value for key 'Two': " + map.get("Two"));

//         // Removing an element
//         map.remove("One");

//         // Iterating over the Map
//         for (Map.Entry<String, Integer> entry : map.entrySet()) {
//             System.out.println("Key: " + entry.getKey() + ", Value: " +
//                     entry.getValue());
//         }
//     }
// } 

// import java.util.HashMap;
// import java.util.Map;

// public class FrequencyCounter {
//     public static void main(String[] args) {
//         // Sample array
//         int[] array = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };

//         // Create a HashMap to store frequencies
//         Map<Integer, Integer> frequencyMap = new HashMap<>();

//         // Iterate through the array
//         for (int num : array) {
//             // If the element is already in the map, increment its count
//             if (frequencyMap.containsKey(num)) {
//                 frequencyMap.put(num, frequencyMap.get(num) + 1);
//             } else {
//                 // Otherwise, add the element with a count of 1
//                 frequencyMap.put(num, 1);
//             }
//         }

//         for (int i = 0; i < arr.length; i++) {
//             mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
//         }

//         // Print the frequency of each element
//         for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//             System.out.println("Element: " + entry.getKey() + ", Frequency: " +
//                     entry.getValue());
//         }
//         String s = sc.nextLine();

//         // String s="1234";
//         int rs = Integer.parseInt(s);
//         System.out.println(rs);
//     }
// }

import java.util.*;
public class FrequencyCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr ={2,4,6,64,4,7,6,4,3,56,74,};

        Map<Integer,Integer> mp=new HashMap<>();

        for (int num:arr){
            if (mp.containsKey(num)){
                mp.put(num, mp.get(num)+1);
            }else{
                mp.put(num,1);
            }
        }

        for (Map.Entry<Integer,Integer>  entry :mp.entrySet()){
            System.out.println("Element: "+entry.getKey()+" ,Frequency: "+entry.getValue());
        }

    }
}
