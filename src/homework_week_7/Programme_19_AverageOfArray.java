package homework_week_7;

/**
 * Write a Java program to calculate the average value of array elements
 */
public class Programme_19_AverageOfArray {
    public static void main(String[] args) {
        // Define an array of numbers
        double[] numbers = {7.5, 11.4, 9.7, 2.2, 7.4};
        // Initialize a variable to store the sum
        double sum = 0.0;
        // Iterate through the array and add each element to the sum
        for (double number : numbers) {
            sum += number;
        }
        // Calculate the average by dividing the sum by the number of elements
        double average = sum / numbers.length;
        // Print the average of the array
        System.out.println("Average of the array: " + average);
    }

}
