package homework_week_7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet should be invalid entry
 */
public class Programme_8_PrintCityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().charAt(0);
        scanner.close();
        if (alphabet == 'A') {
            System.out.println("City: Atlanta");
        } else if (alphabet == 'B') {
            System.out.println("City: Boston");
        } else if (alphabet == 'C') {
            System.out.println("City: Chicago");
        } else if (alphabet == 'D') {
            System.out.println("City: Denver");
        } else if (alphabet == 'E') {
            System.out.println("City: Los Angeles");
        } else if (alphabet == 'F') {
            System.out.println("City: San Francisco");
        } else {
            System.out.println("Invalid entry. Please enter an alphabet from A to F.");
        }
    }
}
