// What is an interface?
// • It will allow only abstract methods.
// • It cannot be instantiated
// • Variables are "public static final".
// • Methods are "public and abstract".
// • No Constructor in Interface

interface A { // interface impliments pure abstraction
    int a = 15; // by default public static final

    void show(); // by default abstract
}

interface x {
    void abc();
}

class B implements A, x {
    public void show() {
        System.out.println("this is B class ");
    }

    public void abc() {
        System.out.println("this is abc");
    }
}


public class t1intro {
    public static void main(String[] args) {
        // A a1=new B();
        // a1.show();
        // a1.abc();

        B a2 = new B();
        a2.show();
        a2.abc();
    }
}
