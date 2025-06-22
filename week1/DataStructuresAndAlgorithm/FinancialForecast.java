public class FinancialForecast {

    // Recursive method to calculate future value
    public static double forecastValue(int year, double rate, double initialValue) {
        // Base case
        if (year == 0) {
            return initialValue;
        }
        // Recursive case
        return forecastValue(year - 1, rate, initialValue) * (1 + rate);
    }

    public static void main(String[] args) {
        double initialValue = 1000; // Initial investment
        double growthRate = 0.05;   // 5% growth
        int forecastYears = 10;     // Forecast for 10 years

        double result = forecastValue(forecastYears, growthRate, initialValue);
        System.out.printf("Forecasted value after %d years: %.2f\n", forecastYears, result);
    }
}
