package wk4.sectionb;

public class RectangleDriver2 {
    public static void main(String[] args) {
        //Initializing
        Rectangle r1 = new Rectangle();
        //Declare
        Rectangle r2;

        //Assign
        r2 = new Rectangle();

        r1.setSides(3, 4);
        r2.setSides(5);

        System.out.println("r1");
        r1.printValues();
        System.out.println("the area is "+r1.area());
        System.out.println("r2");
        r2.printValues();
        System.out.println("the area is "+r2.area());

        System.out.println("Is r1 bigger than r2 ");
        System.out.println(r1.biggerThan(r2));

        System.out.println("Is r2 bigger than r1 ");
        System.out.println(r2.biggerThan(r1));

        //




    }
}
