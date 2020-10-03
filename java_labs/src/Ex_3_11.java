public class Ex_3_11 {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green ", 50.00);
        Account account2 = new Account("John Blue ", 20);
        System.out.println(account1.getName() + account1.getBalance());
        account2.withdraw(10);
        System.out.println(account2.getName() + account2.getBalance());
    }
}
class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0)
            this.balance = balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;


    }

    public void withdraw(double balance) {
        if (balance > this.balance) {
            System.out.println("Withdrawal amount exceeded account balance.");
        } else {
            this.balance = this.balance - balance;
        }
    }
}
