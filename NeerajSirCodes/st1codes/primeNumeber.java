import java.util.*;

public class primeNumeber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // tc 1-4
        // first method this is to find the number is prime or not
        // if (n <= 1) {
        // System.out.println(n + " is not a prime number.");
        // } else {
        // boolean isprime = true;
        // for (int i = 2; i < n; i++) {
        // if (n % i == 0) {
        // isprime = false;
        // break;
        // }
        // }

        // if (isprime) {
        // System.out.println(n + " is a prime number.");
        // } else {
        // System.out.println(n + " is not a prime number.");
        // }
        // }

        // tc 5
        // second method this is to find the first n prime numbers
        // int l = 0;
        // int i = 2;
        // while (l < n) {
        // boolean isprime = true;
        // for (int j = 2; j < i; j++) {
        // if (i % j == 0) {
        // isprime = false;
        // break;
        // }
        // }

        // if (isprime) {
        // System.out.println(i + " ");
        // l++;
        // }
        // i++;
        // }

        // 6
        // third method this is to find the nth prime numbers
        // for (int i = 2; i < n; i++) {
        // boolean isprime = true;
        // for (int j = 2; j < i; j++) {
        // if (i % j == 0) {
        // isprime = false;
        // break;
        // }
        // }

        // if (isprime) {
        // System.out.print(i + " ");
        // }
        // }

        // tc 7
        // optimised solution O(n) ans S(n)
        int count = countPrimes(n);
        System.out.println("Number of prime numbers less than " + n + " is " + count);


    }

    public static int countPrimes(int n) {
        int res = 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        List<Integer> arr = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                res++;
                arr.add(i);
                for (int j = 2 * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println(arr);
        return res;
    }
}
