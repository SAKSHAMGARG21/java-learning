// import java.util.*;

// class ItemValue {
//     Double cost;
//     double weight, value, index;

//     public ItemValue(int weight, int value, int index) {
//         this.weight = weight;
//         this.value = value;
//         this.index = index;
//         this.cost = new Double((double)value / (double)weight);
//     }
// }

// class FractionalKnapsack {
//     private static double getMaxValue(int[] wt, int[] val, int capacity) {
//         ItemValue[] itemValues = new ItemValue[wt.length];

//         for (int i = 0; i < wt.length; i++) {
//             itemValues[i] = new ItemValue(wt[i], val[i], i);
//         }

//         // Sorting items by value to weight ratio
//         Arrays.sort(itemValues, new Comparator<ItemValue>() {
//             @Override
//             public int compare(ItemValue o1, ItemValue o2) {
//                 return o2.cost.compareTo(o1.cost);
//             }
//         });

//         double totalValue = 0.0;

//         for (ItemValue i : itemValues) {
//             int curWt = (int) i.weight;
//             int curVal = (int) i.value;

//             if (capacity - curWt >= 0) {
//                 capacity = capacity - curWt;
//                 totalValue += curVal;
//             } else {
//                 double fraction = ((double) capacity / (double) curWt);
//                 totalValue += (curVal * fraction);
//                 capacity = (int) (capacity - (curWt * fraction));
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

import java.util.*;

class Item {
    double weight, value, ratio;

    public Item(double weight, double value) {
        this.weight = weight;
        this.value = value;
        this.ratio = value / weight;
    }

    @Override
    public String toString() {
        return "Item [weight=" + weight + ", value=" + value + ", ratio=" + ratio + "]";
    }
}

class knapsack {
    public static double getMaxValue(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        List<Item> items = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            items.add(new Item(weights[i], values[i]));
        }

        Collections.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double totalValue = 0.0;

        for (int i = 0; i < n; i++) {
            if (capacity - items.get(i).weight >= 0) {
                capacity -= items.get(i).weight;
                totalValue += items.get(i).value;
            } else {
                double fraction = ((double) capacity / items.get(i).weight);
                totalValue += (items.get(i).value * fraction);
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        int capacity = sc.nextInt();

        double maxValue = getMaxValue(weights, values, capacity);
        System.out.println("Maximum value we can obtain = " + maxValue);

        sc.close();
    }
}
