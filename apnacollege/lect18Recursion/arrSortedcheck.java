public class arrSortedcheck {

    public static boolean checkarrissorted(int[] arr, int idx) {
        if (idx >= arr.length - 1) {
            return true;
        }

        int diff = arr[idx + 1] - arr[idx];
        if (diff < 1) {
            return false;
        }
        return checkarrissorted(arr, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        System.out.println(checkarrissorted(arr, 0));

    }
}
