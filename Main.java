import java.util.Scanner;

// Other imports go here
// Do NOT change the class name
class TollBooth {
    int cash;
    int cars;

    public TollBooth() {
        cars = 0;
        cash = 0;
    }

    public void payingCar() {
        cash += 50;
        cars++;
        System.err.println(cars);
    }

    public void nopayCar() {
        this.cars += 1;
    }

    public void display() {
        System.out.println("Total Cash : " + cash + "/-");
        System.out.println("Total Cars : " + cars);
    }
}

class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        TollBooth obj = new TollBooth();
        char ch;

        while (true) {
            ch = sc.next().charAt(0);
            if (ch == 'p') {
                obj.payingCar();
            } else if (ch == 'n') {
                obj.nopayCar();
            } else {
                obj.display();
                break;
            }
        }
    }
}