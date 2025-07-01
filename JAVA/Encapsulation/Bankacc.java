
package Encapsulation;

class BankAccount {
    private String accountHolder;
    private double balance;

    // Setter for accountHolder
    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for balance
    public void setBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

public class Bankacc {
    public static void main(String[] args) {
        BankAccount Parth = new BankAccount();
        Parth.setAccountHolder("Parth");
        Parth.setBalance(1000);
        Parth.deposit(300);
        Parth.withdraw(200);

        System.out.println("Account Holder: " + Parth.getAccountHolder());
        System.out.println("Final Balance: ₹" + Parth.getBalance());
    }
}
