class student{
    int roll;
    String name;
    static int stdcnt=0;

    student(){
        stdcnt++;
    }
}
class q1statickeyword {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        student s1 = new student();
        s1.roll=123;
        s1.name="sam";
        s1.stdcnt=12;

        System.out.println(s1.stdcnt);
        student s2=new student();
        s2.roll=124;
        s2.name="sakshm";
        System.out.println(s2.stdcnt);
        
    }

}