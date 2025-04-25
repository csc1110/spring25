package wk13.labb;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionExamples2 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many shapes?");
        try {
            int numShapes = scanner.nextInt();
            if(numShapes <= 0){
                throw new IllegalArgumentException("numShapes must be positive "+numShapes);
            }
            for (int i = 0; i < numShapes; i++) {
            //while(shapes.size() < numShapes){
                System.out.println("Shape number " + i);
                System.out.println("Enter the type and value in" +
                        "the form of type:value ");
                String input = scanner.next();
                //["1", "4"] = "1:4".split(":")
                String[] tokens = input.split(":");
                try{
                    shapes.add(makeShape(tokens));
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Error with length of input "+input);
                } catch (InvalidTypeException e){
                    System.out.println("Error with Shape type "+input);
                } catch (NumberFormatException e){
                    System.out.println("Error with value");
                }
            }
            System.out.println(shapes);
        } catch (InputMismatchException e){
            System.out.println("Invalid numShapes. " +
                    "Must be a whole number.");
        } catch (IllegalArgumentException e){
            System.out.println("Error with numShapes");
            System.out.println(e.getMessage());
        }
    }


    /**
     *
     * @param tokens
     * @return
     * @throws InvalidTypeException if the type is not 1 or 2
     */
    private static Shape makeShape(String[] tokens)
            throws InvalidTypeException{
        //don't deal with exception here
        if (tokens[0].equals("1")) {
            return makeCircle(tokens[1]);
        } else if (tokens[0].equals("2")) {
            return makeSquare(tokens[1]);
        } else {
            throw new InvalidTypeException("Type is not correct "+tokens[0]);
        }

    }
    private static Circle makeCircle(String value){
        double radius = Double.parseDouble(value);

        return new Circle(radius);

    }
    private static Square makeSquare(String value){
        double side = Double.parseDouble(value);
        return new Square(side);
    }
}
