import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        final int QUARTS_PER_GALLON = 4;
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the number of quarts: ");
        int quarts = scanner.nextInt();
        
        // Convert quarts to gallons
        int gallons = quarts / QUARTS_PER_GALLON;
        int remainingQuarts = quarts % QUARTS_PER_GALLON;
        
        // Display the result
        System.out.println(quarts + " quarts is " + gallons + " gallons and " + remainingQuarts + " quarts.");
        
        // Close the scanner
        scanner.close();
    }
}
