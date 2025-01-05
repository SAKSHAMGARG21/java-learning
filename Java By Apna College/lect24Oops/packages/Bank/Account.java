package Bank;

// public class Account {
//     public String name;
//     public String password;

//     public String getpass() {
//         return password;
//     }
// }

public class Account {
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
