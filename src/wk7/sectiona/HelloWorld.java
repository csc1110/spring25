package wk7.sectiona;

public class HelloWorld {

    public static String sandwich(String a, String b){
        return a + b;
    }
    public double circleArea(int h, int b){
        return  h * b * 0.5;
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        sandwich("foo","bar");
        //circleArea(3,4);
        MyMath m1 = new MyMath();
        m1.getTemp();
    }
}
