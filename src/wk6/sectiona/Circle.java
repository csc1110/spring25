package wk6.sectiona;

public class Circle {
    public static final double PI = 3.14;
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
        return Math.PI * radius * radius;
    }
    public String display(){
        return "Circle" + radius;
    }
    public boolean biggerThan(Circle other){
        return false;
    }

}
