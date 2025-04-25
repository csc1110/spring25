package wk13.sectiona;

public class ToStringExample {
    public static void main(String[] args) {
        Person p1 = new Person("Jane", 25);
        Person p2 = new Person("Bob", 18);

        String value = String.valueOf(p1);
        System.out.println(value);

        String value2 = p1.toString();
        System.out.println(value2);

        System.out.println(p1);
        System.out.println(p2);
        Hourly h1 =
                new Hourly("Sam", 35, 1, 15, 50);
        System.out.println(h1.toString());

    }
}
