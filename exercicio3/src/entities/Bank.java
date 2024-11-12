package entities;

public class Bank {

    private int number;
    private String holder;
    private double saldo;

    public Bank(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Bank(int number, String holder, double inicialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(inicialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposit(double amount){
        saldo += amount;
    }

    public void withdraw(double amount){
        saldo -= amount + 5.00;
    }

    @Override
    public String toString() {
        return "Account: " + number +
                ", Holder: " + holder +
                ", Balance: $" + String.format("%.2f", saldo);
    }
}
