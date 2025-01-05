import java.util.Scanner;

public class t1intro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int res=n+m;
        System.out.println(res);

        System.out.println("task 1 completed");

        // *************************************************************************
        System.out.println("task 2 started"); // this line of code in independent of previous code but this will not executed until the previous code excution not completed.
        // this is because of  this code is single thread code. 
    }
}
