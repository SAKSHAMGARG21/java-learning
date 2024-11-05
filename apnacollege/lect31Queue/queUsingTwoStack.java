import java.util.Stack;

class Que {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public boolean isEmpty() {
        return s1.isEmpty();
    }

    public void add(int data) {

        if (!s1.isEmpty()){
            s2.push(s1.pop());
        }

        s1.push(data);

        if(!s2.isEmpty()){
            s1.push(s2.pop());
        }

    }

    public int remove() {

        if (isEmpty()){
            System.out.println("que is empty");
            return -1;
        }

        return s1.pop();

    }

    public int peek() {
        if(isEmpty()){
            System.out.println("que is empty");
            return -1;
        }

        return s1.peek();
    }

}

public class queUsingTwoStack {

    public static void main(String[] args) {

        Que q = new Que();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }

    }
}