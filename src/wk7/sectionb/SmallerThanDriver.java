package wk7.sectionb;

public class SmallerThanDriver {
    public static void main(String[] args) {
        Rectangle r1;
        r1 = new Rectangle(3, 4, "blue");
        Rectangle r2 = new Rectangle(10, 10, "red");
        Rectangle r3;
        r3 = r1;

        //this was r1
        //other was r2
        r1.smallerThan(r2);
        //this was r2
        //other was r1
        r2.smallerThan(r1);
    }
}
