package entities;

import java.security.InvalidParameterException;

public interface InterstService {

    double getInterestRate();

    default double payment(double amount, int months) {
        if (months < 1){
            throw new InvalidParameterException("Months must be greater than 0");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}
