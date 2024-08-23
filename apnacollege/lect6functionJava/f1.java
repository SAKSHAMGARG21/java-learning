import java.util.Scanner;

public class f1 {
    public static void stringprint(String str){
        System.out.println(str);
        return ;
    }

    public static int sumarrayprint(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static int printsum(int a, int b){
        return a+b;
    }
    public static int printprod(int a, int b){
        return a*b;
    }
    public static void  printfact(int n){
        if (n==0) System.out.println("Invalid number");
        int fact=1;
        for (int i = n; i >=1; i--) {
            fact=fact*i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
    public static void  reversearr(int[] arr1){

        for (int i = 0; i <=arr1.length/2; i++) {
            int temp=arr1[i];
            arr1[i]=arr1[arr1.length-1-i];
            arr1[arr1.length-1-i]=temp;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int a = 10, b = 20;
        // int sum = a + b;
        // System.out.println("Sum of " + a + " and " + b + " is " + sum);

        // System.out.println("Enter the string : ");
        // String str=sc.nextLine();

        // System.out.println("Enter the array : ");
        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]=sc.nextInt();
        // }

        // int sum=sumarrayprint(arr);
        // System.out.println(sum);
        // stringprint(str);

        // int a=sc.nextInt();
        // int b=sc.nextInt();

        // int sum=printsum(a,b);
        // System.out.println("Sum of a and b : " + sum);
        // int prod=printprod(a, b);
        // System.out.println("Product is "+prod);
        // printfact(a);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        reversearr(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }    
}
