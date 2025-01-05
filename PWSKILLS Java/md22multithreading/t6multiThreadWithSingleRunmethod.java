import java.util.Scanner;

class Mythread extends Thread {

    public void run() {
        String tname = Thread.currentThread().getName();
        System.out.println(tname);
        if (tname.equals("calc")) {
            calc();
        } else {
            messg();
        }
    }

    public void calc() {
        System.out.println("Calculation Thread first");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no");
        int a = sc.nextInt();
        System.out.println("Enter the second no");
        int b = sc.nextInt();

        int res = a + b;
        System.out.println("Output of calculation thread is " + res);
    }

    public void messg() {
        System.out.println("Displaying important message task");

        for (int i = 0; i < 3; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class t6multiThreadWithSingleRunmethod {

    public static void main(String[] args) {
        System.out.println("main thread");

        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();

        t1.setName("calc");
        t2.setName("messg");

        t1.start();
        t2.start();
    }
}
