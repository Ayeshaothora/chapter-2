import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        final double DOZEN_PRICE = 3.25;
        final double SINGLE_EGG_PRICE = 0.45;
        final int EGGS_PER_DOZEN = 12;
        
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the number of eggs
        System.out.print("Enter the number of eggs you want to order: ");
        int totalEggs = scanner.nextInt();
        
        // Calculate dozens and loose eggs
        int dozens = totalEggs / EGGS_PER_DOZEN;
        int looseEggs = totalEggs % EGGS_PER_DOZEN;
        
        // Calculate total cost
        double totalCost = (dozens * DOZEN_PRICE) + (looseEggs * SINGLE_EGG_PRICE);
        
        // Display the result
        System.out.printf("You ordered %d eggs. That's %d dozen at $%.2f per dozen and %d loose eggs at %.2f cents each for a total of $%.2f.%n", 
                          totalEggs, dozens, DOZEN_PRICE, looseEggs, SINGLE_EGG_PRICE, totalCost);
        
        scanner.close();
    }
}
