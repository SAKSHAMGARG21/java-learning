// Method Overloading is writing a function with the same name but different parameters

class Calc {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class v2methodOverloading {
    public static void main(String[] args) {

        Calc obj = new Calc();
        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(2, 3, 4));
        System.out.println(obj.add(2.2, 3.3));
    }
}
