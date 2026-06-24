
⚡ In Java, **multiple inheritance with classes is not allowed** — to avoid **ambiguity** like you showed.  
Instead, **Java uses interfaces** to achieve multiple inheritance.

```java
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
        D obj = new D();
        obj.show();  // No ambiguity now
    }
}
```

✅ **Important:**  
- In Java, you cannot do `class D extends B, C`.
- Instead, you **implement interfaces** and **override methods manually**.

---

**Short Correct Java Version (simplified):**
```java
interface A {
    void show();
}

interface B extends A {}
interface C extends A {}

class D implements B, C {
    public void show() {
        System.out.println("Class D");
    }
}

public class Test {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}
```

---

Would you like me to also show how **Diamond Problem** is solved in Java compared to C++? (It's interesting 🔥).