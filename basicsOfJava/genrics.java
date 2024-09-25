class mygen<T1,T2>{

    int age;
    private T1 name;
    private T2 number;

    public mygen(int  age, T1 name, T2 number) {
        this.age = age;
        this.name=name;
        this.number=number;
    }

    public T1 getName() {
        return name;
    }

    public void setName(T1 name) {
        this.name = name;
    }

    public T2 getNumber() {
        return number;
    }

    public void setNumber(T2 number) {
        this.number = number;
    }
}
public class genrics{
    public static void main(String[] args) {
        // TODO code application logic here

        mygen<String,Integer>  obj = new mygen<String,Integer>(25,"Rahul",123);
        System.out.println(obj.age);
        System.out.println(obj.getName());
        System.out.println(obj.getNumber());


    }
}