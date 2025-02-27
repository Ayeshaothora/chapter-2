public class MileConversions {
    public static void main(String[] args) {
        // Named constants
        final int INCHES_PER_FOOT = 12;
        final int FEET_PER_YARD = 3;
        final int YARDS_PER_MILE = 1760;
        final int FEET_PER_MILE = YARDS_PER_MILE * FEET_PER_YARD;
        final int INCHES_PER_MILE = FEET_PER_MILE * INCHES_PER_FOOT;
        
        // Declare and initialize miles variable
        double miles = 5.0; // You can change this value as needed
        
        // Compute conversions
        double inches = miles * INCHES_PER_MILE;
        double feet = miles * FEET_PER_MILE;
        double yards = miles * YARDS_PER_MILE;
        
        // Display results
        System.out.println(miles + " miles is equivalent to:");
        System.out.println(inches + " inches");
        System.out.println(feet + " feet");
        System.out.println(yards + " yards");
    }
}
