package wk12.seciona;

public interface Shape {

    /**
     * Returns the area of the shape
     * @return area of the shape
     */
    double area();

    /**
     * Checks if the passed in shape
     * has the same area
     * @param s Another Shape to check
     * @return if areas are the same
     */
    boolean isSame(Shape s);

}