import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {
        // Define constants
        final double ADULT_MEAL_PRICE = 7.00;
        final double CHILD_MEAL_PRICE = 4.00;
        final double ADULT_MEAL_COST = 4.35;
        final double CHILD_MEAL_COST = 3.10;

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter number of adult meals sold: ");
        int adultMeals = input.nextInt();
        System.out.print("Enter number of child meals sold: ");
        int childMeals = input.nextInt();
        
        // Calculate total sales
        double totalAdultSales = adultMeals * ADULT_MEAL_PRICE;
        double totalChildSales = childMeals * CHILD_MEAL_PRICE;
        double totalSales = totalAdultSales + totalChildSales;
        
        // Calculate total cost
        double totalAdultCost = adultMeals * ADULT_MEAL_COST;
        double totalChildCost = childMeals * CHILD_MEAL_COST;
        
        // Calculate profit
        double adultProfit = totalAdultSales - totalAdultCost;
        double childProfit = totalChildSales - totalChildCost;
        double totalProfit = adultProfit + childProfit;
        
        // Display results
        System.out.println("\nSales Summary:");
        System.out.printf("Total sales from adult meals: $%.2f\n", totalAdultSales);
        System.out.printf("Total sales from child meals: $%.2f\n", totalChildSales);
        System.out.printf("Total profit from adult meals: $%.2f\n", adultProfit);
        System.out.printf("Total profit from child meals: $%.2f\n", childProfit);
        System.out.printf("Grand total profit: $%.2f\n", totalProfit);

        // Close scanner
        input.close();
    }
}

