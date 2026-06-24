// import java.util.*;

// class Item implements Comparable<Item> {
//     double weight, value, ratio;

//     public Item(double weight, double value) {
//         this.weight = weight;
//         this.value = value;
//         this.ratio = value / weight;
//     }

//     @Override
//     public int compareTo(Item other) {
//         return Double.compare(other.ratio, this.ratio);
//     }

//     @Override
//     public String toString() {
//         return "Item{weight=" + weight + ", value=" + value + ", ratio=" + ratio + "}";
//     }
// }

// public class FractionalKnapsack {
//     public static double getMaxValue(int[] weights, int[] values, int capacity) {
//         int n = weights.length;
//         List<Item> items = new ArrayList<>();

//         for (int i = 0; i < n; i++) {
//             items.add(new Item(weights[i], values[i]));
//         }

//         Collections.sort(items);
//         for(Item item:items)
//         System.out.println(item);

//         // hellow

//         double totalValue = 0.0;

//         for (int i = 0; i < n; i++) {
//             if (capacity - items.get(i).weight >= 0) {
//                 capacity -= items.get(i).weight;
//                 totalValue += items.get(i).value;
//             } else {
//                 double fraction = ((double) capacity / items.get(i).weight);
//                 totalValue += (items.get(i).value * fraction);
//                 break;
//             }
//         }

//         return totalValue;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] values = new int[n];
//         int[] weights = new int[n];

//         for (int i = 0; i < n; i++) {
//             values[i] = sc.nextInt();
//         }
//         for (int i = 0; i < n; i++) {
//             weights[i] = sc.nextInt();
//         }
//         int capacity = sc.nextInt();

//         double maxValue = getMaxValue(weights, values, capacity);
//         System.out.println("Maximum value we can obtain = " + maxValue);

//         sc.close();
//     }
// }


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Pair {
    double val, wt, ratio;
    
    public Pair(int f, int s) {
        this.val = f;
        this.wt = s;
        this.ratio = ((double) val / (double) wt);
    }
    
    @Override
    public String toString() {
        return "Item: [" + val + " " + wt + " " + ratio + "]";
    }
}

class Result {
    static double fractionalKnapsack(int val[], int weight[], int n, int capacity) {
        Pair[] items = new Pair[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Pair(val[i], weight[i]);
        }
        
        // Sort items based on the ratio in descending order
        Arrays.sort(items, new Comparator<Pair>() {
            @Override
            public int compare(Pair i, Pair j) {
                return Double.compare(j.ratio, i.ratio);
            }
        });
        
        // Print sorted items (optional, for debugging)
        for (Pair item : items) {
            System.out.println(item);
        }
        
        double totalVal = 0.0;
        
        for (int i = 0; i < n; i++) {
            if (capacity - items[i].wt >= 0) {
                capacity -= items[i].wt;
                totalVal += items[i].val;
            } else {
                double frac = (double) capacity / items[i].wt;
                totalVal += (frac * items[i].val);
                break;
            }
        }
        return totalVal;
    }

}
