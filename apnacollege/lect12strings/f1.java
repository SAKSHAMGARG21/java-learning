import java.util.*;

public class f1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the String =>");
        // String st1=sc.next();
        // System.out.println(st1);

        // String st2=sc.nextLine();
        // System.out.println(st2);

        // System.out.println("Enter the String =>");
        // String fstname="saksham";
        // String lstname="Garg";
        // String fullname=fstname+":"+lstname;
        // System.out.println(fullname);

        // String st1 = "Tony";
        // String st2 = "Tony";

        // st1 > st2 => +ve value
        // st1 < st2 => -ve value
        // st1 == st2 => 0

        // if (st1.compareTo(st2)==0){
        // System.out.println("Strings are equal");
        // }else{
        // System.out.println("String is not equal");
        // }

        // if (st1==st2){
        // System.out.println("Strings are equal");
        // }else{
        // System.out.println("String is not equal");
        // }

        // if (new String("sam") == new String("sam")) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings is not equal");
        // }

        // String st = "TonyStark";
        // System.out.println(st.substring(0, st.length()));
        // System.out.println(st.substring(4, st.length()));
        // System.out.println(st.substring(1, 5));
        // System.out.println(st.substring(4, 7));

        String st = "23";

        for (int i = 0; i < 2; i++) {
            char ch = st.charAt(i);
            int val = ch - '0';
            System.out.print(val);
        }

        // strings are Immutable in java
    }
}
