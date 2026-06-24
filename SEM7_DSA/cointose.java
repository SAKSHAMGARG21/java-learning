public class cointose {

    public static void solve(int n,String str){
        if (n==0){
            System.out.println(str);
            return ;
        }

        if (str.length()==0 || str.charAt(str.length()-1)!='H'){
            solve(n-1,str+"H");
        }
        if (str.length()==0 || str.charAt(str.length()-1)!='T'){
            solve(n-1,str+"T");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        solve(n,"");
    }
}
