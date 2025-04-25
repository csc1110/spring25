package wk13.sectionb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number " +
                "b/t 1 and 10 inclusive");
        try {
            int input = Integer.parseInt(scanner.next());
            if(input < 1 || input > 10){
                throw new IllegalArgumentException("\u001B[31mNumber should be b/t 1 and 10: "+input);
                //System.out.println("Number should be b/t 1 and 10");
            } else {
                System.out.println("The entered value was "
                        + input);
            }
        } catch (NumberFormatException e){
            System.out.println("Error with the input.");
            System.out.println("Input needs to be a whole number.");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Input must be in the correct range.");
            System.out.println(e.getMessage());
        }

    }
}
