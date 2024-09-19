public class t2thread {
    public static void main(String[] args) {
        System.out.println("Main thread");
        System.out.println("Before creating thread");
        String name = Thread.currentThread().getName();
        System.out.println("the name of the main thered is " + name);
        System.out.println("the priority of the main therad is " + Thread.currentThread().getPriority());

        System.out.println("After changing");
        Thread t = Thread.currentThread();
        t.setName("pw");
        t.setPriority(1);
        String name1 = Thread.currentThread().getName();
        System.out.println("the name of the main thered is " + name1);
        System.out.println("the priority of the main therad is " + Thread.currentThread().getPriority());

        // how to create thread 
        // runnable interface contains void run() method which is implemented by thread class 
        // thread class also have function like sleep()  , yield() , join() ,start() , wait() etc 
    }
}
