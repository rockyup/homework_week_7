package homework_week_7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12_FindInputValue {
    public static void main(String[] args) {
        //scanner difine
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String input = scanner.nextLine();
        scanner.close(); // scanner close
        if (input.length() == 1) {
            char ch = input.charAt(0);
            if (Character.isDigit(ch)) {
                System.out.println("Input is a number.");
            } else if (Character.isLetter(ch)) {
                System.out.println("Input is an alphabet.");
            } else {
                System.out.println("Input is a symbol.");
            }
        } else {
            System.out.println("Invalid input. Please enter a single character.");
        }
    }
}
