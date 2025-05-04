import java.util.*;

class Bill {
    int bill;
    int leftbill;
    int totalbal;
    int price;
    int qu;
    int[] notes=new int[5];

    public Bill(int pr, int qu, int[] arr) {
        this.price = pr;
        this.qu = qu;

        for (int i = 0; i < arr.length; i++) {
            notes[i] = arr[i];
        }
    }
}

class Cash extends Bill {
    public Cash(int pr, int qu, int[] arr) {
        super(pr, qu, arr);
    }

    void get_cash() {
        // Complete the input function, dont change the name.
        this.totalbal = price * qu;
        for (int i = 0; i < notes.length; i++) {
            if (i == 0) {
                bill += (2000 * notes[i]);
            } else if (i == 1) {
                bill += (500 * notes[i]);
            } else if (i == 2) {
                bill += (100 * notes[i]);
            } else if (i == 3) {
                bill += (50 * notes[i]);
            } else {
                bill += (10 * notes[i]);
            }
        }

        leftbill = totalbal-bill;
    }

    void display() {
        // Complete the display function, dont change the name.
        System.out.println("Need to pay: " + leftbill);
    }
}

public class calculateBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int qu = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(arr));

        Cash obj = new Cash(price, qu, arr);
        obj.get_cash();
        obj.display();

    }
}
