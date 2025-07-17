package model;

public class CurrencyConverter {

    public static String converter(double dollars, double dollarsPrice){
        double reais = (dollarsPrice * 1.06) * dollars;
        return String.format("Amount to be paid in reais = %.2f", reais); 
    }
}
