package entities;

public class CurrencyConverter {
    public static double dollar;

    public static double dollarToReal;


    public static double iofCalculation(){
        return (dollar * dollarToReal) * 0.06;
    }

    public static String amount() {
        return "Amount to be paid in reais = " + ((dollar * dollarToReal) + iofCalculation());
    }
}
