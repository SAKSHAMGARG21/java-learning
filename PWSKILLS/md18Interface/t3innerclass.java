// inner - member ,static and anonymous
class A{

    String name;
    int age;
    int phoneno;
    String address;
    Address obj;

    class Address{
        String street;
        int  pincode;
    }

    public void  show(){
        System.out.println("in show");
    }
    // class B{
    //     public void display(){
    //         System.out.println("in display");
    //     }
    // }
    static class B{ // we make this class static 
        public void display(){
            System.out.println("in display");
        }
    }
}
public class t3innerclass {
    public static void main(String[] args) {
        A obj= new A();
        // A.B obj1= obj.new B(); // without static keyword
        A.B obj1= new A.B();
        obj.show();
        obj1.display();
    } 
}
