package Assignment_36;

public class Test {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountNumber("12345");
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        System.out.println(savingsAccount.getAccountNumber());
        System.out.println(savingsAccount.getBalance());
    }
}
