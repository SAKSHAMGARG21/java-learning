import java.util.Scanner;

public class f1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=new int[n];

        // default initalization is with 0 values
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]);
        // }

        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)sc.nextInt();
        }    


        // int arr2[]={2,4,1,4,9,5};
        // for (int i = 0; i < arr2.length; i++) {
        //     System.out.print(arr2[i]+" ");
        // }

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);
        // System.out.println();
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }

        // sum of all the elements in the array 
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     sum+=arr[i];
        // }
        // System.out.println("Sum of first "+n+" natural numbers is: "+sum);
        // sc.close();

        // linear search 
        // int x=sc.nextInt();
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i]==x){
        //         System.out.println("Element found at index "+i);
        //         break;
        //     }
        // }

        
    }
}
