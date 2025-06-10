interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("Class A from B");
    }
}

class C implements A {
    public void show() {
        System.out.println("Class A from C");
    }
}

class D implements B, C {  // ERROR: Java does NOT support multiple class implementation

    // SOLUTION: Implement show() yourself
    public void show() {
        System.out.println("Class D implementing A via B and C");
    }
}

public class Test {
    public static void main(String[] args) {
        D obj = new B();
        obj.show();  // No ambiguity now
    }
}