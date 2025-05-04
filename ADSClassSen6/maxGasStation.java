// import java.util.*;

// public class maxGasStation {

//     public static double maxDistanceBwGasStation(int k, int[] arr) {
//         double mxdiff = -1;
//         ArrayList<Double> temp = new ArrayList<>();
//         for (int i : arr) {
//             temp.add((double) i);
//         }

//         for (int j = 0; j < k; j++) {
//             int mxidx = 0;
//             mxdiff = -1; // Resetting the maximum difference for each iteration
//             for (int i = 1; i < temp.size(); i++) {
//                 double diff = temp.get(i) - temp.get(i - 1);
//                if (diff > mxdiff) {
//                     mxdiff = diff;
//                     mxidx = i;
//                 }
//             }
//             double num = temp.get(mxidx - 1) + mxdiff / 2;
//             temp.add(mxidx, num);
//         }

//         mxdiff = -1; // Resetting the maximum difference to find the final result
//         for (int i = 1; i < temp.size(); i++) {
//             double diff = temp.get(i) - temp.get(i - 1);
//             if (diff > mxdiff) {
//                 mxdiff = diff;
//             }
//         }
//         return mxdiff;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int k = sc.nextInt();
//         System.out.println(maxDistanceBwGasStation(k, arr));
//     }
// }

import java.util.*;

public class maxGasStation {

    public static double maxDistanceBwGasStation(int k, int[] arr) {
        Arrays.sort(arr);
        PriorityQueue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 1; i < arr.length; i++) {
            maxHeap.offer((double) (arr[i] - arr[i - 1]));
        }

        for (int j = 0; j < k; j++) {
            double maxGap = maxHeap.poll();
            maxHeap.offer(maxGap / 2);
            maxHeap.offer(maxGap / 2);
        }

        return maxHeap.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(maxDistanceBwGasStation(k, arr));
    }
}
