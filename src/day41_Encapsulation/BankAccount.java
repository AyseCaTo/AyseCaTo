package day41_Encapsulation;

public class BankAccount {

    public String bankName, firstName, lastName;
    private String accountHolder, accountNumber;
    private double balance;


    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setBalance(double deposit) {
        balance += deposit;
    }

    public double availableBalance(){
        return balance;
    }

}
