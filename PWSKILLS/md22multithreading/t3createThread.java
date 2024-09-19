
// class Mythread extends Thread {
//     public void run() {
//         System.out.println("child thread");
//     }
// }

import java.util.Scanner;

class calc extends Thread {
    public void run() {
        System.out.println("Calculation Thread first");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no");
        int a = sc.nextInt();
        System.out.println("Enter the second no");
        int b = sc.nextInt();

        int res= a+b;
        System.out.println("Output  of calculation thread is "+res);
    }
}

class messg extends Thread {
    public void run() {
        System.out.println("Displaying important message task");

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class t3createThread {
    public static void main(String[] args) {
        // System.out.println("main thread");

        // Mythread obj= new Mythread();
        // obj.start(); // we call start () method to start the thread
        // // if we call run method then it will execute like a single thread only

        System.out.println("main thread");

        calc t1 = new calc();

        messg t2 = new messg();

        t1.start();
        t2.start(); // after calling start method the thread will start executing on the basis of thread sechduler 

    }
}
