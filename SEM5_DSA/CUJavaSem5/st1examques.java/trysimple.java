import java.util.Scanner;

interface GeoObj {
    public double getPerimeter();

    public double getArea();
}

interface Resizable {
    public void resize(int prct);
}

class Square implements GeoObj {
    public double getPerimeter() {
        return 0;
    }

    public double getArea() {
        return 0;
    }
}

class ResizableSquare extends Square implements Resizable {
    public void resize(int prct) {
    }

}

public class trysimple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double resize = (b * (c / 100.0));
        // System.out.println(resize);
        System.out.println("Square[side=" + a + ".0]");
        System.out.printf("%.2f\n", 4 * (double) a);
        System.out.printf("%.2f\n", (double) a * a);

        System.out.println("Square[side=" + b + ".0]");
        System.out.printf("%.2f\n", 4 * (double) b);
        System.out.printf("%.2f\n", (double) a * b);
        System.out.printf("%.2f\n", 4 * resize);
        System.out.printf("%.2f\n", resize * resize);

        // ("[\\s]|[.]+|[,]+|[1-9]|[a-z]|[A-Z]")
        // ("[^1-9]+");
        // int number = 4;
        // float floatNumber = (float) number;
        // String formattedNumber = String.format("%.2f", floatNumber);
        // System.out.println(formattedNumber);
    }
}
