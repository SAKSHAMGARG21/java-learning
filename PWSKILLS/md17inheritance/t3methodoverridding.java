class aeroplane {
    public void takeoff() {
        System.out.println("Areoplane takeoff");
    }

    public void fly() { // this is method overrided
        System.out.println("The aeroplane is flying");
    }
}

class helicopter extends aeroplane {
    public void fly() { // this is method Overridding
        System.out.println("this is helicopter method");
    }

    public void carrygoods() { // spalized method
        System.out.println("Carry  goods by helicopter");
    }
}

class fighterplane extends aeroplane {
    public void fly() { // this is method Overridding
        System.out.println("this is fighter plane method");
    }

    public void attack() { // spalized method
        System.out.println("Attack by fighter plane");
    }

}

public class t3methodoverridding {
    public static void main(String[] args) {

    }
}
