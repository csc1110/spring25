package wk7.sectionb;

public class MyMath {
    public static final double MY_PI = 3.15;
    public String temp;
    public void setTemp(String temp) {
        this.temp = temp;
    }
    public String getTemp() {
        System.out.println(this);
        this.setTemp("foo");
        System.out.println(temp);
        MyMath.add(2,4);
        System.out.println(MyMath.MY_PI);
        return temp;
    }
    public static double add(int a, int b){
        //this.getTemp();
        //System.out.println(this);
        //System.out.println(temp);

        return a + b;
    }
    public static double square(int a, int b){
        return a * b;
    }
    public static double circleArea(int radius){
        return MY_PI * square(radius, radius);
    }
}
