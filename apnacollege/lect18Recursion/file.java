public class file {

    public static void towerofhanoi(int n, String src, String helper, String dest) {

        if (n == 1) {
            System.out.println("Move disk 1 from source " + src + " to destination " + dest);
            return;

        }

        towerofhanoi(n - 1, src, dest, helper);
        System.out.println("Move disk  " + n + " from source " + src + " to destination " + dest);
        towerofhanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {

        int n = 2;
        towerofhanoi(n, "s", "h", "d");
    }
}
