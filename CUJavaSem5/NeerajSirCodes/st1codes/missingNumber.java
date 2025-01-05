import java.util.*;

public class missingNumber {

    public static int  findMissingNumber(int[] nums) {

        int x=0;
        for (int i = 0; i <=nums.length; i++) {
            x=x^i;
        }
        for (int i = 0; i < nums.length; i++) {
            x=x^nums[i];
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();        
        }

        int missno=findMissingNumber(arr);
        System.out.println("Missing no is -> "+missno);
    }
}
