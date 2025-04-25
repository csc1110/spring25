package wk13.sectiona;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean validInput = false;
        do {
            System.out.println("Enter a whole number between " +
                    "1 and 10 inclusive");
            try {
                input = Integer.parseInt(scanner.next());
                if (input < 1 || input > 10) {
                    throw new IllegalArgumentException("Input value was " + input);
                    //System.out.println("Bad input");
                } else {
                    System.out.println("Entered value was " + input);
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. " +
                        "It must be a whole number. ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error input not in " +
                        "the correct range (1 to 10).");
                System.out.println(e.getMessage());
            }
        } while (!validInput);

    }
}
