public class QuartsToGallons {
    public static void main(String[] args) {
        // Declare a named constant for quarts per gallon
        final int QUARTS_PER_GALLON = 4;
        
        // Declare and initialize the quarts needed variable
        int quartsNeeded = 18;
        
        // Calculate the number of gallons and remaining quarts
        int gallons = quartsNeeded / QUARTS_PER_GALLON;
        int remainingQuarts = quartsNeeded % QUARTS_PER_GALLON;
        
        // Display the result
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + 
                           gallons + " gallons plus " + remainingQuarts + " quarts.");
    }
}
