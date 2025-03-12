package wk7.sectiona;

import java.util.Objects;

public class MyMath {
    public final static double MY_PI = 3.15;
    public String temp;

    public void setTemp(String temp){
        this.temp = temp;
    }
    public String getTemp(){
        System.out.println(this);
        MyMath.add(2,3);
        this.setTemp("foobar");
        return temp;
    }
    public static double add(double left, double right){
        //System.out.println(this);
        return left + right;
    }
    public static double square(double value){
        return value * value;
    }
    public static double circleRadius(double radius){
        return MyMath.square(radius) * MyMath.MY_PI;
    }
}
