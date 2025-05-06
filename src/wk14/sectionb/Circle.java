package wk14.sectionb;

public class Circle {
    private double radius;

    public Circle(double radius)
            throws InvalidRadiusExceptionChecked{
        if (radius < 0) {
            throw new InvalidRadiusExceptionChecked("Invalid radius " + radius);
        }
        this.radius = radius;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
