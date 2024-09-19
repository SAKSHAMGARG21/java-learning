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
public class t7thread {
    public static void main(String[] args) {
        System.out.println("main thread");
    
        Demo d = new Demo();

        Thread t1=new Thread(d);
        t1.start();
    }
    
}
