public class fibo {

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int n = 10; // You can change this value to compute a different Fibonacci number
        int result = fib(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
        
        // Example of printing the first n Fibonacci numbers
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }    
}
