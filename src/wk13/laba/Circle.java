package wk13.laba;

public class Circle implements Shape {
    private double radius;

    /**
     *
     * @param radius
     * @throws IllegalArgumentException if the radius is not positive
     */
    public Circle(double radius) {
        if(radius <= 0){
            throw new IllegalArgumentException("Invalid radius "+radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
