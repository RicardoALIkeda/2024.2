public class BankAccount{
    private double balance;
    private String accountHolderName;
    private long accountNumber;
    

    public BankAccount(String accountHolderName, long accountNumber, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public long getAccountNumber(){
        return accountNumber;
    }
}