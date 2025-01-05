import java.util.*;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            int curr= arr[i];
            int j=i-1;
            while(0<=j &&  arr[j] > curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }

        
        System.out.println(Arrays.toString(arr));
    }
}
