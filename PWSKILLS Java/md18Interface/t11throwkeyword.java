
class Myexception extends Exception {
    public Myexception() {

    }

    public Myexception(String msg) {
        super(msg);
    }
}

public class t11throwkeyword {

    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        try {
            if (b <= 0) {
                // Exception e = new ArithmeticException("Not a negv no");
                Exception e = new Myexception("Not a negv no or zero");
                throw e;
            } else {
                int res = a / b;
                System.out.println(res);
                System.out.println("no error");
            }
        } catch (Exception e) {
            System.out.println("error " + e);
        }    
        
    }
}
