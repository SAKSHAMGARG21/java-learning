import java.util.*;

class Pen {
    int id;
    String color;
    String type;

    public void write() {
        System.out.println("Writing something");
    }

    public void printpen() {
        System.out.println("This is Pen -> " + this.id);
        System.out.println(this.color);
        System.out.println(this.type);
    }

    public void printcolor() {
        System.out.println(this.color);
    }

    public void printtype() {
        System.out.println(this.type);
    }
}
// ******************************** next part *******************************

class Student {
    int id;
    String name;
    int age;

    public void printstdinfo() {
        System.out.println("This is student -> " + this.id);
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("Constructor called");
        this.id = 0;
        this.name = "_";
        this.age = 0;
    }

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student(Student st2) {
        this.id = st2.id;
        this.name = st2.name;
        this.age = st2.age;
    }
}

public class f1oops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // Pen p1 = new Pen();
        // p1.id = 1;
        // p1.color = "Blue";
        // p1.type = "Ball ponit";

        // Pen p2 = new Pen();
        // p2.id = 2;
        // p2.color = "black";
        // p2.type = "gel";

        // p1.write();
        // p1.printpen();
        // p1.printcolor();
        // p1.printtype();

        // p2.write();
        // p2.printpen();
        // p2.printcolor();
        // p2.printtype();

        // ******************************** next part *******************************

        // Student st1=new Student();
        // st1.id=1;
        // st1.name="Tony";
        // st1.age=12;
        // st1.printstdinfo();

        // // Student st1=new Student();
        // Student st1 = new Student(1, "thor", 23);
        // st1.printstdinfo();

        // // copy Constructor
        // Student st2 = new Student(st1);
        // st2.printstdinfo();

        // NOTE : there is no destructor in java their is garbage collector which
        // collects the garbage values.
        // Garbage values are those values which not contain any pointer refrence

        // ******************************** next part *******************************

        // Polymorphism

    }
}
