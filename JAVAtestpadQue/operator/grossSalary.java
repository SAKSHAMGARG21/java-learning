public class grossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Correct percentage calculations
        int hra = (10 * n) / 100;
        int da = (20 * n) / 100;
        int ds = n + hra + da;
        System.out.println(ds);
    }
}
