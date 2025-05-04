import java.util.*;
public class BitManipulation {

    public static void main(String[] args) {

        int n1 = 5;

        int n2 = 9;

        int n3 = 7;

        System.out.println("Number of set bits in " + n1 + " is: " +

                countSetBits(n1));
        System.out.println("Number of set bits in " + n2 + " is: " +

                countSetBits(n2));

        System.out.println("Number of set bits in " + n3 + " is: " +

                countSetBits(n3));

    }

    // Function to count the number of set bits in an integer

    public static int countSetBits(int n) {

        int count = 0;

        while (n > 0) {

            count += (n & 1); // Add the least significant bit to the count

            n >>= 1; // Shift n right by one bit

        }

        return count;

    }

}