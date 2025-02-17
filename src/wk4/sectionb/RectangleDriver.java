package wk4.sectionb;

public class RectangleDriver {
    public static void main(String[] args) {
        Rectangle r1;
        Rectangle r2;

        r1 = new Rectangle();
        r2 = new Rectangle();


        r1.setSides(3, 4);
        r2.setWidth(-9);
        r2.setHeight(42);

        System.out.println("r1");
        r1.printValues();
        System.out.println("Area is "+r1.area());

        System.out.println("r2");
        r2.printValues();
        System.out.println("Area is "+r2.area());







    }
}
