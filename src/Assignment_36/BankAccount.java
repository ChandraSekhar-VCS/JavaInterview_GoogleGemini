package Assignment_36;

abstract class BankAccount {
    private String accountNumber;
    private double balance;
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
