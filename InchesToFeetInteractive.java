import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        final int INCHES_PER_FOOT = 12;
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the number of inches: ");
        int totalInches = scanner.nextInt();
        
        // Convert inches to feet and inches
        int feet = totalInches / INCHES_PER_FOOT;
        int inches = totalInches % INCHES_PER_FOOT;
        
        // Display the result
        System.out.println(totalInches + " inches is " + feet + " feet and " + inches + " inches.");
        
        // Close scanner
        scanner.close();
    }
}
