class abc{
    void print(){
        System.out.println("Print");
    }

    void print(int a){
        System.out.println("Display");
    }
}
class q2polymorph {
    
    public static void main(String[] args) {

        // operator overloading in java only in + operator 
        // int a=10;
        // int b=30;
        // System.out.println("sum :"+a+b);
        // System.out.println('a'+"b");
        // System.out.println("a"+'b');
        // System.out.println('a' + 'b' + "c");

        abc obj=new abc();
        obj.print();


    }
}