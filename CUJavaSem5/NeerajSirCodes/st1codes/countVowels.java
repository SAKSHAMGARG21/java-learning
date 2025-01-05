import java.util.Scanner;

public class countVowels {
    // public static int count = 0;
    // public static void countVows(String s) {
    //     String vow = "aeiouAEIOU";
    //     for (char c : s.toCharArray()) {
    //         if (vow.indexOf(c) != -1) {
    //             count++;
    //         }
    //     }
    // }

    public static int countVows2(String s) {
        String vow = "aeiouAEIOU";
        int count=0;
        for (char c : s.toCharArray()) {
            if (vow.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // countVows(s);
        int count=countVows2(s);
        System.out.println(count);
    }
}