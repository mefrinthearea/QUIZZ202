package dynamic.expenses;

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250;
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000;
        int taxes = 63 * 1000;
        int electricityBills = 195 * 100;
        int waterBills = 98;
        int parkingRent = 21 * 100;
        int GasBills = 45;

        int otherExpenses = taxes + waterBills + GasBills + electricityBills + parkingRent;
        int totalExpenses = totalCostOfBeans + otherExpenses;

        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, otherExpenses);

        System.out.println("Expenses:" + totalExpenses);
        System.out.println("Others:" + otherExpenses);
        System.out.println("Profit: " + profit);
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int otherExpenses) {
        double profit = (pricePerCoffee * numCoffeeSold - totalCostOfBeans - otherExpenses) / 100.0;

        return profit;
    }
}
