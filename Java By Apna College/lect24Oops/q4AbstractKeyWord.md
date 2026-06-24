Let's be direct:  
**`abstract`** in Java is a **keyword** used to create classes and methods **without complete implementation**.

---

## 1. **Abstract Class**
- A class declared with the `abstract` keyword.
- It **can** have **abstract** methods (without a body) and **concrete** methods (with a body).
- **Cannot be instantiated** (you cannot create an object of it directly).

### Example:
```java
abstract class Animal {
    abstract void sound();  // Abstract method

    void eat() {            // Concrete method
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}
```

---

## 2. **Abstract Method**
- A method **without a body** (`;` instead of `{}`).
- Must be **overridden** in a child class.

```java
abstract class Shape {
    abstract void draw();  // No body
}
```

---

## 3. **Important Rules:**
- If a class has even **one abstract method**, the class **must be abstract**.
- You **cannot create an object** of an abstract class directly.
- Subclasses must **override** all abstract methods, or they should also be declared abstract.

---

## 4. **Why use abstract classes?**
- To **force** subclasses to implement some methods.
- To provide a **common template** (partial abstraction).

---

## Quick Example (Simple):

```java
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting");
    }
}

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
```

---

Would you like a **real-world example** also (like Abstract `BankAccount` class)? It’s often asked in viva/interviews! 🎯