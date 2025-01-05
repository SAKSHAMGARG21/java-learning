class Demo {

    public void a() throws Exception{
        b();
    }

    public void b() throws Exception {
        int a = 6;
        int b = 0;
        int res = a / b;
        System.out.println(res);
    }
}

public class t10DuckingExec {
    public static void main(String[] args) {
        Demo obj = new Demo();
        try {
            obj.a();
            System.out.println("no error");
        } catch (Exception e) {
            System.out.println("error "+e);
        }
    }
}