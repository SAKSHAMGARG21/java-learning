import java.util.Scanner;

class human{ // super class // patrent class // Base class
    String name;
    private  int age; // private variable // encapsulation // data hiding


    human(){
        System.out.println("this is human class constructor");
    }

    void sleep(){
        System.out.println(name + " is sleeping");
        System.out.println(age);
    } 
}

class std extends  human{ // drived class  // child class // sub class

    // public std(){
    //     super() // super method call by default in  constructor parent class
    // }

    void study(){
        System.out.println(name + " is studying");
    }

}

public class t1inheritance1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // In child class properties and methods were inherited from parent class
        // and can't inherite the private members of the parent class in child class
        std s1=new std(); // when this object creation calls the std class constructor and then std constructor calls parent class constructor with super() method
        s1.name="John";
        // s1.age=12;
        s1.sleep();
        s1.study();
    }
}
