package wk7.sectionb;

public class MyMathDriver {
    public static void main(String[] args) {
        //MyMath m1 = new MyMath();
        //m1.add(1,2);
        MyMath.add(1,2);
        System.out.println(MyMath.MY_PI);

        MyMath m1 = new MyMath();
        m1.setTemp("foo");

        MyMath m2 = new MyMath();
        m2.setTemp("bar");


        System.out.println("m2 in the driver");
        System.out.println(m2);
        System.out.println("M2 in the getTemp()");
        System.out.println(m2.getTemp());

        System.out.println("m1 in the driver");
        System.out.println(m1);
        System.out.println("M1 in the getTemp()");
        System.out.println(m1.getTemp());



    }
}
