// import java.util.*;

// class Result {
//     public static void findsubSets(int a[], int idx, List<Integer> subarr, int n, List<List<Integer>> arr) {
//         if (idx >= n) {
//             arr.add(new ArrayList<>(subarr));
//             return;
//         }

//         // exclude
//         findsubSets(a, idx + 1, subarr, n, arr);

//         // include
//         int ele = a[idx];
//         subarr.add(ele);
//         findsubSets(a, idx + 1, subarr, n, arr);

//         subarr.remove(subarr.size() - 1);// backtrack
//     }

//     static int subsetSum(int a[], int n, int sum) {

//         // Write your code here
//         List<List<Integer>> arr = new ArrayList<>();
//         List<Integer> subarr = new ArrayList<>();
//         findsubSets(a, 0, subarr, n, arr);

//         for (List<Integer> lst : arr) {
//             int subsum = 0;
//             for (int i : lst) {
//                 subsum += i;
//             }

//             if (sum == subsum) {
//                 return 1;
//             }
//         }

//         return 0;
//     }
// }

// public class subsumarr {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         int[] arr = new int[m];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int res = Result.subsetSum(arr, m, n);
//         System.out.println(res);
//     }
// }


import java.util.*;

class subsumarr {
    static boolean findsubSets(int a[], int idx, int subarr, int n, int sum) {
        if (idx >= n) {
            return sum == subarr;
        }

        // exclude
        if (findsubSets(a, idx + 1, subarr, n, sum)) {
            return true;
        }

        // include
        if (findsubSets(a, idx + 1, a[idx] + subarr, n, sum)) {
            return true;
        }

        return false;
    }

    static int subsetSum(int a[], int n, int sum) {
        return findsubSets(a, 0, 0, n, sum) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the sum to check: ");
        int sum = sc.nextInt();

        int result = subsetSum(a, n, sum);

        if (result == 1) {
            System.out.println("There exists a subset with the given sum.");
        } else {
            System.out.println("No subset with the given sum found.");
        }

        sc.close();
    }
}
