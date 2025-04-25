package wk13.sectiona;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if(width <= 0 || height <= 0){
            throw new IllegalArgumentException("The width " +
                    "and height are incorrect("+width+"," + height+")");
        } else {
            this.width = width;
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double area(){
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
