import java.util.Arrays;

public class EvenOddEle {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, -7, -8, -9 };

        int[] temp = new int[arr.length];

        int j = 0;
        int k = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                temp[j++] = arr[i];
            } else {
                temp[k--] = arr[i];
            }
        }

        Arrays.sort(temp, 0, j);
        Arrays.sort(temp, j, arr.length);

        System.out.println(Arrays.toString(temp));   
    }

}