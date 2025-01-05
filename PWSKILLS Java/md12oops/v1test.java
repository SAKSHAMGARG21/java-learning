// Oops (object Oriented Programing)

// list of Concepts Involved:

// 1. Object Creation
// 2. Instance Variable and Local Variable
// 3. Method with Memory Map(JVM area)
// 4. Method Overloading


// class and objects
// instance  variables and local variables
// Methods with Memory Map(JVM)
public class v1test {

    // these are instance variables
    int a = 2;
    String name = "rahul";

    public static void main(String[] args) {
        // local Variable must be initilized first then use 
        int a = 9; // primitive
        test obj = new test(); // reference // creating object with new keyword

        // Instance variable
        // • Instance variables will be created at the time of object creation and
        // destroyed at the time of object destruction hence the scope of instance
        // variables is exactly the same as
        // scope of objects.

        // . Instance variables will be stored on the heap as the part of the object.

        // . Instance variables should be declared within the class directly but outside
        // of any method or block or
        // constructor.

        // by default instance variables are non-static and non-final. and value are 0
        // and null
        test obj2 = new test();

        obj.name = "tony";

        System.out.println(obj.a);
        System.out.println(obj.name);

        System.out.println(obj2.a);
        System.out.println(obj2.name);

        // Local variables
        // • Local variables will be stored inside the stack.
        // • The local variables will be created as part of the block execution in which
        // it is declared and
        // destroyed once that block execution completes. Hence the scope of the local
        // variables is exactly the
        // same as the scope of the block in which we declared.



        // Methods with Memory Map(JVM)

        // Method Area contains data Class  -> static blocks / static variables /references
        // heap area  contains object data -> instance  variables
        // stack memory contains Runtime Stack -> method calls local varibles
        // Pc registers
        // native methods calls

    }
}
