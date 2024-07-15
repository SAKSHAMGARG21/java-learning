
import java.util.Scanner;

public class localAndInstance {
    // this is instance variable 
    // instance variable have default value 
    int a;
    String name;

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        // local variable have no default value
        int nm=9;
        localAndInstance obj1=new localAndInstance();
        localAndInstance obj2=new localAndInstance();

        obj1.name = "saksham";

        System.out.println(obj1.name);
        System.out.println(obj2.name);
        System.out.println(obj1.a);
        System.out.println(nm);
    }

}
