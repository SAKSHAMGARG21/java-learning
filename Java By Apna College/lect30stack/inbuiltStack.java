import java.util.Stack;
public class inbuiltStack {
    public static void main(String[] args) {
        Stack st = new Stack(); // Use raw type without generics
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }

        Stack<Integer> st2 = new Stack();

        // Push elements onto the st2
        st2.push(10);
        st2.push(20);
        st2.push(30);

        System.out.println("Size: " + st2.size()); // 3

        // Pop elements from the st2
        System.out.println("Popped: " + st2.pop()); // 30
        System.out.println("Popped: " + st2.pop()); // 20

        // Peek at the top element
        System.out.println("Top element: " + st2.peek()); // 10
    }
}