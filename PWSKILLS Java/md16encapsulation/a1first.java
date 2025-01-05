// class std{
//     int age;
//     String name;
//     public void show(){
//         System.out.println(age);
//         System.out.println(name);
//     }

//     private int age;
//     private String name;

//     public void set(){
//         age=35;
//         name="Saksham garg";
//     }

//     public void show(){
//         System.out.println(age);
//         System.out.println(name);
//     }
// }
// public class a1first {
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // int n=sc.nextInt();

//         std obj=new std();
//         obj.age=52;
//         obj.name="saksham";
//         obj.show();
//     }
// }

// class std{
//     private int age;
//     private String name;

//     public void setdata(){
//         age=35;
//         name="Saksham garg";
//     }

//     public void show(){
//         System.out.println(age);
//         System.out.println(name);
//     }
// }
// public class a1first {
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // int n=sc.nextInt();

//         std obj=new std();
//         obj.setdata();
//         obj.show();
//     }
// }

// class std {
//     private int age;
//     private String name;

//     // public void setage(int a) {
//     // age = a;
//     // }

//     // public void setname(String nme) {
//     // name = nme;
//     // }

//     // "this" keyword it is also known as shadowning problem
//     // getter and setter
//     public void setage(int age) {
//         this.age = age;
//     }

//     public void setname(String name) {
//         this.name = name;
//     }

//     public void show() {
//         System.out.println(age);
//         System.out.println(name);
//     }
// }

// public class a1first {
//     public static void main(String[] args) {

//         std obj = new std();
//         std obj1 = new std();
//         obj.setage(45);
//         obj.setname("tony stack");
//         obj1.setage(32);
//         obj1.setname("reo stack");
//         obj.show();
//         obj1.show();

//         // int age = obj.getAge();
//         // String name = obj.getname();
//         // System.out.println(age);
//         // System.out.println(name);
//     }
// }

// class std {
// private int age;
// private String name;

// // constructor
// std(String name,int age){
// this.age=age;
// this.name=name;
// }
// public int getAge() {
// return age;
// }

// public String getname() {
// return name;
// }
// }

// public class a1first {
// public static void main(String[] args) {

// std obj = new std("tony",84);
// std obj1 = new std("thor",34234);

// int age = obj.getAge();
// String name = obj.getname();
// System.out.println(age);
// System.out.println(name);
// }
// }

// class std {
// private int age;
// private String name;

// // default constructor
// public std() {
// System.out.println("this is default constructor");
// }

// // prameterised constructor
// std(String name, int age) {
// this.age = age;
// this.name = name;
// }

// public void disp() {
// System.out.println(name);
// System.out.println(age);
// }
// }

// public class a1first {
// public static void main(String[] args) {

// std obj = new std();
// obj.disp();
// std obj1 = new std("tony", 84);
// obj1.disp();
// }
// }

class std {
    private int age;
    private String name;

    // constructor overloading
    // default constructor
    public std() {
        System.out.println("this is default constructor");
        age = 23;
        name = "thor";
    }

    // prameterised constructor
    public std(String name) {
        this.name = name;
        age = 45;
    }

    public std(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void disp() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class a1first {
    public static void main(String[] args) {

        std obj = new std();
        obj.disp();
        std obj1 = new std("tony");
        obj1.disp();
        std obj2 = new std("tony", 312);
        obj2.disp();
    }
}

// class std {
// private int age;
// private String name;

// // This() vs super() method call

// // this() constructor call is use for call the constructor in the same class
// // super() is use for call the constructor in the parent class
// // default constructor
// public std() {
// this("walter", 73);
// System.out.println("this is default constructor");
// age = 23;
// name = "thor";
// }

// // prameterised constructor
// public std(String name) {
// this();
// this.name = name;
// age = 45;
// }

// public std(String name, int age) {
// this.age = age;
// this.name = name;
// }

// public void disp() {
// System.out.println(name);
// System.out.println(age);
// }
// }

// public class a1first {
// public static void main(String[] args) {

// std obj = new std();
// obj.disp();
// std obj1 = new std("tony");
// obj1.disp();
// // std obj2 = new std("loki",312);
// // obj2.disp();

// }
// }