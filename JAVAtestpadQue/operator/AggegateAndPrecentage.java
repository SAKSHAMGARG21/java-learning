public class AggegateAndPrecentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int f=sc.nextInt();
        int sum= a+b+c+d+f;
        System.out.print(sum+" ");
        int pre=(sum/5);
        System.out.print(pre);
    }
}
