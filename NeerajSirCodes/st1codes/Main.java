import java.util.Scanner;

public class Main {
    public static void convertSectoDay(int n) {
        int day = n / (24 * 3600);
        n = n % (24 * 3600);
        int hour = n / 3600;
        n %= 3600;
        int minutes = n / 60;
        n %= 60;
        int seconds = n;

        System.out.println(day + " days " + hour + " hours " + minutes + " minutes " + seconds + " seconds ");
    }

    // Driver code
    public static void main(String[] args) {
        // Given n is in seconds
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        convertSectoDay(n);
    }
}