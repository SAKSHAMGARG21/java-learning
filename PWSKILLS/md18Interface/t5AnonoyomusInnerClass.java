
interface Car{
    void drive();
}

// class  ElectricCar implements Car{
//     public void drive(){
//         System.out.println("Electric Car is driving");
//     }
// }

public class t5AnonoyomusInnerClass {
    public static void main(String[] args) {

        Car obj =new Car(){ // we also define interface method like this 
            public void drive(){
                System.out.println("Driving audi car");
            }
        };

        obj.drive();
    }
}
