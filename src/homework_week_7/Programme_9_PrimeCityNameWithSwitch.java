package homework_week_7;
/**
 *Same as above program-8 using switch statement
 */
import java.util.Scanner;

public class Programme_9_PrimeCityNameWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().charAt(0);
        scanner.close();
        switch (alphabet) {
            case 'A':
                System.out.println("City: Atlanta");
                break;
            case 'B':
                System.out.println("City: Boston");
                break;
            case 'C':
                System.out.println("City: Chicago");
                break;
            case 'D':
                System.out.println("City: Denver");
                break;
            case 'E':
                System.out.println("City: Los Angeles");
                break;
            case 'F':
                System.out.println("City: San Francisco");
                break;
            default:
                System.out.println("Invalid entry. Please enter an alphabet from A to F.");
        }
    }
}
