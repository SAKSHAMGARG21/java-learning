
abstract class aeroplane {
    // * we can't create an abstract variable in abstract class
    // abstract int age; //error
    
    // if one method is abstract then the class is also abstract
    abstract public void takeoff();

    abstract public void fly();

    public void landing() { // this method make this class concrete or impure abstraction because this is
                            // not the abstract method
        System.out.println("Aeroplane is landing");
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

public class abstractionAndAbstractClass {
    public static void main(String[] args) {
        aeroplane ref1 = new helicopter();
        ref1.takeoff();
        ref1.fly();
        ref1.landing();
        ((helicopter) ref1).carrygoods();
        aeroplane ref2 = new fighterplane();
        ref2.takeoff();
        ref2.fly();
        ref2.landing();
    }
}
