package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        int amount = 100;
        boolean valued = bankAccount.isAmountValid(amount);
        bankAccount.deposit(10000);
        bankAccount.withdraw(3000);
        System.out.println("balance = "+ bankAccount.getBalance());
    }
}
