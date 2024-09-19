import java.util.Scanner;

class Demo implements Runnable  {

    public void run(){
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
public class t8joinIsAliveMthod {
    public static void main(String[] args) throws Exception {
        System.out.println("main thread started");
    
        Demo d = new Demo();
    
        Thread t1=new Thread(d);
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        t1.join();

        System.out.println("main thread end");
    }
    
}
