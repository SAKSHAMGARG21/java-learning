// Polymorphism -> is to do work in different ways

// this is of two types
// 1. function overloading -> runtime polymorphism -> it use less than function overriding
// 2. function over riding -> compile time polymorphism -> it use is more than function overloading

import java.util.*;

class Student {
    int id;
    String name;
    int age;

    // function overloading
    public void printstdinfo(int id) {
        System.out.println(this.id);
    }

    public void printstdinfo(String name) {
        System.out.println(this.name);
    }

    public void printstdinfo(String name, int age) {
        System.out.println(this.name + " " + this.age);
    }
}

public class f2polymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // Create a new Student object and assign it to the variable s1
        Student s1 = new Student();

        // Set the id, name, and age properties of the s1 object
        s1.id = 1;
        s1.name = "loki";
        s1.age = 12;

        // Call the printstdinfo method on s1, passing the id as an argument
        s1.printstdinfo(s1.id);

        // Call the printstdinfo method on s1, passing the name as an argument
        s1.printstdinfo(s1.name);

        // Call the printstdinfo method on s1, passing the name and age as arguments
        s1.printstdinfo(s1.name, s1.age);

        // Create a new Student object and assign it to the variable s2
        Student s2 = new Student();

    }

}
