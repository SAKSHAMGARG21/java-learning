import java.util.*;
public class twoDArrayList {

    public static void main(String[] args) {
        // Create the 2D ArrayList
        ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();
    
        // Initialize the inner ArrayLists
        for (int i = 0; i < 3; i++) { // Example for 3 rows
            twoDList.add(new ArrayList<>());
        }
    
        // Add elements to the inner ArrayLists
        twoDList.get(0).add(1);
        twoDList.get(0).add(2);
        twoDList.get(1).add(3);
        twoDList.get(2).add(4);
    
        // Print the 2D ArrayList
        for (int i = 0; i < twoDList.size(); i++) {
            for (int j = 0; j < twoDList.get(i).size(); j++) {
                System.out.print(twoDList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    
}