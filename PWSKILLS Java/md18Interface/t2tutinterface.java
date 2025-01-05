
interface computer {
    void compilecode();
}

class laptop implements computer {

    public void compilecode() {
        System.out.println("Laptop is compiling code");
    }
}

class desktop implements computer {
    public void compilecode() {
        System.out.println("Desktop is compiling code");
    }
}

class developer{
    public void buildapp(computer obj){
        System.out.println("Building app");
        obj.compilecode();
    }
}

public class t2tutinterface {
    public static void main(String[] args) {
        computer obj=new desktop();
        computer obj1=new laptop();

        developer dev=new developer();
        dev.buildapp(obj);
        dev.buildapp(obj1);

    }
}
