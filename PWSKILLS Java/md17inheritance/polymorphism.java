// Polymorphism -> is to do work in different ways

// this is of two types
// 1. function overloading -> runtime polymorphism -> it use less than function overriding
// 2. function overriding -> compile time polymorphism -> it use is more than function overloading


class aeroplane {
    public void takeoff() {
        System.out.println("Areoplane takeoff");
    }

    public void fly() { // this is method overrided
        System.out.println("The aeroplane is flying");
    }
}

class helicopter extends aeroplane {
    public void takeoff() {
        System.out.println("helicopter takeoff");
    }
    public void fly() { // this is method Overridding
        System.out.println("this is helicopter method");
    }

    public void carrygoods() { // spalized method
        System.out.println("Carry  goods by helicopter");
    }
}

class fighterplane extends aeroplane {
    public void takeoff() {
        System.out.println("fighterplane takeoff");
    }
    public void fly() { // this is method Overridding
        System.out.println("this is fighter plane method");
    }

    public void attack() { // spalized method
        System.out.println("Attack by fighter plane");
    }

}

class aeros{
    public void print(aeroplane ref){
        ref.takeoff();
        ref.fly();
        System.out.println("---------------------------");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        helicopter a = new helicopter();
        fighterplane b=new fighterplane();

        // aeroplane c;

        // c=a;

        // c.takeoff();
        // c.fly();

        // //------------------

        // c=b;
        // c.takeoff();
        // c.fly();

        aeros c=new aeros();
        c.print(a);
        c.print(b);

    }   
}
