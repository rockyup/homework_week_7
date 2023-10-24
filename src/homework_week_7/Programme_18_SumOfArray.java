package homework_week_7;

public class Programme_18_SumOfArray {
    public static void main(String[] args) {
        // Define an array of numbers
        int[] numbers = {6, 12, 9, 5, 11};
        // Initialize a variable to store the sum
        int sum = 0;
        // Iterate through the array and add each element to the sum
        for (int number : numbers) {
            sum += number;
        }
        // Print the sum of the array
        System.out.println("Sum of the array: " + sum);
    }
}
