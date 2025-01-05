// why use lambda exp?
// -> to implements a functional interface 
// -> less coding

@FunctionalInterface // this @ symbol denots anutations
interface Car {
    void drive(int avg,int avg2); // if there is more than one function in interface then it should not be lambda // exp
    // void show(); // error
}

// class ElectricCar implements Car{ 
// public void drive(){
// System.out.println("Electric Car is driving");
// }
// }

public class t6Lambdaexp {
    public static void main(String[] args) {
        // lambda exp
        // Car obj = () -> System.out.println("Driving audi car");
        // obj.drive();

        // Car obj = () -> {
        // System.out.println("Driving audi car");
        // };
        // obj.drive();huikf979h

        // Car obj = () -> {
        //     System.out.println("gwagon car");
        //     System.out.println("Driving audi car");
        // };
        // obj.drive();

        // Car obj = () -> {
        //     System.out.println("gwagon car");
        //     System.out.println("Driving audi car");
        // };
        // obj.drive();

        // Car obj = (int avg) -> {
        //     System.out.println("gwagon car");
        //     System.out.println("Driving audi car");
        // };
        // obj.drive(16);

        // Car obj = avg -> {
        //     System.out.println("gwagon car");
        //     System.out.println("Driving audi car");
        // };
        // obj.drive(16);

        // Car obj = avg -> {
        //     System.out.println("gwagon car");
        //     System.out.println("Driving audi car");
        // };
        // obj.drive(16);

        Car obj = (avg1,avg2) -> {
            System.out.println("gwagon car"+avg1);
            System.out.println("Driving audi car"+avg2);
        };
        obj.drive(16,21);
        

    }
}
