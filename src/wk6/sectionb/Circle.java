package wk6.sectionb;

public class Circle {
    public static final double PI = 3.15;
    private final int radius;
    private String color;

    public Circle(int radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public int getRadius(){
        return radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return PI * Math.pow(radius,2);
    }
    public String display(){
        return "Circle "+ radius;
    }
    public boolean biggerThan(Circle other){
        return false;
    }

}
