
//              inside Class    outside class same package    outside package subclass      outside package non-subclass 
// public           Y                   Y                                  Y                              Y
// protected        Y                   Y                                  Y                              N
// default          Y                   Y                                  N                              N
// private          Y                   N                                  N                              N

class demo1 {
    int m;
    int n;

    public demo1() {
        System.out.println("this is demo1");
    }

    public demo1(int x, int y) {
        System.out.println("this is demo1 with two parameters");
        m = x;
        n = y;
    }
}

class demo2 extends demo1 {
    public demo2() {
        // super(10,20);
        this(10,20);
        System.out.println("this is demo2");
    }

    public demo2(int x, int y) {
        // super();
        System.out.println("this is demo2 with two parameters");
        m=x;
        n=y;
    }
}

public class t4rulesOfoverriding {
    public static void main(String[] args) {
        demo2 d2=new demo2();
        
    }
}
