package model;

public class AccountManager {
    private String name;
    private int accountNumber;
    private double value;


    public AccountManager(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public AccountManager(String name, int accountNumber, double initialValue) {
        this.name = name;
        this.accountNumber = accountNumber;
        deposit(initialValue);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getValue() {
        return this.value;
    }

    public void deposit(double ammount){
        value += ammount;
    }

    public void withdraw(double ammount){
        value -= ammount + 5;
    }

    public String toString(){
        return "Account " + accountNumber + ", Holder: " + name + ", Balance: $ " + value;
    }
}
