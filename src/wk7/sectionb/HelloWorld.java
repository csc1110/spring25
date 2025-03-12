package wk7.sectionb;

public class HelloWorld {
    private static int width = 5;
    public static String sandwich(String a, String b){
        return a + b;
    }
    public static void main(String[] args) {
        //System.out.println(this);
        System.out.println("Hello world.");
        sandwich("foo","bar");
        System.out.println(width);
        Rectangle r1 = new Rectangle(3,4,"blue");
        r1.getHeight();


    }
}
