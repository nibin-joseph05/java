abstract class BankAccount {
    public abstract boolean withdraw(double amount);
    public abstract void deposit(double amount);
    public abstract double getBalance();
}

class SavingsAccount extends BankAccount {
    private double balance = 0;
    
    public boolean withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Not enough balance in Savings Account!");
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }
    
    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return this.balance;
    }
}

class CurrentAccount extends BankAccount {
    private double balance = 0;
    
    public boolean withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Not enough balance in Current Account!");
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }
    
    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return this.balance;
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount();
        BankAccount current = new CurrentAccount();

        savings.deposit(2000);
        current.deposit(1500);

        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Current Account Balance: " + current.getBalance());

        current.withdraw(1000);
        savings.withdraw(100);

        System.out.println("Savings Account Balance after withdrawal: " + savings.getBalance());
        System.out.println("Current Account Balance after withdrawal: " + current.getBalance());
    }
}
