
class lib implements Runnable {

    String res1 = new String("java");
    String res2 = new String("Sql");
    String res3 = new String("python");

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("St-1")) {
            try {
                Thread.sleep(2000);
                synchronized (res1) {
                    System.out.println("Std 1 acc the res " + res1);
                    Thread.sleep(2000);
                    synchronized (res2) {
                        System.out.println("std 1 acc the res " + res2);
                        Thread.sleep(2000);
                        synchronized (res3) {
                            System.out.println("std 1 acct the res " + res3);
                            Thread.sleep(2000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception  in car thread");
            }
        } else {
            try {
                Thread.sleep(2000);
                synchronized (res1) {
                    System.out.println("Std 2 acc the res " + res1);
                    Thread.sleep(2000);
                    synchronized (res2) {
                        System.out.println("std 2 acc the res " + res2);
                        Thread.sleep(2000);
                        synchronized (res3) {
                            System.out.println("std 2 acct the res " + res3);
                            Thread.sleep(2000);
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println("Exception  in car thread");
            }
        }
    }

}

public class t10deadLock {
    public static void main(String[] args) throws Exception {
        System.out.println("main thread started");

        lib c = new lib();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);

        t1.setName("St-1");
        t2.setName("St-2");

        t1.start();
        t2.start();

    }

}
