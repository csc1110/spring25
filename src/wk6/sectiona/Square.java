/*
 * Course: CSC1110 - 021
 * Fall 2023
 * Lab 2 - My First Program
 * Name: Chris Taylor
 * Created: 9/13/2023
 */

package wk6.sectiona;

import java.util.Scanner;

/**
 * Class the represents a Square with a
 * perimeter.
 */
public class Square {
    /**
     * Mininum perimeter of a Square. If a
     * Square is made ...
     */
    public static final int MIN_PERIMETER = 10;
    private double perimeter;

    /**
     * Constructor for a Square that takes in
     * its perimeter.
     *
     * @param perimeter Perimeter of the Square.
     */
    public Square(double perimeter){
        this.perimeter = perimeter;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    /**
     * Returns the area of this Square
     * @return Area of the square.
     */
    public double area(){
        return getSide() * getSide();
    }
    private double getSide(){
        return perimeter/4;
    }

}
