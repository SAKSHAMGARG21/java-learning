import java.util.*;

public class q56 {

    // public static boolean checkLength(String a,String b,String res){

    // }

    public static boolean shufflecheck(String a,String b,String res){
        int n = a.length();
        int m = b.length();
        Map<Character,Integer> mp =new HashMap<>();

        for (char ch:a.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        for (char ch: b.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        for(char ch : res.toCharArray()){
            if(m){
                
            }
        }
    }
    public static void main(String[] args) {
        String a = "XY";
        String b = "12";
        String[] results = { "1XY2", "Y1X2", "Y21XX" };

        for (String result : results) {
            // if (checkLength(a, b, result) && shuffleCheck(a, b, result)) {
            if (shuffleCheck(a, b, result)) {
                System.out.println(result + " is a valid shuffle of " + a + " and " + b);
            } else {
                System.out.println(result + " is not a valid shuffle of " + a + " and " + b);
            }
        }

    }
}
