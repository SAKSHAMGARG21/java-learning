public class c2StringFormat1 {

    public static boolean isPalindrome(String input) {

        // Your code here
        int i = 0, j = input.length() - 1;
        while (i <= j) {

            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    // public static String reverse(String input) {

    // int j = input.length() - 1;

    // String news = "";
    // for (int l = j; l >= 0; l--) {
    // news += input.charAt(l);
    // }

    // return news;
    // }

    // public String reverse(String input) {
    // char[] charArray = input.toCharArray();
    // int i = 0;
    // int j = input.length() - 1;

    // while (i < j) {
    // // Swap characters at positions i and j
    // char temp = charArray[i];
    // charArray[i] = charArray[j];
    // charArray[j] = temp;

    // // Move the pointers towards each other
    // i++;
    // j--;
    // }

    // // Convert the char array back to a string
    // return new String(charArray);
    // }

    public String reverse(String input) {

        StringBuilder str = new StringBuilder(input);
        str.reverse();
        // Convert the char array back to a string
        return str.toString();
    }

    public static void main(String[] args) {
        // String str1 = "hello";
        // String str2 = "hello";
        // String str1 = new String("hello");
        // String str2 = new String("hello");
        // if (str1 == str2) {
        //     System.out.println("same");
        // } else {
        //     System.out.println("not Same");
        // }

        // String word = "radar";

        // char[] carr=word.toCharArray();

        // System.out.println(carr.toString());
        // boolean result = isPalindrome(word);

        // System.out.println(result); // Output: true

        // int count=0;
        // String input="Open AI ChatGpT";

        // String vow="aeiouAEIOU";

        // for(char c:input.toCharArray()){
        // if (vow.indexOf(c)!=-1){
        // count++;
        // }
        // }
        // System.out.println(count);

        // String word = "hello World";

        // String result = reverse(word);

        // String s1="Neeraj";
        // System.out.println(s1.toLowerCase());
        // String s1="Neeraj";
        // System.out.println(s1.toUpperCase());    

        // System.out.println(result); // Output: true

        // Bit masking algos
        // int a = 2;
        // int b = 3;

        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;

        // System.out.println("a:" + a + "\nb:" + b);

        // int a = 8;

        // int cnt = 0;
        // while (a != 0) {
        // cnt = cnt + (a & 1);
        // a = a >> 1;
        // }

        // System.out.println(cnt);
        // int arr[] = { 4, 1, 3, 5 };
        // int ar = 0;
        // for (int i = 0; i < 4; i++) {
        // ar = ar ^ arr[i];
        // }

        // int ar1 = 0;
        // for (int i = 0; i < 5; i++) {
        // ar1 = ar1 ^ i + 1;
        // }

        // System.out.println(ar ^ ar1);

        // n&x!=0;



    }
}