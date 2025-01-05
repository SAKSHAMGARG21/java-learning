class Que {

    int[] arr;
    int size;
    int rear = -1;
    int front = -1;

    Que(int n) {
        arr = new int[n];
        this.size = n;
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public boolean isfull() {
        return (rear + 1) % size == front;
    }

    public void add(int data) {
        if (isfull()) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("que is empty");
            return -1;
        }

        int ft = arr[front];
        if (rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % size;
        }
        return ft;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("que is empty");
            return -1;
        }
        return arr[front];
    }

}

public class circularQue {

    public static void main(String[] args) {

        Que q = new Que(4);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.print(q.remove() +" ");
        q.add(5);
        System.out.print(q.remove()+" ");
        q.add(6);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }

    }
}
