import java.util.Scanner;

class calc{

    public int add(int arr[]){
        int res=0;
        for (int i : arr) {
            res+=i;
        }
        return res;
    }

}
public class AnonomusArr {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // int n = sc.nextInt();

            // int arr[]=new int[n];
            // for (int i = 0; i < arr.length; i++) {
            //     arr[i]=sc.nextInt();
            // }

            int arr[]={1,2,3,4,5};
            calc obj=new calc();

            int ans=obj.add(arr);
            // int ans=obj.add(new int[]{1,2,3,4,5});
            System.out.println(ans);
        }
    }
}
