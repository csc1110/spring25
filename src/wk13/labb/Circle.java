package wk13.labb;

public class Circle implements Shape {
    private double radius;

    /**
     *
     * @param radius
     * @throws IllegalArgumentException if the radius <= 0
     */
    public Circle(double radius) {
        if(radius <= 0){
            throw new IllegalArgumentException("Invalid raiuds;");
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
