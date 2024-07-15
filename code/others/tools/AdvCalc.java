package code.others.tools;
public class AdvCalc extends Calc {

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}
