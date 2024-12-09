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

        // String st = "23";
        // StringBuilder t = new StringBuilder();
        // for (int i = 0; i < 2; i++) {
        // char ch = st.charAt(i);
        // int val = ch - '0';
        // t.append(val);
        // }

        // System.out.println(t);

        // String str = "123";
        // int num = Integer.parseInt(str);

        // String str = "123";
        // Integer num = Integer.valueOf(str);

        // int num = 123;
        // String str = String.valueOf(num);

        // int num = 123;
        // String str = Integer.toString(num);

        // int num = 123;
        // String str = String.format("%04d", num);
        // String str = String.format("%d", num);
        // System.out.println(str);

        // float f = 12.34f;
        // String str = String.valueOf(f);
        // System.out.println(str); // Output: 12.34

        // or

        // float f = 12.34f;
        // String str = Float.toString(f);
        // System.out.println(str); // Output: 12.34

        // double d=24.456756;
        // System.out.format("%.2f",d);

        // float f = 12.34f;
        // String str = String.format("%.2f", f);
        // System.out.println(str); // Output: 12.34

        char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
        System.out.println(Character.toString(charArray[0]));
        String st = Arrays.toString(charArray);
        System.out.println(st);

        // System.out.println(charArray);
        String str1 = new String(charArray);
        System.out.println(str1);
        // System.out.println(str); // Output: Hello
        // strings are Immutable in java

        double d = 24.456756;
        double r = getfloatval(d);
        System.out.println(r);
    }

    public static double getfloatval(double r) {
        String str = String.format("%.2f", r);
        return Double.parseDouble(str);
    }
}
