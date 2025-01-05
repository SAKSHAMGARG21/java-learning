import java.util.Scanner;

public class mutableAndImutableString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        String brand="pwskills "; // this is imutable string which cannot be changed
        System.out.println(brand);
        brand.concat("college walha");
        System.out.println(brand);

        StringBuilder brand1=new StringBuilder("pwskills"); // this is mutable string
        // which can be changed
        System.out.println(brand);
        brand1.append("college walha");
        System.out.println(brand1);
        System.out.println();

        // Imutable and memory map
        // String s1="pw"; // this objects are take place in "string control pool(scp)
        // // in this pool duplicate are not allowed."
        // String s2="pw";
        // String s3=new String("pw"); // this will take heap memory storage In which
        // // duplicate values will take place
        // String s4=new String("pw");

        // System.out.println(s1==s2);
        // System.out.println(s3==s4);

        // String s1="pw";
        // String s2=new String("pw");
        // System.out.println(s1==s2);
        // System.out.println(s1.equals(s2));

        // String s1="pwjava";
        // String s2="pwjava";
        // String s3="pwJAVA";
        // System.out.println(s1==s2);
        // System.out.println(s1==s3);
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s3));

        // String s1="pwjava";
        // String s2=new String("PWjava");
        // String s3=new String("pwjava");
        // System.out.println(s1==s2);
        // System.out.println(s1==s3);
        // System.out.println(s1.equalsIgnoreCase(s2));
        // System.out.println(s2.equalsIgnoreCase(s3));

        // String s1=new String("pwjava");
        // s1=s1.concat("college wahla");
        // System.out.println(s1);

        // String s1="Pwjava";
        // String s2=s1.concat("skill");
        // String s3=new String("pwskill");
        // s3=s3.concat("java");
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);

        // String s1="pw";
        // String s2="pw"+"java";
        // String s3="pw"+"skill"+"java";
        // String s4=s1+s2;
        // String s5="pw"+100+99;
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        // System.out.println(s4);
        // System.out.println(s5);

        // String s1="Pw skills java";
        // System.out.println(s1.length());
        // System.out.println(s1.charAt(3));
        // System.out.println(s1.toUpperCase());
        // System.out.println(s1.toLowerCase());
        // System.out.println(s1.substring(3,8));
        // System.out.println(s1.indexOf('s'));
        // System.out.println(s1.indexOf('a'));
        // System.out.println(s1.lastIndexOf('a'));

        // StringBuilder sb=new StringBuilder("tony");
        // System.out.println(sb);

        // sb.append("stack");
        // System.out.println(sb);

        // StringBuffer sb=new StringBuffer("tony");
        // System.out.println(sb);
        // sb.append("stack");
        // System.out.println(sb);

        // final int a=10; // final will make constant variable
        // a=20;
        // System.out.println(a);

        // final StringBuffer sb=new StringBuffer("tony");
        // sb.append("stack");
        // sb=new StringBuffer("virat");
        // System.out.println(sb);

        // StringBuffer sb=new StringBuffer();
        // System.out.println(sb.capacity()); // initial capacity of StringBuffer is 16
        // sb.append("abcdefghijklmnop");
        // System.out.println(sb.capacity()); // capicity increased 16+1 * 2 =34;
        // sb.append("a");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());

        // StringBuffer sb=new StringBuffer("saksham"); // this will add this string in
        // // initial 16+7;0
        // System.out.println(sb.capacity());
        // System.out.println(sb.charAt(1));
        // sb.setCharAt(1, 'A');
        // System.out.println(sb);

        // StringBuffer sb = new StringBuffer(150); // now the capacity is 150 as defined;
        // System.out.println(sb.capacity());
        // sb.append("java");
        // System.out.println(sb);
        // sb.trimToSize();
        // System.out.println(sb.capacity());
        
        // StringBuffer sb=new StringBuffer("saksham");
        // System.out.println(sb);
        // System.out.println(sb.reverse());


        // StringBuffer
        // Synchronization: StringBuffer is synchronized, meaning it is thread-safe. Multiple threads can access it without causing data inconsistency.
        // Performance: Due to synchronization, StringBuffer is slower than StringBuilder when used in a single-threaded environment.
        // Version: StringBuffer has been available since JDK 1.0.
        // StringBuilder
        // Synchronization: StringBuilder is not synchronized, meaning it is not thread-safe. It should be used when thread safety is not a concern.
        // Performance: StringBuilder is faster than StringBuffer because it does not have the overhead of synchronization.
        // Version: StringBuilder was introduced in JDK 1.5.
    }

}
