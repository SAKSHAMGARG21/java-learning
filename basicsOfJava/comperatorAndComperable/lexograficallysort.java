
import java.util.*;

class lexograficallysort {
    public void swap(ArrayList<Integer> nums, int a, int b) {
        int t = nums.get(a);
        nums.set(a, nums.get(b));
        nums.set(b, t);
    }

    public void solve(ArrayList<Integer> nums, int idx, ArrayList<ArrayList<Integer>> perm) {
        if (idx >= nums.size()) {
            perm.add(new ArrayList<>(nums)); // Store a copy
            return;
        }

        for (int i = idx; i < nums.size(); i++) {
            swap(nums, i, idx);
            solve(nums, idx + 1, perm);
            swap(nums, i, idx); // Backtrack
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        ArrayList<ArrayList<Integer>> perm = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : nums) {
            arr.add(i);
        }
        solve(arr, 0, perm);

        // Sort permutations lexicographically
        Collections.sort(perm, (a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });

        int idx = 0;
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i).equals(arr)) {
                idx = i;
                break;
            }
        }

        // Set nums to the next permutation or wrap around
        ArrayList<Integer> nextPerm = (idx + 1 < perm.size()) ? perm.get(idx + 1) : perm.get(0);
        for (int i = 0; i < n; i++) {
            nums[i] = nextPerm.get(i);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 2, 3 };
        sol.nextPermutation(nums);
        System.out.println(Arrays.toString(nums)); // Output: [1, 3, 2]
    }
}