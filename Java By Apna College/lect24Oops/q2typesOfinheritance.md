In Java, there are **five types of inheritance**:

1. **Single Inheritance**  
   - One class inherits from another class.
   - Example: `class B extends A {}`

2. **Multilevel Inheritance**  
   - A class inherits from a class, which itself inherits from another class.
   - Example: `class C extends B extends A {}`

3. **Hierarchical Inheritance**  
   - Multiple classes inherit from a single parent class.
   - Example: `class B extends A {}`, `class C extends A {}`

4. **Multiple Inheritance (through interfaces)**  
   - A class implements multiple interfaces.
   - Example: `class C implements A, B {}`

5. **Hybrid Inheritance (through interfaces)**  
   - A combination of two or more types of inheritance, usually involving interfaces to avoid ambiguity.

> **Note:** Java **does not support multiple inheritance** with classes to avoid the "Diamond Problem"; it supports it only via **interfaces**.

Here’s a quick explanation of each type of inheritance in Java **with code examples**:

---

### 1. Single Inheritance
```java
class A {
    void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

public class Test {
    public static void main(String[] args) {
        B obj = new B();
        obj.display(); // From A
        obj.show();    // From B
    }
}
```

---

### 2. Multilevel Inheritance
```java
class A {
    void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

class C extends B {
    void print() {
        System.out.println("Class C");
    }
}

public class Test {
    public static void main(String[] args) {
        C obj = new C();
        obj.display(); // From A
        obj.show();    // From B
        obj.print();   // From C
    }
}
```

---

### 3. Hierarchical Inheritance
```java
class A {
    void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

class C extends A {
    void print() {
        System.out.println("Class C");
    }
}

public class Test {
    public static void main(String[] args) {
        B obj1 = new B();
        C obj2 = new C();
        obj1.display();
        obj1.show();
        obj2.display();
        obj2.print();
    }
}
```

---

### 4. Multiple Inheritance (using Interfaces)
```java
interface A {
    void display();
}

interface B {
    void show();
}

class C implements A, B {
    public void display() {
        System.out.println("Interface A Method");
    }
    public void show() {
        System.out.println("Interface B Method");
    }
}

public class Test {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
        obj.show();
    }
}
```

---

### 5. Hybrid Inheritance (Combination)
```java
interface A {
    void display();
}

interface B {
    void show();
}

class C implements A {
    public void display() {
        System.out.println("Class C implementing A");
    }
}

class D extends C implements B {
    public void show() {
        System.out.println("Class D implementing B and extending C");
    }
}

public class Test {
    public static void main(String[] args) {
        D obj = new D();
        obj.display(); // From C (implements A)
        obj.show();    // From D (implements B)
    }
}
```

---

Would you also like a simple diagram summarizing all of these? It would make it even easier to remember! 📈