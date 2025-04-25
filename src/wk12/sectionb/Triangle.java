package wk12.sectionb;

public class Triangle implements Shape {
    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area(){
        return width * height * 0.5;
    }

    @Override
    public boolean isSame(Shape s){
        return this.area() == s.area();
    }
}
