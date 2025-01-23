package entities;

public final class SavingsAccount extends Account{

    private Double interrestRate;
    public SavingsAccount(){
        super();
    }
    public SavingsAccount(Integer number, String holder, Double balance, Double interrestRate) {
        super(number, holder, balance);
        this.interrestRate = interrestRate;
    }

    public Double getInterrestRate() {
        return interrestRate;
    }

    public void setInterrestRate(Double interrestRate) {
        this.interrestRate = interrestRate;
    }

    public void updateBalance(){
        balance += balance * interrestRate;
    }


    public Double getBalance() {
        return super.getBalance();
    }

    @Override
    public void withdraw(double amount){
        balance -= amount;
    }
}
