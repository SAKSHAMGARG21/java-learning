import java.util.Stack;

public class questions {

    public static void putAtbottom(int data, Stack<Integer> st) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }

        int top = st.pop();
        putAtbottom(data, st);
        st.push(top);
    }

    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        putAtbottom(top, st);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        // putAtbottom(34, st);
        reverseStack(st);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
