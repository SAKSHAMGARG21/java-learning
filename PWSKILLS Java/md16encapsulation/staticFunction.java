
// public class staticFunction {

//     static int a;
//     static{  // this will execute before main()

//         System.out.println("static function");
//         int a=10;
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.
//         System.out.println("main method");
//     }

// }

// public class staticFunction {

//     static int a;
//     static int b;

//     int m;
//     int n;

//     static{
//         System.out.println("control in static block");
//         a=10;
//         b=20;
//     }
//     {
//         System.out.println("control in non-static block");
//         m=1;
//         n=2;
//     }

//     static void disp1(){
//         System.out.println("value of static var a:"+a);
//         System.out.println("value of static var b:"+b);
//     }

//     void disp2(){
//         System.out.println("value of not static var m:"+m);
//         System.out.println("value of not static var n:"+n);
//     }
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.
//         staticFunction obj=new staticFunction();

//         staticFunction.disp1();
//         obj.disp2();
//     }
// }

// import java.util.Scanner;

// class farmerloan{
//     int pa;
//     float td;
//     static float ri;
//     float si;

//     static{
//         ri=4.5f;
//     }
//     public void input(){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the pa:");
//         pa=sc.nextInt();
//         System.out.println("Enter the td:");
//         td=sc.nextInt();
//     }

//     void compute(){
//         si=(pa*td*ri)/100f;
//     }

//     void disp(){
//         System.out.println("simple interest is:"+si);
//     }
// }
// public class staticFunction {
//     public static void main(String[] args) {
//         farmerloan f1=new farmerloan();
//         farmerloan f2=new farmerloan();

//         f1.input();
//         f1.compute();
//         f1.disp();

//         f2.input();
//         f2.compute();
//         f2.disp();
//     }

// }

// public class staticFunction {
//     static int a;
//     static int b;

//     int m;
//     int n;

//     static{
//         System.out.println("control in static block");
//         a=10;
//         b=20;
//     }
//     {
//         System.out.println("control in not- static block");
//         m=1;
//         n=2;
//     }
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         staticFunction obj=new staticFunction();
//         staticFunction obj1=new staticFunction();
//     }
// }


// class demo{
//     static int a;
//     static int b;

//     static void disp(){
//         System.out.println("control in static block");
//     }
//     void disp1(){
//         System.out.println("control in not- static block");
//     }
// }
// public class staticFunction {
    
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);

//         // static
//         demo.disp();

//         // non static
//         demo obj1=new demo();
//         obj1.disp1();
//     }
// }

// public class staticFunction {
//     static int age;

//     static{
//         System.out.println("static block");
//         age=17;
//     }

//     static void disp(){
//         System.out.println("disp static block");

//         System.out.println(age);
//     }
//     public static void main(String[] args) {

//         System.out.println("main method");
//         disp();
        
//     }
// }

