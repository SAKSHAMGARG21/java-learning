public class slidingWindow{
    public static void main(String[] args) {
        String str = "BWBWBWBBWW";
        int k=3;
        int cnt=0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            if (str.charAt(i)=='W') cnt++;
        }
        min = Math.min(min,cnt);
        for (int i = k; i < str.length(); i++) {
            if (str.charAt(i-k)=='W') cnt--;
            if (str.charAt(i)=='W') cnt++;
            min = Math.min(min,cnt);
        }
        System.out.println(min);
    }
}