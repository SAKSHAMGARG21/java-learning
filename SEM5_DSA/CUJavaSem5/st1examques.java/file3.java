interface GeometricObject {
    public double getArea();

    public double getperimeter();
}

interface resizeable {
    void resize(int percent);
}

class Rectangle implements GeometricObject {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getperimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public String tostring() {
        return "[Rectangle length=" + length + "width=" + width + "]";
    }
}

class resizeRectangle extends Rectangle implements resizeable {
    public resizeRectangle() {
        super(0, 0);
    }

    public resizeRectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void resize(int percentage) {
        super.length = length * (percentage / 100);
        super.width = width * (percentage / 100);
    }
}

public class file3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Original rectangle: " + rectangle.length);
        System.out.println(rectangle.getperimeter());
        System.out.println(rectangle.getArea());

        
        resizeRectangle obj = new resizeRectangle(5,10);
        obj.resize(200);
        System.out.println("Resized rectangle: " + obj.length);
    }
}
