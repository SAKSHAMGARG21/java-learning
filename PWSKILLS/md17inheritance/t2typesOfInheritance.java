// single inheritance
// class animal{ // this class inherite the object class by default
//     void sleep(){
//         System.out.println("this is the animal  sleep methods"); 

//     }
// }

// class tiger extends animal{

// }

// multilevel inheritance
// class animal {
//     void sleep() {
//         System.out.println("this is the animal  sleep methods");

//     }
// }

// class tiger extends animal {

// }

// class liger extends tiger {

// }

// hierical inheritance 
class animal {
    void sleep() {
        System.out.println("this is animal sleep method");
    }
}

class  tiger extends animal {

}

class  dog extends animal {

}

class   cat extends animal {

}

// Multiple inheritance  or dimond shape problem
// class parent1 {
//     void eat() {
//         System.out.println("this is parent1 eat method");
//     }

// }

// class parent2 {
//     void sleep() {
//         System.out.println("this is parent2");
//     }
// }
// class  child extends parent1, parent2  // this is multiple inheritance and it is not possible in java 
// {

// }


public class t2typesOfInheritance {
    public static void main(String[] args) {
        // tiger ob1 = new tiger();
        // ob1.sleep();

        // liger ob2 = new liger();
        // ob2.sleep();

        cat ob3 = new cat();
        ob3.sleep();

    }
}
