package wk7.sectionb;

import wk7.tracing.Square;

public class StaticMethodExamples {
    public static void main(String[] args) {
        Math.abs(-4);
        Character.isDigit('o');
        Integer.parseInt("42");
        String.valueOf(1);
        System.out.println(Math.PI);

        Square s1 = new Square();
        Square s2 = new Square();
        s1.setSide(3);
        s2.setSide(4);

    }
}
