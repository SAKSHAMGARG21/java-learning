class Que {

    int[] arr;
    int size;
    int rear = -1;

    Que(int n) {
        arr = new int[n];
        this.size = n;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public void add(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }

        rear++;
        arr[rear] = data;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("que is empty");
            return -1;
        }

        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }

        rear--;
        return front;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("que is empty");
            return -1;
        }
        return arr[0];
    }

}

public class queUsingArr {

    public static void main(String[] args) {

        Que q=new Que(4);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }

    }
}
