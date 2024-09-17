import java.util.Scanner;

class ReverseGreet extends Thread {
    int threadNum;

    public ReverseGreet(int n) {
        this.threadNum = n;
    }

    public void run() {
        for (int i = threadNum; i >= 1; i--) {
            System.out.println("codequotient thread" + i);
        }
    }
}

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ReverseGreet t1 = new ReverseGreet(n);
        t1.start();
    }
}
