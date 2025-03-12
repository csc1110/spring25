package wk6.sectionb;

import wk6.sectiona.Circle;

public class CircleDriver {
    public static void main(String[] args) {
        Circle c1 = new Circle(5, "blue");

        System.out.println(c1.getColor());
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.display());
    }
}
