// package lect5PatternsinJava;

import java.util.*;

public class f1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // System.out.println("Pattern 1");
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // System.out.println("Pattern 2");
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 || j == 0 || j == n - 1 || i == n - 1) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // System.out.println("Pattern 3");
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // System.out.println("Pattern 4");
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - i-1; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j < i+1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // System.out.println("Pattern 5");
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - i; j++) {
        // System.out.print(j+1);
        // }
        // System.out.println();
        // }

        // System.out.println("Pattern 6");
        // int l=1;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print(l);
        // l++;
        // }
        // System.out.println();
        // }

        // System.out.println("Pattern 7");
        // int j,k;
        // for (int i = 0; i < n; i++) {
        // if (i%2!=0){
        // k=1;
        // j=0;
        // }
        // else{
        // k=0;
        // j=1;
        // }
        // for (int l = 0; l <= i; l++) {
        // if (l%2!=0){
        // System.out.print(k);
        // }
        // else{
        // System.out.print(j);
        // }
        // }
        // System.out.println();
        // }

        // System.out.println("Pattern 7");-
        // int j, k;
        // for (int i = 0; i < n; i++) {
        // if (i % 2 != 0) {
        // k = 1;
        // j = 0;
        // } else {
        // k = 0;
        // j = 1;
        // }
        // for (int l = 0; l <= i; l++) {
        // if (l % 2 != 0) {
        // System.out.print(k);
        // } else {
        // System.out.print(j);
        // }
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }

        // for(int j=0;j<2*n-2*i-2;j++){
        // System.out.print(" ");
        // }

        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n-i-1; j++) {
        // System.out.print("*");
        // }

        // for(int j=0;j<=2*i-1;j++){
        // System.out.print(" ");
        // }

        // for (int j = 0; j < n-i-1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n-i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j <=2*i; j++) {
        // System.out.print(i+1);
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - i - 1; j++) {
        // System.out.print(" ");
        // }
        // for (int j = i; j>=1; j--) {
        // System.out.print(j+1);
        // }

        // for (int j = 0; j <=i; j++) {
        // System.out.print(j+1);
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n-i-1; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j <= 2 * i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 0; i < n-1; i++) {
        // for (int j = 0; j <=i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j < 2*n-2*i-3 ; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j < 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j < 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        //     char ch = (char)('A' + n-1);
        //     for (int j = 0; j < n; j++) {
        //         System.out.print((char)(ch-j)+" ");
        //     }
        //     System.out.println();
        // }                     
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j==0 || j==i){
                    if(j==0){
                        System.out.print("1");
                    }else{
                        System.out.print("*1");
                    }
                }else{
                    System.out.print("*"+(i));
                }
            }
            System.out.println();
        }
    }
}
