
public class hashmap {
    public static void main(String[] args) {
        String str1 = "applde";
        String str2 = "banana";

        int result = str1.compareTo(str2);

        if (result < 0) {
            System.out.println(str1 + " is less than " + str2);
        } else if (result == 0) {
            System.out.println(str1 + " is equal to " + str2);
        } else {
            System.out.println(str1 + " is greater than " + str2);
        }
    }
}
