class Solution {

    ArrayList<Integer> search(String pat, String S) {
        // your code here
        ArrayList<Integer> arr = new ArrayList<>();
        int id = 0;
        while (id != -1) {
            id = S.indexOf(pat, id);
            if (id != -1) {
                arr.add(id + 1);
                id++;
            }
        }

        return arr;
    }
}

public class zvalue {
    public static void main(String[] args) {

    }
}
