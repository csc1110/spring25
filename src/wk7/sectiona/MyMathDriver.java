package wk7.sectiona;

public class MyMathDriver {
    public static void main(String[] args) {

        System.out.println(MyMath.add(3, 4));
        System.out.println(MyMath.MY_PI);

        MyMath m1 = new MyMath();
        m1.setTemp("foo");
        MyMath m2 = new MyMath();
        m2.setTemp("bar");

        System.out.println(m1.getTemp());
        System.out.println(m2.getTemp());

        System.out.println("Print m1 from driver");
        System.out.println(m1);
        System.out.println("Print m2 from driver");
        System.out.println(m2);

        System.out.println(m1.getTemp());
        System.out.println(m2.getTemp());


    }
}
