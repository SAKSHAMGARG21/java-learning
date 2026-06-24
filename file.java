import java.util.Arrays;

public class file {

    public static int lss(String str){
        int n = str.length();
        Map<Character,Integer> mp =new HashMap<>();

        int st = -1;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if (mp.get(str.charAt(i)) > st){
                mp.put(str.charAt(i),st);
            }
            mp.put(str.charAt(i),i);
            mx = Math.max(mx, i-st+1);
        }
        return mx;
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 9};
        // int n = arr.length;
        // int[] res = new int[n + 1];

        // int num = arr[n - 1] + 1;  // increment last digit
        // int carry = num / 10;
        // res[n] = num % 10;

        // for (int i = n - 2; i >= 0; i--) {
        //     num = arr[i] + carry;       // add carry to current digit
        //     carry = num / 10;
        //     res[i + 1] = num % 10;      // store result in correct position
        // }

        // res[0] = carry;  // final carry (if any)

        // // If no carry, skip the leading 0
        // if (res[0] == 0) {
        //     res = Arrays.copyOfRange(res, 1, res.length);
        // }

        // System.out.println(Arrays.toString(res));

        // isArmstring(153);
        System.out.println(isArmstrong(153));
        
    }
}
