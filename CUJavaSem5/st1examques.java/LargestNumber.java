public class LargestNumber {
    public static String largestNumber(int S, int D) {
        // Check if it's possible to form the number
        System.out.println(S+" "+9*D);
        if (S > 9 * D) {
            return "-1";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < D; i++) {
            if (S >= 9) {
                result.append(9);
                S -= 9;
            } else {
                result.append(S);
                S = 0;
            }
        }

        // Fill remaining positions with 0 if any
        while (result.length() < D) {
            result.append(0);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(largestNumber(8, 2));  // Output: 80
        System.out.println(largestNumber(30, 4)); // Output: 9993
        System.out.println(largestNumber(5, 1));  // Output: 5
        System.out.println(largestNumber(5, 10)); // Output: 5000000000
    }
}
