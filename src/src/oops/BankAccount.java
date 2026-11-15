package oops;

public class BankAccount
{
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName)
    {
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }

    public void withdraw(double amount)
    {
        if (amount <= 0)
        {
            throw new IllegalArgumentException("Amount must be greater than 0.");
        }

        if  (amount > balance)
        {
            throw new IllegalArgumentException("Insufficient balance.");
        }

        balance = balance - amount;
    }

    public void deposit(double amount)
    {
        if  (amount <= 0)
        {
            throw new IllegalArgumentException("Amount must be greater than 0.");
        }
        balance = balance + amount;
    }

    // Balance getters/setter
    public double getBalance()
    {
        return balance;
    }

    // AccountHolderName getters/setters
    public String getAccountHolderName()
    {
        return accountHolderName;
    }



}
