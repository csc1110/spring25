package wk13.sectionb;

public class ToStringExample {
    public static void main(String[] args) {
        int x = 42;
        Person p1 = new Person("Sam", 34);
        Person p2 = new Person("Max", 22);

        String v1 = String.valueOf(p1);
        String v2 = p1.toString();
        System.out.println(v1);
        System.out.println(v2);

        System.out.println(p1.toString());
        System.out.println(x);

        Hourly h1 = new Hourly("Jack", 55, 2, 25, 100);
        System.out.println(h1.toString());
    }
}
