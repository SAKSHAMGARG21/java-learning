import java.util.Scanner;

interface GeoObj {
    public double getPerimeter();
    public double getArea();
}

interface Resizable {
    public void resize(int prct);
}

class Square implements GeoObj {
    double side;

    public Square(int side) {
        this.side = (double) (side);
    }

    public double getPerimeter() {
        double res = (4 * side);
        return res;
    }

    public double getArea() {
        double res = (side * side);
        return res;
    }
}

class ResizableSquare extends Square implements Resizable {

    double newarea;
    public ResizableSquare(int side) {
        super(side);
    }

    // public void setnewresize(int side) {
    //     this.side = (double) side;
    // }

    public void resize(int prct) {
        newarea = (side * (prct / 100.0));
    }

    public void printnew() {
        System.out.println(newarea);
    }

    public double resizeparameter() {
        double newside = 4 * newarea;
        return newside;
    }

    public double resizearea() {
        double res = (newarea * newarea);
        return res;
    }

}

public class file2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        GeoObj obj = new Square(a);
        double perimeter = obj.getPerimeter();
        double area = obj.getArea();
        System.out.println("Square[side=" + a + ".0]");
        System.out.printf("%.2f\n", perimeter);
        System.out.printf("%.2f\n", area);

        GeoObj obj1 = new Square(b);
        double perimeter1 = obj1.getPerimeter();
        double area1 = obj1.getArea();
        System.out.println("Square[side=" + b + ".0]");
        System.out.printf("%.2f\n", perimeter1);
        System.out.printf("%.2f\n", area1);
        ResizableSquare obj2 = new ResizableSquare(b);
        obj2.resize(c);
        double perimeter2 = obj2.resizeparameter();
        double area2 = obj2.resizearea();
        System.out.printf("%.2f\n", perimeter2);
        System.out.printf("%.2f\n", area2);

        // ("[\\s]|[.]+|[,]+|[1-9]|[a-z]|[A-Z]")
        // ("[^1-9]+");
        // int number = 4;
        // float floatNumber = (float) number;
        // String formattedNumber = String.format("%.2f", floatNumber);
        // System.out.println(formattedNumber);
    }
}
