package FinancialForecasting;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double forecastValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return forecastValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialValue = 10000;         // ₹10,000
        double annualGrowthRate = 0.07;      // 7% annual growth
        int forecastYears = 5;

        double futureValue = forecastValue(initialValue, annualGrowthRate, forecastYears);

        System.out.printf("Forecasted Value after %d years: ₹%.2f%n", forecastYears, futureValue);
    }
}

