import java.util.*;
class Solution {
    public void swap(ArrayList<Integer> nums,int a,int b){
        int t= nums.get(a);
        nums.set(a,nums.get(b));
        nums.set(b,t);
    }
    public void solve(ArrayList<Integer> nums,int idx, ArrayList<ArrayList<Integer>> perm){
        
        if (idx >= nums.size()){
            perm.add(new ArrayList<>(nums));
        }

        for (int i=idx;i<nums.size();i++){
            swap(nums,i,idx);
            solve(nums,idx+1,perm);
            swap(nums,i,idx);
        }
    }

    // this is premutation of the arraylist 
    public void Permutation(int[] nums) {
        int n= nums.length;
        ArrayList<ArrayList<Integer>> perm = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i:nums){
            arr.add(i);
        }
        solve(arr,0,perm);

        
        for(ArrayList<Integer> i : perm ){
            System.out.println(i);
        }
    }
}
public class permutation {
    public static void permute(String str, String permt) {

        if (str.length() == 0) {
            System.out.println(permt);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            permute(newstr, permt + ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permute(str, "");
    }
}
