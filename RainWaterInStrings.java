public class RainWaterInStrings {
    public static int rainWater(String s) {
        int n = s.length();
        int[] height = new int[n];

        // Convert characters to ASCII values
        for (int i = 0; i < n; i++) {
            height[i] = (int) s.charAt(i);
        }

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Fill leftMax array
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Fill rightMax array
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Calculate trapped water
        int trapped = 0;
        for (int i = 0; i < n; i++) {
            trapped += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return trapped+1;
    }

    public static void main(String[] args) {
        String input = "ZOPSMART";
        System.out.println(rainWater(input)); // Output: 39
    }
}