import java.util.Scanner;

// class car implements Runnable {

//     synchronized public void run() {
//         try {
//             System.out.println(Thread.currentThread().getName() + "Has entered in the parking lot");
//             Thread.sleep(2000);
//                 System.out.println(Thread.currentThread().getName() + "got into the car to drive");
//                 Thread.sleep(2000);
//                 System.out.println(Thread.currentThread().getName() + "Started to drive the car");
//                 Thread.sleep(2000);
//                 System.out.println(Thread.currentThread().getName() + "Came back and park the car");
//                 Thread.sleep(2000);
//         } catch (Exception e) {
//             TODO: handle exception
//             System.out.println("Exception  in car thread");
//         }
//     }
// }
class car implements Runnable {
    
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "Has entered in the parking lot");
            Thread.sleep(2000);

            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + "got into the car to drive");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "Started to drive the car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "Came back and park the car");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception  in car thread");
        }
    }

}

public class t9Synchronization {
    public static void main(String[] args) throws Exception {
        System.out.println("main thread started");

        car c = new car();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("SON-1");
        t2.setName("SON-2");
        t3.setName("SON-3");

        t1.start();
        t2.start();
        t3.start();

    }
}
