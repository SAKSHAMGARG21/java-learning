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

    public void printstdinfo(String name){
        System.out.println(this.name);
    }

    public void printstdinfo(String name,int age){
        System.out.println(this.name+" "+this.age);
    }
}
public class f2polymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        Student s1=new Student();
        s1.id=1;
        s1.name="loki";
        s1.age=12;
        s1.printstdinfo(s1.id);
        s1.printstdinfo(s1.name);
        s1.printstdinfo(s1.name,s1.age);
    }

}
