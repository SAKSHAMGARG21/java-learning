// package t4Arrays;

// import java.util.Scanner;
// public class declaritionOf1darr {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         // statically allocate array In stack
//         // int nums[]={1,2,3,4,5};
//         // for (int i = 0; i < 5; i++) {
//         //     System.out.println(nums[i]);
//         // }
//         // dynamically allocate array In heap
//         // int nums[] = new int[4];
//         // nums[0]=1;
//         // nums[1]=2;
//         // nums[2]=3;
//         // nums[3]=4;
//         // for (int index = 0; index < 4; index++) {
//         //     System.out.println(nums[index]);
//         // }
//     }
// }
// this is how we take input form user
// package t4Arrays;
// import java.util.Scanner;
import java.util.Scanner;

public class DeclaritionOf1darr {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // System.out.print("Enter the size of array:");
            int n = sc.nextInt();

            int nums[] = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {

                System.out.print(nums[i] + " ");
            }
        }
    }
}
