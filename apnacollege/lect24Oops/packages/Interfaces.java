
interface Animal {
    int eye=2; // it can't be changed 
    public void walk(); // ascess modifier is public in interface and abstraction
}

interface Herbivors {
    public void eatGrass();
}

// multipule inheritance is possible in interface
class Dog implements Animal, Herbivors {
    public void walk() {
        System.out.println("Dog is walking on four legs");
    }

    public void eatGrass() {
        System.out.println("Dog is eating grass");
    }
}

// static keyword
class student {
    String name;
    static String school;
}

public class Interfaces {
    public static void main(String[] args) {
        student.school = "jvm";
        student s1 = new student();

        s1.name = "tony";
        System.out.println(s1.school);
        System.out.println(s1.name);

    }

}
