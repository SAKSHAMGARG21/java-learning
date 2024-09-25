import java.util.Scanner;

public class Strings {

    public static String revstr(String s) {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        // System.out.println(sb.toString());
        return sb.toString();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // first
        // String[] strs=str.split(" ");
        // StringBuilder res=new StringBuilder();
        // for (int i=strs.length-1;i>=0;i--){
        // res.append(strs[i]+" ");
        // }
        // System.out.println(res.toString().trim());

        // second
        // String[] strs=str.split(" ");
        // StringBuilder res=new StringBuilder();
        // for (String st:strs){
        // char[] ch=st.toCharArray();
        // int s=0,e=ch.length-1;
        // while (s<=e) {
        // char temp=ch[s];
        // ch[s]=ch[e];
        // ch[e]=temp;
        // s++;
        // e--;
        // }
        // for (char c: ch) {
        // res.append(c);
        // }
        // res.append(" ");
        // }
        // System.out.println(res.toString().trim());

        // thrid
        StringBuilder sb = new StringBuilder();
        String[]  strs=str.split("[1-9]");
        String[] numstrs=str.split("[a-z]");
        int l=0;
        for(String st:numstrs){
            if (!st.trim().isEmpty()){
                numstrs[l++]=st;
            }
        }
        l=0;
        for (String st:strs){
            if (!st.trim().isEmpty()){
                String revs=revstr(st);
                sb.append(revs);
            }else{
                sb.append(numstrs[l++]);
            }
        }
        System.out.println(sb.toString());
    }
}
