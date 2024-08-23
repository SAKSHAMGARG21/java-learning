abstract class Animal {
    abstract void walk();
    public void  eat() {
        System.out.println("Animal eats");
    }

    Animal(){
        System.out.println("creating a new animal");
    }
}

class Dog extends Animal {
    Dog(){
        System.out.println("creating a new dog");
    }
    public void walk() {
        System.out.println("Dog is walking on four legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("chicken is walking on two legs");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.walk();
        Chicken c1=new Chicken();
        c1.walk();

    }
}
