package wk13.laba;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        if(side <= 0){
            throw new IllegalArgumentException("Invalid side "+side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
