import java.util.*;

public class countgreaterthanhalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();        
        }

        int hf=n/2;
        for (int i = 0; i < arr.length; i++) {
            int c=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    c++;
                }
            }
            if (c>=hf){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
