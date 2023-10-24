package homework_week_7;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Programme_20_FindValueInArray {
    public static void main(String[] args) {
        // Define an array of numbers
        int[] numbers = {5, 12, 8, 3, 7};
        // Value to search for
        int targetValue = 12;
        // Flag to indicate if the value is found
        boolean found = false;
        // Iterate through the array to check if it contains the target value
        for (int number : numbers) {
            if (number == targetValue) {
                found = true;
                break; // Exit the loop as soon as the value is found
            }
        }
        // Print the result
        if (found) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }
}
