// Inheritance  

// intro 
// import java.util.*;
// class shape{
//     String color;
// }
// class Triangle extends shape{
//     public void printcolor(){
//         System.out.println(this.color);
//     }
// }
// public class f3inheritance {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         Triangle obj1=new Triangle();
//         obj1.color="blue";
//         obj1.printcolor();
//     }
// }

// Multipule inheritance 
// import java.util.*;

// class shape {
//     public void printare() {
//         System.out.println("Displays area");
//     }
// }

// class Triangle extends shape {
//     public void area(int h, int l) {
//         System.out.println((h * l) / 2);
//     }
// }

// public class f3inheritance {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         Triangle obj1 = new Triangle();
//         obj1.area(2, 3);
//     }
// }

// Multilevel inheritance
// import java.util.*;

// class shape {
//     public void printare() {
//         System.out.println("Displays area");
//     }
// }

// class Triangle extends shape {
//     public void area(int h, int l) {
//         System.out.println((h * l) / 2);
//     }
// }

// class Equilatrealtriangle extends Triangle {
//     public void area(int h, int l) {
//         System.out.println((h * l) / 2);
//     }
// }

// public class f3inheritance {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         Triangle obj1 = new Triangle();
//         obj1.area(2, 3);
//         Equilatrealtriangle obj2 = new Equilatrealtriangle();
//         obj2.area(3, 4);
//     }
// }


// Hierarchial Inheritance
// import java.util.*;

// class shape {
//     public void printare() {
//         System.out.println("Displays area");
//     }
// }

// class Triangle extends shape {
//     public void area(int h, int l) {
//         System.out.println((h * l) / 2);
//     }
// }

// class Circle extends shape {
//     public void area(int r) {
//         System.out.println(3.14*r*r);
//     }
// }

// public class f3inheritance {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         Triangle obj1 = new Triangle();
//         obj1.area(2, 3);
//         Equilatrealtriangle obj2 = new Equilatrealtriangle();
//         obj2.area(3, 4);
//         Circle obj3=new Circle();
//         obj3.area(3);
//     }
// }

// Hybrid Inheritance
import java.util.*;

class shape {
    public void printare() {
        System.out.println("Displays area");
    }
}

class Triangle extends shape {
    public void area(int h, int l) {
        System.out.println((h * l) / 2);
    }
}

class Circle extends shape {
    public void area(int r) {
        System.out.printf("%.2f",3.14*r*r);
    }
}

class Square extends Circle{
    public void area(int s){
        System.out.println(s*s);
    }
}

public class f3inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        Triangle obj1 = new Triangle();
        obj1.area(2, 3);
        Circle obj3=new Circle();
        obj3.area(3);
        Square obj4=new Square();
        obj4.area(2);
    }
}
