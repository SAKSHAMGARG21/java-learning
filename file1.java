import java.util.*;

public class file1 {

    public static void subSeq(String str,String output,int idx,ArrayList<String> ans){
        if (idx == str.length()){
            ans.add(output);
            return;
        }

        subSeq(str,output+str.charAt(idx),idx+1,ans);
        subSeq(str,output,idx+1,ans);
    }

    public static boolean checkplan(String str,int n){
        int s=0;
        int e=n-1;

        while(s<e){
            if (str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    public static int getLongestPlan(String str2){
        int n = str2.length();

        ArrayList<String> ans= new ArrayList<>();
        String output="";

        subSeq(str2,output,0,ans);


        int mx=-1;
        String res=new String();
        for (String str: ans){
            if(checkplan(str,str.length())){
                if (mx < str.length()){
                    res = str;
                    mx=str.length();
                }
            }
        }
        return mx;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str1="<<>>";
        String str2="bbbab";

        int res = getLongestPlan(str2);
        System.out.println(res);

    }
}
