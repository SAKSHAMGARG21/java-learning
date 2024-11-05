import java.util.*;

class Stack {
    ArrayList<Integer>  list = new ArrayList<Integer>();
    public boolean isEmpty() {
        return list.size()==0;
    }

    public void push(int data) {
        list.add(data);
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }

        return list.get(list.size()-1);
    }

}

public class stackusingArrayList {

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
