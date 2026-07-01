public class Financial_forecasting {
    public static void main(String[] args) {
        double currentAmount = 10000;
        double growthRate = 0.10;
        int years = 5;

        System.out.printf("Starting Amount: ₹%.2f\n", currentAmount);
        System.out.println("Annual Growth Rate: 10%");

        for (int i = 1; i <= years; i++) {
            currentAmount *= (1 + growthRate);  // Compound interest formula
            System.out.printf("Year %d: ₹%.2f\n", i, currentAmount);
        }

        System.out.printf("Final Forecasted Value after %d years: ₹%.2f", years, currentAmount);
    }
}