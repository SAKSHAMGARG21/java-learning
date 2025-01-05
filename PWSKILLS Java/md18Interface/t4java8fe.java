// Define an interface A
interface A {
    // Abstract method, must be implemented by any class that implements this interface
    void show();
    
    // Default method, provides a default implementation that can be used by any class that implements this interface
    default void config() {
        System.out.println("in config");
    }
    
    // Static method, can be called without creating an instance of the interface
    static void abc() {
        System.out.println("in abc");
    }
}

// Class B implements interface A
class B implements A {
    // Implementation of the show() method
    public void show() {
        System.out.println("in show");
    }
}

// Main class
public class t4java8fe {
    public static void main(String[] args) {
        // Call the static method abc() on the A interface
        A.abc(); // Output: in abc
        
        // Create an instance of B and assign it to a variable of type A
        A obj = new B();
        
        // Call the show() method on the obj instance
        obj.show(); // Output: in show
        
        // Call the config() method on the obj instance, which uses the default implementation from the A interface
        obj.config(); // Output: in config
    }
}