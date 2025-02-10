package model.entities;

import model.exceptions.DomainExceptions;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawlimit;


    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawlimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawlimit = withdrawlimit;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawlimit() {
        return withdrawlimit;
    }

    public void setWithdrawlimit(Double withdrawlimit) {
        this.withdrawlimit = withdrawlimit;
    }


    public void deposit(Double amount) {
        balance += balance;
    }

    public void withdraw(Double amount) {
        validateWithdraw(amount);
        balance -= amount;
    }

    private void validateWithdraw(double amount){
        if (amount > withdrawlimit) {
            throw new DomainExceptions("The amount exceed withdrow limit");
        }
        if (amount > balance) {
           throw new DomainExceptions("The amount exceeds inicial balance");
        }
    }

}
