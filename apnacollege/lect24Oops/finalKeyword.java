//1. Final Variables: A variable declared as final cannot be reassigned once it has been initialized. This means that once a value is assigned to a final variable, it cannot be changed.
// class MyClass {
//     private final int x = 10;

//     public void myMethod() {
//         x = 20; // compiler error
//     }
// }

// 2.Final Methods: A method declared as final cannot be overridden by subclasses. This means that a subclass cannot provide a different implementation of a final method.
// public class Animal {
//     public final void sound() {
//         System.out.println("The animal makes a sound");
//     }
// }

// public class Dog extends Animal {
//     @Override
//     public void sound() { // compiler error
//         System.out.println("The dog barks");
//     }
// }

// 3.Final Classes: A class declared as final cannot be subclassed. This means that no other class can extend a final class.
// public final class MyClass {
//     // ...
// }

// public class MySubclass extends MyClass { // compiler error
//     // ...
// }

// 4. Final Parameters: A method parameter declared as final cannot be reassigned within the method.
// public void myMethod(final int x) {
//     x = 20; // compiler error
// }
// public class finalKeyword {
//     public static void main(String[] args) {

//     }
// }


