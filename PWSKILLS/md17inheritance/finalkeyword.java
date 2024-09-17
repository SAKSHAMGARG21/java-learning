// final class can't be inherited
// final class animal{
//     void sleep(){
//         System.out.println("animal is sleeping");
//     }
// }

class animal{
    final int age=19; // this variable could't be changed 
    final void sleep(){ // valid this method will inherited in dog class but this method is not override in child class
        // age=20;
        System.out.println("animal is sleeping");
    }
}

class dog extends animal{

    // void sleep(){ // error
    // }
}

public class finalkeyword {
    public static void main(String[] args) {
        dog a1= new dog();
        a1.sleep();
        
    }
}
