import java.util.*;

public class pattrencheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        char[][] mat = new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.next().charAt(0);
            }
        }

        boolean flag = true;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]=='#'){
                    break;
                }
                if (j!=m-1)
                    s--;
                if (mat[i][j]=='.'){
                    s-=2;
                }
                else if (mat[i][j]=='*'){
                    s+=5;
                }
                
                if (s<k){
                    flag = false;
                    break;
                }
            }
            if (!flag) break;
        }

        if (flag){
            System.out.println("Yes");
            System.out.println("Strenth : "+s);
        }else{
            System.out.println("No");
        }

    }
}
