import java.util.*;

class Result {
    static int balancedString(String s) {
        // Write your code here
        int strlen = s.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < strlen; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{') {
                st.push(ch);
            } else {
                if (ch == ')' || ch == '}') {
                    if (!st.isEmpty()) {
                        char top = st.peek();
                        if ((top == '(' && ch == ')') || (top == '{' && ch == '}')) {
                            st.pop();
                        } else {
                            return i;
                        }
                    }else{
                        return i;
                    }
                }
            }
        }

        return (st.isEmpty()) ? -1:strlen;
    }
}

public class balanceBracket {
    public static void main(String[] args) {
        String str = "while(true)foo();}{()";
        int ans = Result.balancedString(str);
        System.out.println(ans);
    }
}
// testcases
// if(a(4)>9){foo(a(2));}
// for(i=0;i<a(3};i++){foo{);)
// while(true)foo();}{()
// if(x){
// if(x)}
// (({{}}){}{}())
// (
// }
