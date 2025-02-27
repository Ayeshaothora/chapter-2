import java.util.Scanner;

public class MileConversionsInteractive {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of miles
        System.out.print("Enter the number of miles: ");
        double miles = scanner.nextDouble();
        
        // Conversion factors
        final double MILES_TO_KILOMETERS = 1.60934;
        final double MILES_TO_FEET = 5280;
        final double MILES_TO_METERS = 1609.34;
        final double MILES_TO_INCHES = 63360;
        
        // Perform conversions
        double kilometers = miles * MILES_TO_KILOMETERS;
        double feet = miles * MILES_TO_FEET;
        double meters = miles * MILES_TO_METERS;
        double inches = miles * MILES_TO_INCHES;
        
        // Display results
        System.out.println(miles + " miles is equivalent to:");
        System.out.println(kilometers + " kilometers");
        System.out.println(feet + " feet");
        System.out.println(meters + " meters");
        System.out.println(inches + " inches");
        
        // Close the scanner
        scanner.close();
    }
}
