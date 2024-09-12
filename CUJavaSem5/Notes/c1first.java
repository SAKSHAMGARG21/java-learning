// package CUJava;

import java.util.Scanner;

public class c1first {
    public static void main(String[] args) {
        // System.out.println("hello");
        // for (int i = 0; i < args.length; i++) {
        // System.out.println(args[i]);
        // }

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // if ((n & 1) == 0) {
        // System.out.println("Even");
        // } else {
        // System.out.println("odd");
        // }

        // if ((n % 4 == 0 ) && (n % 400 == 0) || (n % 100 != 0)) {
        // System.out.println("Leep Year");
        // } else {
        // System.out.println("Not Leep Year");
        // }

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println("Its a leap Year ");
            } else {
                System.out.println("Not a leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }

        // boolean isprime = true;
        // if (n <= 1) {
        // isprime = false;
        // } else if (n == 1) {
        // isprime = false;
        // } else {
        // for (int i = 2; i * i < n; i++) {
        // if (n % i == 0) {
        // isprime = false;
        // break;
        // }
        // }
        // }
        // if(isprime){
        // System.out.println("n is prime");
        // }else{
        // System.out.println("n is not prime");
        // }

        
    }
}
