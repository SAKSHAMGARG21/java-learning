import java.util.*;

class introtoHeaps {
    private int[] arr;
    private int size;

    public introtoHeaps() {
        arr = new int[100];
        arr[0] = -1; // Not used
        size = 0;
    }

    public void insert(int val) {
        size++;
        int idx = size;
        arr[idx] = val;

        while (idx > 1) {
            int par = idx / 2;
            if (arr[par] < arr[idx]) {
                swap(par, idx);
                idx = par;
            } else {
                return;
            }
        }
    }

    public void print() {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void deleteFromHeap() {
        if (size == 0) {
            System.out.println("Nothing to delete");
            return;
        }

        // Step 1: Put last element into the first index
        arr[1] = arr[size];

        // Step 2: Remove the last element
        size--;

        // Step 3: Take root node to its correct position
        int i = 1;
        while (i <= size) {
            int leftNode = 2 * i;
            int rightNode = 2 * i + 1;

            if (leftNode <= size && arr[i] < arr[leftNode]) {
                swap(i, leftNode);
                i = leftNode;
            } else if (rightNode <= size && arr[i] < arr[rightNode]) {
                swap(i, rightNode);
                i = rightNode;
            } else {
                return;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        introtoHeaps h = new introtoHeaps();

        h.insert(50);
        h.insert(55);
        h.insert(53);
        h.insert(52);
        h.insert(54);
        h.print();

        h.deleteFromHeap();
        h.print();

        // Max heap using PriorityQueue
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(4);
        maxHeap.add(2);
        maxHeap.add(5);
        maxHeap.add(3);

        System.out.println("Max Heap");
        System.out.println("Element top: " + maxHeap.peek());
        maxHeap.poll();
        System.out.println("Element top: " + maxHeap.peek());

        System.out.println("Size is " + maxHeap.size());

        if (maxHeap.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }

        // Min heap using PriorityQueue
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(4);
        minHeap.add(2);
        minHeap.add(5);
        minHeap.add(3);

        System.out.println("Min Heap");
        System.out.println("Element top: " + minHeap.peek());
        minHeap.poll();
        System.out.println("Element top: " + minHeap.peek());

        System.out.println("Size is " + minHeap.size());

        if (minHeap.isEmpty()) {
            System.out.println("Min heap is empty");
        } else {
            System.out.println("Min heap is not empty");
        }
    }
}