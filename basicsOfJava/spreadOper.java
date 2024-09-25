public class spreadOper {
    public static void main(String[] args) {
        int sum = sum(1, 2, 3, 4, 5);
        System.out.println("Sum: " + sum);
    }

    public static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
