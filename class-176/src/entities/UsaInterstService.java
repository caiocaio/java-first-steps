package entities;

public class UsaInterstService implements InterstService {

    private double interestRate;

    public UsaInterstService(double interestRate) {
        this.interestRate = interestRate;
    }


    @Override
    public double getInterestRate() {
        return interestRate;
    }


}
