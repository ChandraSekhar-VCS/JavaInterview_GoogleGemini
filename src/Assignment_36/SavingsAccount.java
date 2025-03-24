package Assignment_36;

public class SavingsAccount extends BankAccount{
    private double balance = 0.0;
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount);
    }
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn " + amount);
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
