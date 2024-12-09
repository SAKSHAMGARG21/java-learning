import java.util.*;

class ReverseGreet extends Thread {
    private int num;

    public ReverseGreet(int num) {
        this.num = num;
    }

    public void run() {
        if (num > 1) {
            Thread nextThread = new ReverseGreet(num - 1);
            nextThread.start();
            try {
                nextThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("CodeQuotient Thread" + num);
    }

}

public class file1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of threads:");
        int n = scanner.nextInt();
        if (n > 0) {
            Thread thread = new ReverseGreet(n);
            thread.start();
        }
    }

}
