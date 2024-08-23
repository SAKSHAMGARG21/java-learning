import java.util.*;

public class reverseBits {

    public static void main(String[] args) {

        int n1 = 5;

        int res= (n1) & ~n1;
        int n2 = 43261596;
        System.out.println("Reversed bits of " + n1 + " : " + findreverseBits(n1));

        System.out.println("Reversed bits of " + n2 + " : " + findreverseBits(n2));

    }

    // Function to reverse bits of an integer

    public static int findreverseBits(int n) {

        int result = 0;

        for (int i = 0; i < 32; i++) {

            result <<= 1;

            result |= (n & 1);

            n >>= 1;

        }

        return result;

    }

}