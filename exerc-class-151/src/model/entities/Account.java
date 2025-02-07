package model.entities;

import model.exceptions.DomainExceptions;

public class Account {
    private Integer number;
    private String holder;
    private Double initialBalance;
    private Double withdrawlimit;


    public Account() {
    }

    public Account(Integer number, String holder, Double initialBalance, Double withdrawlimit) {
        this.number = number;
        this.holder = holder;
        this.initialBalance = initialBalance;
        this.withdrawlimit = withdrawlimit;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(Double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public Double getWithdrawlimit() {
        return withdrawlimit;
    }

    public void setWithdrawlimit(Double withdrawlimit) {
        this.withdrawlimit = withdrawlimit;
    }

    public void withdraw(double amount){
        if (amount <= initialBalance) {
           throw new DomainExceptions("The amount exceeds inicial balance");
        }
        if (amount > withdrawlimit) {
            throw new DomainExceptions("The amount exceed withdrow limit");
        }

    }


}
