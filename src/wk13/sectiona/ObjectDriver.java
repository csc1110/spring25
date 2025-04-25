package wk13.sectiona;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectDriver {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();

        objects.add(new Person("Jeff", 40));
        objects.add(new Hourly("Alex", 23, 1,15, 100));
        objects.add(new Weapons(15));

        Object o1 = new Person("Max", 20);
        Person p1 = new Salaried("Mike", 24, 2, 35_000);
        //tempA(new Person("Sally", 54));
        tempA(new Hourly("Sally", 54, 2, 34, 100));

        tempB(new Person("Sally", 54));
        tempB(new Hourly("Sally", 54, 2, 34, 100));
        tempB(new Scanner(System.in));
        tempB(new Weapons(15));
    }
    public static void tempA(Person p){
        System.out.println(p.getAge());
        System.out.println(p.getName());
        if(p instanceof Hourly) {
            ((Hourly)p).addHours(100);
        }
    }
    public static void tempB(Object o){
        System.out.println(o.toString());
        System.out.println(o.equals(o));
        int value = o.hashCode();
        if(o instanceof Person){
            ((Person)o).getName();
        }
    }
}
