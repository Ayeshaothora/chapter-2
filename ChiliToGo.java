import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        final double ADULT_MEAL_PRICE = 7.00;
        final double CHILD_MEAL_PRICE = 4.00;
        
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the number of adult meals
        System.out.print("Enter the number of adult meals ordered: ");
        int adultMeals = scanner.nextInt();
        
        // Prompt the user for the number of child meals
        System.out.print("Enter the number of child meals ordered: ");
        int childMeals = scanner.nextInt();
        
        // Calculate total cost for each type of meal
        double totalAdultCost = adultMeals * ADULT_MEAL_PRICE;
        double totalChildCost = childMeals * CHILD_MEAL_PRICE;
        double totalCost = totalAdultCost + totalChildCost;
        
        // Display the result
        System.out.printf("Total for adult meals: $%.2f%n", totalAdultCost);
        System.out.printf("Total for child meals: $%.2f%n", totalChildCost);
        System.out.printf("Total for all meals: $%.2f%n", totalCost);
        
        scanner.close();
    }
}
