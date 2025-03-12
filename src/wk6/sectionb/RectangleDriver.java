package wk6.sectionb;

public class RectangleDriver {
    public static void main(String[] args) {
        Rectangle r1;
        r1 = new Rectangle(5);
        Rectangle r2 = new Rectangle(3,4);
        //r1.setWidth(3);
        //r1.setHeight(4);
        System.out.println("r1");
        r1.printValues();
        System.out.println("r2");
        r2.printValues();

    }
}
