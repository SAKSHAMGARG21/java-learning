import java.util.Scanner;

public class t9exp {
    public static void main(String[] args) {

        int num = 0;
        // Scanner sc=new Scanner(System.in);
        // we use catch or finally block with try
        // catch block is not complusory with try block
        // try {
        // num=sc.nextInt();
        // }
        // finally{ // finally block executes always althow execption throw or not
        // sc.close();
        // System.out.println("resource closed");
        // }

        try (Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
        }
        System.out.println(num);

    }
}
