// Encapsulation means to  hide the internal details of an object from the outside world and only expose the necessary information through public methods.

// Encapsulation is to group  data and methods(functions) that operate on that data within a single unit, called a class or object.

// for eg : Account class group data members and  methods together.

// Data Hinding  : It is a mechanism to hide the suspecius data from the outside world.


// package Back;

class Account {
    public String name;
    protected String email;
    private int password;

    // getters & setters
    public void setpass(int password) {
        this.password = password;
    }

    public int getpass() {
        return this.password;
    }
}

public class bank {
    public static void main(String[] args) {

        Account u1 = new Account();
        u1.name = "thor";
        u1.email = "thor12@gmail.com";
        // we can't not access this field outside the class we use getters & setters to
        // set or get the password field in back class
        // u1.password = 1234;

        u1.setpass(2134);
        System.out.println(u1.getpass());
    }
}
