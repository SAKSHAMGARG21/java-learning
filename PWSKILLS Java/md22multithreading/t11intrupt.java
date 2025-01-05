class exp implements Runnable{
    public void run(){
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Focus is important");
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Thread is interupt");
            }
        }
    }
}
public class t11intrupt {
    public static void main(String[] args) {
        exp  t = new exp();

        Thread t1= new Thread(t);

        t1.start();
        t1.interrupt();
    }
}