
class SavingAccount {
    static int annualInterestRate;
    private int savingsBalance;

    SavingAccount(int annualInterestRate, int savingBalance) {
        if (annualInterestRate > 0 && savingBalance > 0) {
            SavingAccount.annualInterestRate = annualInterestRate;
            this.savingsBalance = savingBalance;
        }
    }

    public static int getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getSavingBalance() {
        return savingsBalance;
    }

    public void setSavingBalance(int savingBalance) {
        if (savingBalance > 0) {
            this.savingsBalance = savingBalance;
        } else {
            System.out.println("Anything is wrong with saving balance");
        }
    }

    public void calculateMonthlyInterest() {
        savingsBalance = savingsBalance + (savingsBalance * annualInterestRate) / 12;
    }

    static void modifyInterestRate(int value) {
        SavingAccount.annualInterestRate = value;
    }
}
public class Lab_8_6 {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(4, 2000);
        SavingAccount saver2 = new SavingAccount(4, 3000);

        System.out.println("Monthly interest for saver1: " + saver1.getSavingBalance());
        System.out.println("Monthly interest for saver2: " + saver2.getSavingBalance());

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Monthly interest for saver1: " + saver1.getSavingBalance());
        System.out.println("Monthly interest for saver2: " + saver2.getSavingBalance());

        SavingAccount.modifyInterestRate(5);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Monthly interest for saver1: " + saver1.getSavingBalance());
        System.out.println("Monthly interest for saver2: " + saver2.getSavingBalance());
    }
}