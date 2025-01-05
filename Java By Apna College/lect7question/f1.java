import java.util.*;

public class f1 {
    public static int calculateGCD(int x, int y) {
        if (y == 0)
            return x;
        return calculateGCD(y, x % y);

    }

    public static int calculateLCM(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        }
        return (x * y) / calculateGCD(x, y);
    }

    public static int calculatelcm(int a, int b) {
        int maxNum = (a > b) ? a : b;
        int minNum = (a < b) ? a : b;
        int lcm = maxNum;

        while (lcm % minNum != 0) {
            lcm += maxNum;
        }

        return lcm;
    }

    public static int calculatehcf(int a, int b) {

        if (a == 0)
            return b;

        if (b == 0)
            return a;

        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }

        return a;
    }

    public static void fibo(int n) {
        int a = 0, b = 1;
        if (n == 0)
            System.out.println(a);
        else if (n == 1)
            System.out.println(a);
        else if (n == 2) {
            System.out.print(a + " " + b + " ");
        } else {
            int c;
            System.out.print(a + " " + b + " ");
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // average of three nos
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();

        // int avg=(a+b+c)/3;
        // System.out.println("Average of "+a+", "+b+", and "+c+" is "+avg);
        // // largest among three nos
        // int max=Math.max(Math.max(a,b),c);
        // System.out.println("Largest number is "+max);
        // // smallest among three nos
        // int min=Math.min(Math.min(a,b),c);
        // System.out.println("Smallest number is "+min);
        // // sum of three nos
        // int sum=a+b+c;
        // System.out.println("Sum of "+a+", "+b+", and "+c+" is "+sum);
        // // product of three nos
        // int product=a*b*c;
        // System.out.println("Product of "+a+", "+b+", and "+c+" is "+product);
        // // difference between largest and smallest
        // int diff= Math.abs(a-b);
        // System.out.println("Difference between largest and smallest is "+diff);

        // sum of odd numbers
        // int n=sc.nextInt();
        // int sum=0;
        // for (int i = 1; i <=n; i++) {
        // if ((i&1)==1){
        // sum+=i;
        // }
        // }
        // System.out.println("sum is "+sum);
        // // sum of even numbers
        // sum=0;
        // for (int i = 1; i <=n; i++) {
        // if ((i&1)==0){
        // sum+=i;
        // }
        // }
        // System.out.println("sum is "+sum);
        // // sum of squares of odd numbers
        // sum=0;
        // for (int i = 1; i <=n; i++) {
        // if ((i&1)==1){
        // sum+=i*i;
        // }
        // }
        // System.out.println("sum is "+sum);
        // // sum of squares of even numbers
        // sum=0;
        // for (int i = 1; i <=n; i++) {
        // if ((i&1)==0){
        // sum+=i*i;
        // }
        // }
        // System.out.println("sum is "+sum);

        // greater of those two nos
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // if (a>b){
        // System.out.println(a+" is greater than "+b);
        // }
        // else{
        // System.out.println("b is greater than a "+ b);
        // }

        // print circumfrence of the circle
        // int rds=sc.nextInt();
        // double circumference=2*Math.PI*rds;
        // System.out.println("circumference : "+circumference);

        // // print area of the circle
        // double area=Math.PI*rds*rds;
        // System.out.println("Area : "+area);
        // // print area of the rectangle
        // int length=sc.nextInt();
        // int breadth=sc.nextInt();
        // double rectangleArea=length*breadth;
        // System.out.println("Area : "+rectangleArea);
        // // print area of the triangle
        // int base=sc.nextInt();
        // int height=sc.nextInt();
        // double triangleArea=0.5*base*height;
        // System.out.println("Area : "+triangleArea);
        // // print area of the square
        // int side=sc.nextInt();
        // double squareArea=side*side;
        // System.out.println("Area : "+squareArea);
        // // print area of the pentagon
        // int side1=sc.nextInt();
        // int side2=sc.nextInt();
        // int side3=sc.nextInt();
        // int side4=sc.nextInt();
        // int side5=sc.nextInt();
        // double pentagonArea=0.25*Math.sqrt(side1 + side2 + side3 + side4 + side5);
        // System.out.println("Area : "+pentagonArea);

        // elegible or not
        // int age=sc.nextInt();
        // if (age>18){
        // System.out.println("Elegible age is " +age);
        // }
        // else{
        // System.out.println("non-Elegible age is "+age);
        // }

        // write a infinite loop using do whlie loop
        // int i=6;
        // do{
        // System.out.println(i);
        // i++;
        // }while(i>5);

        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 0; i < n; i++) {
        // int j = sc.nextInt();
        // sum += j;
        // }
        // System.out.println("sum =" + sum);

        // write a program to calculate the the power of two numbers x to the power of
        // two n
        // int x = sc.nextInt();
        // int n = sc.nextInt();
        // int result = 1;
        // for (int i = 0; i < n; i++) {
        // result *= x;
        // }
        // System.out.println(result);

        // write a program to print the greatest common divisor of the two numbers / hcf

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int gcd = calculateGCD(a, b);
        // System.out.println("GCD of " + a + " and " + b + " is " + gcd);
        // int lcm = calculatelcm(a, b);
        // System.out.println("LCM of " + a + " and " + b + " is " + lcm);

        // LCM and HCF of the two numbers
        // int lcm = calculatelcm(a, b);
        // System.out.println("LCM of " + a + " and " + b + " is " + lcm);
        // int hcf = calculatehcf(a, b);
        // System.out.println("HCF of " + a + " and " + b + " is " + hcf);

        // Fibonacci series
        int n = sc.nextInt();
        // int first = 0, second = 1, next;
        // System.out.print(first + " " + second);
        // for (int i = 2; i < n; i++) {
        // next = first + second;
        // System.out.print(" " + next);
        // first = second;
        // second = next;
        // }

        fibo(n);
    }
}
