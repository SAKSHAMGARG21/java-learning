import java.util.ArrayList;
import java.util.List;

class BankAccount {
    private int number;
    private int balance;

    public BankAccount(int number, int balance) {
        this.number = number;
        this.balance = balance;
    }

    public void withdraw(int amt) {
        balance -= amt;
    }

    public void deposit(int amt) {
        balance += amt;
    }

    public int getBalance() {
        return balance;
    }
}

class MinMaxAccount extends BankAccount {
    private List<Integer> arr;

    public MinMaxAccount(int n, int bal) {
        super(n, bal);
        arr = new ArrayList<>();
        arr.add(bal);
    }

    @Override
    public void withdraw(int amt) {
        super.withdraw(amt);
        arr.add(super.getBalance());
    }

    @Override
    public void deposit(int amt) {
        super.deposit(amt);
        arr.add(super.getBalance());
    }

    public int getMin() {
        int mn = Integer.MAX_VALUE;
        for (int balance : arr) {
            mn = Math.min(mn, balance);
        }
        return mn;
    }

    public int getMax() {
        int mx = Integer.MIN_VALUE;
        for (int balance : arr) {
            mx = Math.max(mx, balance);
        }
        return mx;
    }

}

public class minmaxbal {
    public static void main(String[] args) {
        MinMaxAccount account = new MinMaxAccount(1234, 500);
        System.out.println("Opening Balance: " + account.getBalance());
        account.deposit(1500);
        System.out.println("Balance after deposit 1500: " + account.getBalance());
        account.deposit(500);
        System.out.println("Balance after deposit 500: " + account.getBalance());
        account.withdraw(1800);
        System.out.println("Balance after withdraw 1800: " + account.getBalance());
        account.deposit(4500);
        System.out.println("Balance after deposit 4500: " + account.getBalance());
        account.withdraw(4600);
        System.out.println("Balance after withdraw 4600: " + account.getBalance());
        System.out.println("Minimum Balance: " + account.getMin());
        System.out.println("Maximum Balance: " + account.getMax());
    }
}
