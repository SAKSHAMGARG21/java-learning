The four pillars of Object-Oriented Programming (OOP) are:  

1. **Encapsulation**:  
   - Wrapping the data (variables) and the methods (functions) that operate on the data into a single unit, i.e., a class.  
   - It restricts direct access to some of an object's components, ensuring controlled interaction through methods (getters/setters).

```java
class Employee {
    // Private fields (data hiding)
    private String name;
    private int age;

    // Public setter method
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method
    public String getName() {
        return name;
    }

    // Public setter method
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Public getter method
    public int getAge() {
        return age;
    }
}

public class Test {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John");
        emp.setAge(25);

        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
    }
}

```

2. **Abstraction**:  
   - Hiding complex implementation details and showing only the essential features of an object.  
   - It helps to focus on what an object does rather than how it does it.


### In Java, Abstraction is achieved by:
- **Abstract classes** (`abstract` keyword)
- **Interfaces**

---

## Example 1: Abstraction using **Abstract Class**

```java
abstract class Vehicle {
    // Abstract method (no body)
    abstract void start();

    // Normal method
    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    // Providing body for abstract method
    void start() {
        System.out.println("Car started");
    }
}

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();  // Calls start() of Car
        c.stop();   // Calls stop() from Vehicle
    }
}
```

✅ **Key Points**:
- `Vehicle` is an **abstract class**.  
- `start()` is **abstract** (only declared, not defined).
- `Car` **implements** the `start()` method.

---

## Example 2: Abstraction using **Interface**

```java
interface Animal {
    void sound();  // Interface method (abstract by default)
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
```

3. **Inheritance**:  
   - The ability of one class (child class) to acquire properties and behaviors (methods) from another class (parent class).  
   - Promotes code reusability and establishes a relationship between classes.
   

4. **Polymorphism**:  
   - The ability of different objects to respond to the same function call in different ways.  
   - Achieved through method overloading (compile-time) or method overriding (runtime).  

Would you like a deeper explanation of any of these?